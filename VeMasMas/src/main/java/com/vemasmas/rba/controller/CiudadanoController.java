package com.vemasmas.rba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vemasmas.rba.entity.CiudadanoDAO;
import com.vemasmas.rba.service.CiudadanoService;

@Controller
public class CiudadanoController {
	
	@Autowired
	private CiudadanoService ciudadanoService;
	
	@GetMapping({"/ciudadanos","/"})
	public String consultarCiudadanos(Model model) {
		CiudadanoDAO ciudadanoDAO = new CiudadanoDAO();
		model.addAttribute("ciudadanos",ciudadanoService.listarCiudadanos());
		model.addAttribute("nuevoCiudadano",ciudadanoDAO);
		return "Ciudadanos";
	}
	
	@PostMapping("/crearCiudadanos")
	public String guardarCiudadano(@ModelAttribute("nuevoCiudadano") CiudadanoDAO ciudadano) {
		ciudadanoService.guardarCiudadano(ciudadano);
		return "redirect:/ciudadanos";
	}
	
	@GetMapping("update/ciudadanos/{id}")
	public String editarCiudadano(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("ciudadano",ciudadanoService.obtenerCiudadanobyId(id));
		return "CiudadanosEdit";
	}

	@PostMapping("/ciudadanos/{id}")
	public String actualizarCiudadano(@PathVariable Long id, @ModelAttribute("estudiante") CiudadanoDAO ciudadano, Model modelo) {
		CiudadanoDAO ciudadanoExist = ciudadanoService.obtenerCiudadanobyId(id);
		ciudadanoExist.setId(id);
		ciudadanoExist.setNombre(ciudadano.getNombre());
		ciudadanoExist.setApellido_paterno(ciudadano.getApellido_paterno());
		ciudadanoExist.setApellido_materno(ciudadano.getApellido_materno());
		ciudadanoService.actualizarCiudadano(ciudadanoExist);
		return "redirect:/ciudadanos";
	}

	@GetMapping("delete/ciudadanos/{id}")
	public String eliminarCiudadano(@PathVariable Long id) {
		ciudadanoService.eliminarCiudadano(id);
		return "redirect:/ciudadanos";
	}
}

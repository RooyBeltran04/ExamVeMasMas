package com.vemasmas.rba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vemasmas.rba.entity.DomicilioDAO;
import com.vemasmas.rba.service.CiudadanoService;
import com.vemasmas.rba.service.DomicilioService;

@Controller
public class DomicilioController {
	
	@Autowired
	private DomicilioService domicilioService;
	
	@Autowired
	private CiudadanoService ciudadanoService;
	
	@GetMapping({"/domicilios","/"})
	public String consultarDomicilios(Model model) {
		DomicilioDAO domicilioDAO = new DomicilioDAO();
		model.addAttribute("domicilios",domicilioService.listarDomicilios());
		model.addAttribute("nuevoDomicilio",domicilioDAO);
		return "Domicilios";
	}
	
	@PostMapping("/crearDomicilios")
	public String guardarDomicilio(@ModelAttribute("nuevoDomicilio") DomicilioDAO domicilio) {
		domicilioService.guardarDomicilio(domicilio);
		return "redirect:/domicilios";
	}
	
	@GetMapping("update/domicilio/{id}")
	public String editarDomicilio(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("domicilio",domicilioService.obtenerDomiciliobyId(id));
		return "DomiciliosEdit";
	}

	@PostMapping("/domicilios/{id}")
	public String actualizarDomicilio(@PathVariable Long id, @ModelAttribute("domicilio") DomicilioDAO domicilio, Model modelo) {
		DomicilioDAO domicilioExist = domicilioService.obtenerDomiciliobyId(id);
		domicilioExist.setId(id);
		domicilioExist.setCalle(domicilio.getCalle());
		domicilioExist.setCiudadano(ciudadanoService.obtenerCiudadanobyId(domicilio.getCiudadano().getId()));
		domicilioExist.setColonia(domicilio.getColonia());
		domicilioExist.setMunicipio(domicilio.getMunicipio());
		domicilioExist.setEstado(domicilio.getEstado());
		domicilioExist.setCodigo_postal(domicilio.getCodigo_postal());
		domicilioService.actualizarDomicilio(domicilioExist);
		return "redirect:/domicilios";
	}

	@GetMapping("delete/domicilio/{id}")
	public String eliminarDomicilio(@PathVariable Long id) {
		domicilioService.eliminarDomicilio(id);
		return "redirect:/domicilios";
	}
}

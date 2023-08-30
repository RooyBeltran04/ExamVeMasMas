package com.vemasmas.rba.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vemasmas.rba.entity.CiudadanoDAO;
import com.vemasmas.rba.repository.CiudadanoRepository;
import com.vemasmas.rba.service.CiudadanoService;

@Service
public class CiudadanoImpl implements CiudadanoService{
	
	@Autowired
	private CiudadanoRepository ciudadanoRepository;

	@Override
	public List<CiudadanoDAO> listarCiudadanos() {
		return ciudadanoRepository.findAll();
	}

	@Override
	public CiudadanoDAO guardarCiudadano(CiudadanoDAO ciudadanoDAO) {
		return ciudadanoRepository.save(ciudadanoDAO);
	}

	@Override
	public CiudadanoDAO obtenerCiudadanobyId(Long id) {
		return ciudadanoRepository.findById(id).get();
	}

	@Override
	public CiudadanoDAO actualizarCiudadano(CiudadanoDAO ciudadanoDAO) {
		return ciudadanoRepository.save(ciudadanoDAO);
	}

	@Override
	public void eliminarCiudadano(Long id) {
		ciudadanoRepository.deleteById(id);
	}

}

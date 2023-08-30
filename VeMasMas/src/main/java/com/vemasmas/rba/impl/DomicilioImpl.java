package com.vemasmas.rba.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vemasmas.rba.entity.DomicilioDAO;
import com.vemasmas.rba.repository.DomicilioRepository;
import com.vemasmas.rba.service.DomicilioService;

@Service
public class DomicilioImpl implements DomicilioService{
	
	@Autowired
	private DomicilioRepository domicilioRepository;

	@Override
	public List<DomicilioDAO> listarDomicilios() {
		return domicilioRepository.findAll();
	}

	@Override
	public DomicilioDAO guardarDomicilio(DomicilioDAO domicilioDAO) {
		return domicilioRepository.save(domicilioDAO);
	}

	@Override
	public DomicilioDAO obtenerDomiciliobyId(Long id) {
		return domicilioRepository.findById(id).get();
	}

	@Override
	public DomicilioDAO actualizarDomicilio(DomicilioDAO domicilioDAO) {
		return domicilioRepository.save(domicilioDAO);
	}

	@Override
	public void eliminarDomicilio(Long id) {
		domicilioRepository.deleteById(id);
	}
}

package com.vemasmas.rba.service;

import java.util.List;

import com.vemasmas.rba.entity.DomicilioDAO;

/**
 * @author rba
 *
 */
public interface DomicilioService {

	public List<DomicilioDAO> listarDomicilios();
	public DomicilioDAO guardarDomicilio(DomicilioDAO ciudadanoDAO);
	public DomicilioDAO obtenerDomiciliobyId(Long id);
	public DomicilioDAO actualizarDomicilio(DomicilioDAO ciudadanoDAO);
	public void eliminarDomicilio(Long id);
}

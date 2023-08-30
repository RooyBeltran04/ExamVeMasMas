package com.vemasmas.rba.service;

import java.util.List;
import com.vemasmas.rba.entity.CiudadanoDAO;

/**
 * @author rba
 *
 */
public interface CiudadanoService {

	public List<CiudadanoDAO> listarCiudadanos();
	public CiudadanoDAO guardarCiudadano(CiudadanoDAO ciudadanoDAO);
	public CiudadanoDAO obtenerCiudadanobyId(Long id);
	public CiudadanoDAO actualizarCiudadano(CiudadanoDAO ciudadanoDAO);
	public void eliminarCiudadano(Long id);
}

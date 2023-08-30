package com.vemasmas.rba.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



/**
 * @author rba
 *
 */
@Entity
@Table(name = "ciudadanos")
public class CiudadanoDAO {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="nombre", nullable=true, length=50)
    private String nombre;
	
	@Column(name="apellido_paterno", nullable=true, length=50)
    private String apellido_paterno;
	
	@Column(name="apellido_materno", nullable=true, length=50)
    private String apellido_materno;

	public CiudadanoDAO() {
		super();
	}

	public CiudadanoDAO(Long id, String nombre, String apellido_paterno, String apellido_materno) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	@Override
	public String toString() {
		return "CiudadanoDAO [id=" + id + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno
				+ ", apellido_materno=" + apellido_materno + "]";
	}

}

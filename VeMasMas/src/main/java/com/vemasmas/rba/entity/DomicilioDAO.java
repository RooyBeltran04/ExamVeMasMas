package com.vemasmas.rba.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author rba
 *
 */
@Entity
@Table(name = "domicilios")
public class DomicilioDAO implements Serializable{

	/**
	 * @serial serialVersionUID
	 */
	private static final long serialVersionUID = 673036636187617498L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="calle", nullable=true, length=100)
    private String calle;
	
	@Column(name="colonia", nullable=true, length=50)
    private String colonia;
	
	@Column(name="municipio", nullable=true, length=50)
    private String municipio;
	
	@Column(name="estado", nullable=true, length=50)
    private String estado;
	
	@Column(name="codigo_postal", nullable=true, length=20)
    private String codigo_postal;
	
	@ManyToOne
    @JoinColumn(name = "ciudadano_id")
    private CiudadanoDAO ciudadano;

	public DomicilioDAO() {
		super();
	}

	/**
	 * @param id
	 * @param calle
	 * @param colonia
	 * @param municipio
	 * @param estado
	 * @param codigo_postal
	 * @param ciudadano
	 */
	public DomicilioDAO(Long id, String calle, String colonia, String municipio, String estado, String codigo_postal,
			CiudadanoDAO ciudadano) {
		super();
		this.id = id;
		this.calle = calle;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
		this.codigo_postal = codigo_postal;
		this.ciudadano = ciudadano;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public CiudadanoDAO getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(CiudadanoDAO ciudadano) {
		this.ciudadano = ciudadano;
	}

	@Override
	public String toString() {
		return "DomicilioDAO [id=" + id + ", calle=" + calle + ", colonia=" + colonia + ", municipio=" + municipio
				+ ", estado=" + estado + ", codigo_postal=" + codigo_postal + ", ciudadano=" + ciudadano + "]";
	}

}

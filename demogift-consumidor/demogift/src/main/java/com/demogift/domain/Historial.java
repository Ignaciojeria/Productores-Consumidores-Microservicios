package com.demogift.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Historial {
	
	@Id
	private Long id;
	
	@Column
	private Long idUsuario;
	@Column
	private Long idClub;
	@Column
	private Double idturnoComprado;
	@Column
	private String codigoUsado;
	@Column
	private String emailUsuario;
	@Column
	private String nombreUsuario;
	@Column
	private LocalDate fechaUso;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getIdClub() {
		return idClub;
	}
	public void setIdClub(Long idClub) {
		this.idClub = idClub;
	}
	public Double getIdturnoComprado() {
		return idturnoComprado;
	}
	public void setIdturnoComprado(Double idturnoComprado) {
		this.idturnoComprado = idturnoComprado;
	}
	public String getCodigoUsado() {
		return codigoUsado;
	}
	public void setCodigoUsado(String codigoUsado) {
		this.codigoUsado = codigoUsado;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public LocalDate getFechaUso() {
		return fechaUso;
	}
	public void setFechaUso(LocalDate fechaUso) {
		this.fechaUso = fechaUso;
	}
	
}

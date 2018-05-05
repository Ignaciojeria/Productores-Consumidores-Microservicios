package com.demogift.domain;


import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ReglaDia {
	
	/**
	 * Reglas para saber que días y a que rango de horas de aplican los cupones a determinados dias de una campaña
	 * Las campañas pueden tener muchas reglas.
	 * Cada regla representa un día en particular y un rango de horas de ese día en particular.
	 * Los rangos de horas vienen embebidos dentro del día de la regla
	 */
	
	@Id
	private Long id;
	
	//Ejemplo: El cupon aplica de las 08:00hs a las 16:00hs el día Lunes
	@Column
	private String descripcion;
	
	//Una regla puede registrar 1 día y a ese día se le va a aplicar un rango de horas
	@OneToOne
	private Dia dia;
	
	//A qué horas va a estar disponible 
	@JsonFormat(pattern = "HH:mm:ss")
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "regla_dia_horas", joinColumns = @JoinColumn(name = "regla_dia_id",referencedColumnName = "id"))
	private Set<LocalTime> horas=new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Set<LocalTime> getHoras() {
		return horas;
	}

	public void setHoras(Set<LocalTime> horas) {
		this.horas = horas;
	}

}

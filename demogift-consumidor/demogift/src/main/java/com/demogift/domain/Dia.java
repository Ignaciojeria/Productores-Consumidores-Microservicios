package com.demogift.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Dia {
	
	@Id
	private Integer id;
	
	//weekDay es la representación numerica de un día en mysql
	@Column
	private Integer weekDay;
	
	//Nombre de esa representacion numerica (nombre del día)
	@Enumerated(EnumType.STRING)
	private NombreDia nombreDia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(Integer weekDay) {
		this.weekDay = weekDay;
	}

	public NombreDia getNombreDia() {
		return nombreDia;
	}

	public void setNombreDia(NombreDia nombreDia) {
		this.nombreDia = nombreDia;
	}

}

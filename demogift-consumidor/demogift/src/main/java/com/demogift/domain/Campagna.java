package com.demogift.domain;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.apache.tomcat.util.digester.Rule;

@Entity
public class Campagna {
	/*La campaña tiene las siguientes reglas:
	 * Tiene un arreglo de clubes a la cual pertenece.
	 * La campaña establece un horario y unas fechas en las cuales se pueden aplicar los descuentos.
	 * Si el club está dentro de los horarios y las fechas de esa campaña, entonces, se puede aplicar el saldo a favor a la venta.
	 * 
	 * RESTRICCIONES CON RESPECTO A LA APLICACIÓN DEL SALDO A FAVOR SOBRE EL PRECIO:
	 * a) El saldo a favor no puede exeder la diferencia que existe entre el precio del club y el precio del club_fixed price
	 * b) El saldo a favor nunca debería 
	 */
	
	@Id
	private Long id;
	
	//A que clubes aplica la campaña
	@ManyToMany
	@JoinTable(name = "campagna_clubs", joinColumns = @JoinColumn(name = "campagna_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "club_id", referencedColumnName = "id"))
	private Set<Club> clubs;
	
	@ManyToMany
	@JoinTable(name = "campagna_regla_dias", joinColumns = @JoinColumn(name = "campagna_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "regla_id", referencedColumnName = "id"))
	private Set<ReglaDia> reglaDias;
	
	@Column
	private Double montoInicial;
	
	@Column
	private Double montoRestante;
	
	@Column
	private Double montoUsado;
    
    /*A que horas se va a aplicar la campaña
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "campagna_horas", joinColumns = @JoinColumn(name = "campagna_id",referencedColumnName = "id"))
	private Set<LocalDateTime> horas=new HashSet<>();*/
    
    //Fecha inicio de campaña
    @Column
    private LocalDate fechaInicio;
    
    //Fecha fin de campaña
    @Column
    private LocalDate fechaFin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Club> getClubs() {
		return clubs;
	}

	public void setClubs(Set<Club> clubs) {
		this.clubs = clubs;
	}

	public Set<ReglaDia> getReglaDias() {
		return reglaDias;
	}

	public void setReglaDias(Set<ReglaDia> reglaDias) {
		this.reglaDias = reglaDias;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getMontoInicial() {
		return montoInicial;
	}

	public void setMontoInicial(Double montoInicial) {
		this.montoInicial = montoInicial;
	}

	public Double getMontoRestante() {
		return montoRestante;
	}

	public void setMontoRestante(Double montoRestante) {
		this.montoRestante = montoRestante;
	}

	public Double getMontoUsado() {
		return montoUsado;
	}

	public void setMontoUsado(Double montoUsado) {
		this.montoUsado = montoUsado;
	}
    

}

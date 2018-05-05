package com.demogift.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GiftCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//id de usuario que cargó su giftCard en el perfil
	@Column 
	private Long userId;
	
	//Grupo al que pertenece esta gift_card
	@OneToOne
	private Grupo grupo;
	
	//Campaña a la que pertenece esta gift_card
	@OneToOne
	private Campagna campagna;
	
	@Enumerated(EnumType.STRING)
	private Material material;
	
	
	//Saldo disponible de esta gift_card
	@Column
	private Double saldo;
	
	//identificar si la gift_card está disponible para su uso
	@Column
	private Boolean habilitado;
	
	//Login del usuario al que le pertenece la giftCard
	@Column
	private String email;
	
	//Identificar si se asoció esta gift_card a un usuario.
	@Enumerated(EnumType.STRING)
	private EstadoGiftCard estado;
	
	//Código de la gift_card
	@Column(unique=true)
	private String codigo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Campagna getCampagna() {
		return campagna;
	}

	public void setCampagna(Campagna campagna) {
		this.campagna = campagna;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
	

	public EstadoGiftCard getEstado() {
		return estado;
	}

	public void setEstado(EstadoGiftCard estado) {
		this.estado = estado;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}

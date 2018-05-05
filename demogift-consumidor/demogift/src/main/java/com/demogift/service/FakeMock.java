package com.demogift.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demogift.domain.Campagna;
import com.demogift.domain.Club;
import com.demogift.domain.Dia;
import com.demogift.domain.EstadoGiftCard;
import com.demogift.domain.GiftCard;
import com.demogift.domain.Grupo;
import com.demogift.domain.Material;
import com.demogift.domain.NombreDia;
import com.demogift.domain.ReglaDia;
import com.demogift.repository.CampagnaRepository;
import com.demogift.repository.ClubRepository;
import com.demogift.repository.DiaRepository;
import com.demogift.repository.GiftCardRepository;
import com.demogift.repository.GrupoRepository;
import com.demogift.repository.ReglaRepository;
import com.demogift.service.helper.RandomString;

@Service
public class FakeMock {
	@Autowired
	private GiftCardRepository giftCardRepository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	@Autowired
	private ClubRepository clubRepository;
	
	@Autowired
	private CampagnaRepository campagnaRepository;
	
	@Autowired
	private ReglaRepository reglaRepository;
	
	@Autowired
	private DiaRepository diaRepository;
	
	
	private void crearReglas(List<Dia> dias) {
		List<ReglaDia> reglas=new ArrayList<>();
		
		ReglaDia reglaLunes =new ReglaDia();
		reglaLunes.setId(1L);
		reglaLunes.setDia(dias.get(0));
		reglaLunes.setDescripcion("Lunes de 8:00hs hasta 16:00hs");
		
		ReglaDia reglaMartes =new ReglaDia();
		reglaMartes.setId(2L);
		reglaMartes.setDia(dias.get(1));
		reglaMartes.setDescripcion("Martes de 8:00hs hasta 16:00hs");
		
		ReglaDia reglaMiercoles =new ReglaDia();
		reglaMiercoles.setId(3L);
		reglaMiercoles.setDia(dias.get(2));
		reglaMiercoles.setDescripcion("Miercoles de 8:00hs hasta 16:00hs");
		
		ReglaDia reglaJueves =new ReglaDia();
		reglaJueves.setId(4L);
		reglaJueves.setDia(dias.get(3));
		reglaJueves.setDescripcion("Jueves de 8:00hs hasta 16:00hs");
		
		ReglaDia reglaViernes =new ReglaDia();
		reglaViernes.setId(5L);
		reglaViernes.setDia(dias.get(4));
		reglaViernes.setDescripcion("Viernes de 8:00hs hasta 16:00hs");
		
		ReglaDia reglaSabado =new ReglaDia();
		reglaSabado.setId(6L);
		reglaSabado.setDia(dias.get(5));
		reglaSabado.setDescripcion("Sabado de 8:00hs hasta 16:00hs");
		
		ReglaDia reglaDomingo =new ReglaDia();
		reglaDomingo.setId(7L);
		reglaDomingo.setDia(dias.get(6));
		reglaDomingo.setDescripcion("Sabado de 8:00hs hasta 16:00hs");
		
		reglas.add(reglaLunes);
		reglas.add(reglaMartes);
		reglas.add(reglaMiercoles);
		reglas.add(reglaJueves);
		reglas.add(reglaViernes);
		reglas.add(reglaSabado);
		reglas.add(reglaDomingo);
		reglaRepository.saveAll(reglas);
	}
	
	
	private Set<Club> crearClubes(){
		Set<Club> clubes=new HashSet<>();
		
		Club roma=new Club();
		roma.setId(1L);
		roma.setNombre("Roma");
		
		Club enea=new Club();
		enea.setId(2L);
		enea.setNombre("ENEA");
		
		Club mundoFutbolito=new Club();
		mundoFutbolito.setId(3L);
		mundoFutbolito.setNombre("Mundo Futbolito");
		
		Club monumentalSoccer= new Club();
		monumentalSoccer.setId(5L);
		monumentalSoccer.setNombre("Monumental Soccer");
		
		clubes.add(roma);
		clubes.add(enea);
		clubes.add(mundoFutbolito);
		clubes.add(monumentalSoccer);
		clubRepository.saveAll(clubes);
		return clubes;
	}
	
	private List<Dia> crearDias() {
		
		List<Dia> dias= new ArrayList<>();
		
		Dia lunes=new Dia();
		lunes.setId(1);
		lunes.setWeekDay(0);
		lunes.setNombreDia(NombreDia.Lunes);
		
		Dia martes=new Dia();
		martes.setId(2);
		martes.setWeekDay(1);
		martes.setNombreDia(NombreDia.Martes);
		
		Dia miercoles=new Dia();
		miercoles.setId(3);
		miercoles.setWeekDay(2);
		miercoles.setNombreDia(NombreDia.Miercoles);
		
		Dia jueves=new Dia();
		jueves.setId(4);
		jueves.setWeekDay(3);
		jueves.setNombreDia(NombreDia.Jueves);
		
		Dia viernes=new Dia();
		viernes.setId(5);
		viernes.setWeekDay(4);
		viernes.setNombreDia(NombreDia.Viernes);
		
		Dia sabado=new Dia();
		sabado.setId(6);
		sabado.setWeekDay(5);
		sabado.setNombreDia(NombreDia.Sabado);
		
		Dia domingo=new Dia();
		domingo.setId(7);
		domingo.setWeekDay(6);
		domingo.setNombreDia(NombreDia.Domingo);
		
		dias.add(lunes);
		dias.add(martes);
		dias.add(miercoles);
		dias.add(jueves);
		dias.add(viernes);
		dias.add(sabado);
		dias.add(domingo);
		
		diaRepository.saveAll(dias);
	
		return dias;
		
	}
	
	
	private Campagna crearCampagna(Set<Club> clubes){
		Campagna campagna= new Campagna();
		campagna.setId(1L);
		campagna.setFechaInicio(LocalDate.of(2018,Month.APRIL,1));
		campagna.setFechaFin(LocalDate.of(2018,Month.MAY,1));
		campagna.setMontoInicial(3000000D);
		campagna.setMontoRestante(3000000D);
		campagna.setMontoUsado(0D);
		campagna.setClubs(clubes);
		campagnaRepository.save(campagna);
		return campagna;
	}
	
	private List<Grupo>  crearGrupos () {
		List<Grupo> grupos=new ArrayList<>();
		Grupo grupoA= new Grupo();
		grupoA.setNombre("Grupo A");
		grupoA.setId(1L);
		Grupo grupoB= new Grupo();
		grupoB.setNombre("Grupo B");
		grupoB.setId(2L);
		Grupo grupoC= new Grupo();
		grupoC.setNombre("Grupo C");
		grupoC.setId(3L);
		grupos.add(grupoA);
		grupos.add(grupoB);
		grupos.add(grupoC);
		grupoRepository.saveAll(grupos);
		return grupos;
	}
	
	
	private void generarCodigos(Grupo grupo, Double saldo, int cantidad,Campagna campagna,Material material) {
		List<GiftCard> cards = new ArrayList<GiftCard>();
		for (int i = 0; i < cantidad; i++) {
		GiftCard giftCard= new GiftCard();
		giftCard.setSaldo(saldo);
		giftCard.setCodigo(new RandomString().randomUUID(10, 4, 'X'));
		giftCard.setGrupo(grupo);
		giftCard.setEstado(EstadoGiftCard.NoAsignada);
		giftCard.setHabilitado(false);
		giftCard.setMaterial(material);
		giftCard.setCampagna(campagna);
		cards.add(giftCard);
		}
		giftCardRepository.saveAll(cards);
	}
	
	//@PostConstruct
	private void construct() {
		//Creamos los días
		List <Dia> dias= crearDias();
		//Creamos las reglas y le asignamos los días
		crearReglas(dias);
		//Creamos los clubes
		Set<Club> clubes=crearClubes();
		//Creamos la campaña
		Campagna campagna= crearCampagna(clubes);
		
		//Creamos los grupos
		List<Grupo> grupos=crearGrupos();
		//El código de estas gift-cards se ingresa al perfil y está asociado al usuario.
		//
		//Grupo 1 de 10 gift_cards de 30000
		generarCodigos(grupos.get(0),3000D, 10,campagna, Material.Digital);
		//Grupo 2 de 20 giftCards de 30000
		generarCodigos(grupos.get(1), 3000D, 20,campagna,Material.Carton);
		//Grupo 3 de 30 giftCards de 30000
		generarCodigos(grupos.get(2), 3000D, 10,campagna,Material.Plastica);
	}
	
}

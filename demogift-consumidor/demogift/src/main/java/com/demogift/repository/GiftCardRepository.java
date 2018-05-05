package com.demogift.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demogift.domain.EstadoGiftCard;
import com.demogift.domain.GiftCard;

@Repository
public interface GiftCardRepository extends JpaRepository<GiftCard,Long> {
	
	Optional<GiftCard> findByCodigoAndEstado(String codigo, EstadoGiftCard estado);
}

package com.demogift.service;


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demogift.domain.EstadoGiftCard;
import com.demogift.domain.GiftCard;
import com.demogift.repository.GiftCardRepository;
import com.demogift.service.dto.FirmaGiftCardDto;


@Service
public class GiftCardService {
	
	@Autowired
	private GiftCardRepository giftCardRepository;
	
	public Boolean firmarGiftCard(FirmaGiftCardDto firmaGiftCardDto ) {
		Optional<GiftCard> opt= giftCardRepository.findByCodigoAndEstado(firmaGiftCardDto.getCodigo(),EstadoGiftCard.NoAsignada);
		//Todo si la giftCard no existe retornamos false
		if(!opt.isPresent())
			return false;
		
		GiftCard giftCard= opt.get();
		giftCard.setEmail(firmaGiftCardDto.getEmail());
		giftCard.setEstado(EstadoGiftCard.Asignada);
		giftCard.setUserId(firmaGiftCardDto.getUserId());
		giftCard.setHabilitado(Boolean.TRUE);
		giftCardRepository.save(giftCard);
		return true;
	}


}

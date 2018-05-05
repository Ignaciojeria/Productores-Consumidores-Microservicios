package com.demogift.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demogift.service.GiftCardService;
import com.demogift.service.dto.FirmaGiftCardDto;

@RestController
public class GiftCardRestController {
	
	@Autowired
	private GiftCardService giftCardService;
	
	@PostMapping("ms3/gift/firmarGiftCard")
	public Boolean firmarGiftCard(@RequestBody FirmaGiftCardDto firmaGiftCardDto) {
		return giftCardService.firmarGiftCard(firmaGiftCardDto);
	}

}

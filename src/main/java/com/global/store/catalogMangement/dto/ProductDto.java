package com.global.store.catalogMangement.dto;

import com.global.store.base.dto.BaseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends BaseDto<Long> {

	private String name;
	
	private double price;
	
	private double quantity;
	
	private String imgUrl; 
	

	private CategoryDto category;
	
}

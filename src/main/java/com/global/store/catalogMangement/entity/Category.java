package com.global.store.catalogMangement.entity;

import com.global.store.base.entity.BaseEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Category extends BaseEntity<Long>  {
	
	private String name;

	
}

package com.global.store.catalogMangement.repo;

import org.springframework.stereotype.Repository;

import com.global.store.base.repo.BaseRepo;
import com.global.store.catalogMangement.entity.Product;

@Repository
public interface ProductRepo extends BaseRepo<Product, Long> {

}

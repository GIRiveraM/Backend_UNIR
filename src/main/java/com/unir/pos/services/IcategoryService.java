package com.unir.pos.services;

import org.springframework.http.ResponseEntity;

import com.unir.pos.model.category;
import com.unir.pos.response.CategoryResponseRest;

public interface IcategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	
	public ResponseEntity<CategoryResponseRest> save(category category);

}

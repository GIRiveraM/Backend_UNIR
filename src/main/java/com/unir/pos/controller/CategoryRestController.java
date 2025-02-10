package com.unir.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unir.pos.model.category;
import com.unir.pos.response.CategoryResponseRest;
import com.unir.pos.services.IcategoryService;

@RestController
@RequestMapping("/api/unir")
public class CategoryRestController {

	@Autowired
	private IcategoryService service;
	
	
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> searchCategories(){
		
		ResponseEntity<CategoryResponseRest> response = service.search();
		return  response;
		
	}
	
	/**
	 * save categories
	 * @param category
	 * @return
	 */
	@PostMapping("/categories")
	public ResponseEntity<CategoryResponseRest> save(@RequestBody category category){
		
		 ResponseEntity<CategoryResponseRest> response = service.save(category);
		 return response;
		
	}
	
	
	/**
	 * get categories by id
	 * @param id
	 * @return
	 */
	@GetMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> searchCategoriesById(@PathVariable Long id){
		
		 ResponseEntity<CategoryResponseRest> response = service.searchById(id) ;
		 return response;
		
	}
	
}

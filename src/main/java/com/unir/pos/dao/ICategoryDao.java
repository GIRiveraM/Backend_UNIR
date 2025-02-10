package com.unir.pos.dao;

import org.springframework.data.repository.CrudRepository;

import com.unir.pos.model.category;

public interface ICategoryDao extends CrudRepository<category, Long>{

}

package com.unir.pos.response;

import java.util.List;

import com.unir.pos.model.category;

import lombok.Data;

@Data
public class CategoryResponse {
	private List<category> Category;
}

package com.dipak.service;

import java.util.List;

import com.dipak.model.Category;

public interface CategoryService {
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public Category removeCategory(Category cat);
	public Category viewCategory(Category cat);
	public List<Category> viewAllCategory();
}

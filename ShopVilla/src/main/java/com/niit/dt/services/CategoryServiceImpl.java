package com.niit.dt.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dt.dao.CategoryDao;
import com.niit.dt.model.Category;
@Service
	public class CategoryServiceImpl implements CategoryService{
@Autowired 
private CategoryDao categoryDao;	
public List<Category> getAllCategories()
{		return categoryDao.getAllCategories();
}
}

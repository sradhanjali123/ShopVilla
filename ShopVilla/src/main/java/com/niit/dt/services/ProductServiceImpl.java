package com.niit.dt.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dt.dao.ProductDao;
import com.niit.dt.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired	
private ProductDao productDao;
	public void saveProduct(Product product) {
	  productDao.saveProduct(product);
		
	}
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}

}

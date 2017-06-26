package com.niit.dt.services;

import java.util.List;

import com.niit.dt.model.Product;

public interface ProductService {
void saveProduct(Product product);

List<Product> getAllProducts();

Product getProductById(int id);

void deleteProduct(int id);
}

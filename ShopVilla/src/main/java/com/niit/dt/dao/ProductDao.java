package com.niit.dt.dao;
import java.util.List;

import com.niit.dt.model.Product;

public interface ProductDao {
void saveProduct(Product product);

List<Product> getAllProducts();

Product getProductById(int id);

void deleteProduct(int id);
}

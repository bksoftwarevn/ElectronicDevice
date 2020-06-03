package com.bksoftware.service;


import com.bksoftware.model.Product;

import java.util.List;

public interface ProductService extends BaseService<Product>{

    List<Product> findAllOrdered(String field, boolean isAsc);

    List<Product> findByPriceBetween(double lowest, double highest);

    List<Product> findByName(String text);

}

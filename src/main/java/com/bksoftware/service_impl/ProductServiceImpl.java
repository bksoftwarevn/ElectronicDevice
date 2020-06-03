package com.bksoftware.service_impl;

import com.bksoftware.dao.ProductDAO;
import com.bksoftware.model.Product;
import com.bksoftware.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    
    private ProductDAO dao;
    
    public ProductServiceImpl(){
        dao = new ProductDAO();
    }
    
    @Override
    public List<Product> findAllOrdered(String field, boolean isAsc) {
        try {
            return dao.findAllOrdered(field, isAsc);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("find all product ordered err");
            return null;
        }
    }

    @Override
    public List<Product> findByPriceBetween(double lowest, double highest) {
        try {
            return dao.findByPriceBetween(lowest, highest);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("find product by price err");
            return null;
        }
    }

    @Override
    public List<Product> findByName(String text) {
        try {
            return dao.findByName(text);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("find product by name err");
            return null;
        }
    }

    @Override
    public List<Product> findAll() {
        try {
            return dao.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("find all product err");
            return null;
        }
    }

    @Override
    public Product findById(int id) {
        try {
            return dao.findById(id);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("find product by id err");
            return null;
        }
    }

    @Override
    public Product upload(Product product) {
        try {
            return dao.upload(product);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("upload product err");
            return null;
        }
    }

    @Override
    public Product update(Product product) {
        try {
            return dao.upload(product);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("update product err");
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            return dao.delete(id);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("delete product err");
            return false;
        }
    }
}

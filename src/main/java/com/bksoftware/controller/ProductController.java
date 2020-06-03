package com.bksoftware.controller;

import com.bksoftware.model.DataResult;
import com.bksoftware.model.Product;
import com.bksoftware.service.ProductService;
import com.bksoftware.service_impl.ProductServiceImpl;

import java.util.List;

public class ProductController {

    private ProductService service = new ProductServiceImpl();

    public DataResult findAllOrdered(String field, boolean isAsc) {
       List<Product> products = service.findAllOrdered(field, isAsc);
       if (products != null)
           return DataResult.success(products);
       else
           return DataResult.serverError("found nothing");
    }

    public DataResult findByPriceBetween(double lowest, double highest) {
        List<Product> products = service.findByPriceBetween(lowest, highest);
        if (products != null)
            return DataResult.success(products);
        else
            return DataResult.serverError("found nothing");
    }

    public DataResult findByName(String text) {
        List<Product> products = service.findByName(text);
        if (products != null)
            return DataResult.success(products);
        else
            return DataResult.serverError("found nothing");
    }

    public DataResult findAll() {
        List<Product> products = service.findAll();
        if (products != null)
            return DataResult.success(products);
        else
            return DataResult.serverError("found nothing");
    }

    public DataResult findById(int id) {
        Product product = service.findById(id);
        if (product != null)
            return DataResult.success(product);
        else
            return DataResult.badRequest("id is not exist");
    }

    public DataResult upload(Product product) {
        Product saved = service.upload(product);
        if (saved != null)
            return DataResult.success(product);
        else
            return DataResult.serverError("save fail");
    }

    public DataResult update(Product product) {

        Product saved = service.upload(product);
        if (saved != null)
            return DataResult.success(product);
        else
            return DataResult.serverError("update fail");
    }

    public DataResult delete(int id) {
        boolean rs = service.delete(id);
        if (rs)
            return DataResult.success("deleted");
        else
            return DataResult.badRequest("delete fail");
    }

}

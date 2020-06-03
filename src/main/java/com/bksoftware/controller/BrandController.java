package com.bksoftware.controller;

import com.bksoftware.model.Brand;
import com.bksoftware.model.DataResult;
import com.bksoftware.service.BrandService;
import com.bksoftware.service_impl.BrandServiceImpl;

import java.util.List;

public class BrandController {
    private BrandService service = new BrandServiceImpl();

    public DataResult findAll() {
        List<Brand> brands = service.findAll();
        if (brands != null)
           return DataResult.success(brands);
        else
            return DataResult.serverError("Error on brand");
    }

    public DataResult findById(int id) {
        Brand brand = service.findById(id);
        if (brand != null)
            return DataResult.success(brand);
        else
            return DataResult.badRequest("id is not exist");
    }

    public DataResult upload(Brand brand) {
        Brand saved = service.upload(brand);
        if (brand != null)
            return DataResult.success(brand);
        else
            return DataResult.badRequest("cant upload brand");
    }

    public DataResult update(Brand brand) {
        Brand saved = service.update(brand);
        if (brand != null)
            return DataResult.success(brand);
        else
            return DataResult.badRequest("cant update brand");
    }
}

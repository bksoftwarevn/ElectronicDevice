package com.bksoftware.service_impl;

import com.bksoftware.dao.BrandDAO;
import com.bksoftware.model.Brand;
import com.bksoftware.service.BrandService;

import java.util.List;

public class BrandServiceImpl implements BrandService {

    private BrandDAO dao = new BrandDAO();

    @Override
    public List<Brand> findAll() {
        try {
            return dao.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("find all brand err");
            return null;
        }
    }

    @Override
    public Brand findById(int id) {
        try {
            return dao.findById(id);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("find brand by id err");
            return null;
        }
    }

    @Override
    public Brand upload(Brand brand) {
        try {
            return dao.upload(brand);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("upload brand err");
            return null;
        }
    }

    @Override
    public Brand update(Brand brand) {
        try {
            return dao.upload(brand);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("update brand err");
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            return dao.delete(id);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("delete brand err");
            return false;
        }
    }
}

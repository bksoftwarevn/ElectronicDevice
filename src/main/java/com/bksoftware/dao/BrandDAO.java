package com.bksoftware.dao;

import com.bksoftware.model.Brand;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BrandDAO extends BaseDAO<Brand>{

    public BrandDAO() {
        super("brand");
    }

    @Override
    public Brand upload(Brand data) throws Exception {
        String sql = "insert into " + table + " value(null,?,?); select * from "+ table + " where deleted = false";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, data.getName());
        ps.setBoolean(2, data.isDeleted());
        ResultSet rs =  ps.executeQuery();
        rs.last();
        return getObject(rs);
    }

    @Override
    public Brand update(Brand data) throws Exception {
        return null;
    }

    @Override
    public Brand getObject(ResultSet rs) {
        Brand brand = new Brand();
        try {
            brand.setId(rs.getInt("id"));
            brand.setName(rs.getString("name"));
            brand.setDeleted(rs.getBoolean("deleted"));
            return brand;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return brand;
        }
    }
}

package com.bksoftware.dao;

import com.bksoftware.model.Brand;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BrandDAO extends BaseDAO<Brand> {

    public BrandDAO() {
        super("brand");
    }

    @Override
    public Brand upload(Brand data) throws Exception {
        String sql = "insert into " + table + " value(null,?,?);";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, data.getName());
        ps.setBoolean(2, data.isDeleted());
        if (ps.executeUpdate() > 0) {
            String sql2 = "select * from " + table + " where deleted = false";
            PreparedStatement ps2 = getPS(sql2);
            ResultSet rs = ps2.executeQuery();
            rs.last();
            return getObject(rs);
        } else
            return null;
    }

    @Override
    public Brand update(Brand data) throws Exception {
        String sql = "update " + table + " set name = ?, deleted = ? where id = ?";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, data.getName());
        ps.setBoolean(2, data.isDeleted());
        ps.setInt(3, data.getId());
        if (ps.executeUpdate() > 0)
            return data;
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

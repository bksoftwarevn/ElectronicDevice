package com.bksoftware.dao;

import com.bksoftware.model.MyConnection;
import com.bksoftware.model.Product;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private final String table = "product";

    public List<Product> findAll() throws Exception {
        String sql = "select * from product where deleted = false";
        PreparedStatement ps = getPS(sql);
        ResultSet rs = ps.executeQuery();
        rs.first();
        List<Product> data = new ArrayList<>();
        do {
            data.add(getObject(rs));
        } while (rs.next());
        return data;
    }

    public List<Product> findAllOrdered(String field, boolean isAsc) throws Exception {
        String sql = "select * from product where deleted = false order by " + field + " " +  (isAsc ? "asc;" : "desc;");
        PreparedStatement ps = getPS(sql);
        ResultSet rs = ps.executeQuery();
        rs.first();
        List<Product> data = new ArrayList<>();
        do {
            data.add(getObject(rs));
        } while (rs.next());
        return data;
    }

    public List<Product> findByName(String text) throws Exception {
        String sql = "select * from product where name like '%?%' and deleted = false";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, text);
        ResultSet rs = ps.executeQuery();
        rs.first();
        List<Product> data = new ArrayList<>();
        do {
            data.add(getObject(rs));
        } while (rs.next());
        return data;
    }

    public List<Product> findByPriceBetween(double lowest, double highest) throws Exception{
        String sql = "select * from product where price >= ? and price <= ? and deleted = false";
        PreparedStatement ps = getPS(sql);
        ps.setDouble(1, lowest);
        ps.setDouble(2, highest);
        ResultSet rs = ps.executeQuery();
        rs.first();
        List<Product> data = new ArrayList<>();
        do {
            data.add(getObject(rs));
        } while (rs.next());
        return data;
    }

    public Product findById(int id) throws Exception {
        String sql = "select * from product where id = ? and deleted = false";
        PreparedStatement ps = getPS(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.first();
        return getObject(rs);
    }

    public Product upload(Product data) throws Exception {
        String sql = "insert into product value(null,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, data.getName());
        ps.setString(2, data.getModel());
        ps.setString(3, data.getCode());
        ps.setDouble(4, data.getPrice());
        ps.setDouble(5, data.getPromotion_price());
        ps.setBoolean(6, data.isSold_out());
        ps.setInt(7, data.getGuarantee());
        ps.setString(8, data.getIntroduction());
        ps.setString(9, data.getImage());
        ps.setDate(10, new Date(new java.util.Date().getTime()));
        ps.setBoolean(11, data.isDeleted());
        ps.setInt(12, data.getCategoryId());
        ps.setInt(13, data.getBrandId());

        if (ps.executeUpdate() > 0) {
            String sql2 = "select * from " + table + " where deleted = false";
            PreparedStatement ps2 = getPS(sql2);
            ResultSet rs = ps2.executeQuery();
            rs.last();
            return getObject(rs);
        } else
            return null;
    }

    public Product update(Product data) throws Exception {
        String sql = "update " + table + " set name = ?,model = ?, code = ?, price = ?," +
                " promotion_price = ?,sold_out = ?, guarantee = ?, introduction = ?, image = ?, " +
                "create_date = ?, deleted = ?, category_id = ?, brand_id = ? where id = ?";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, data.getName());
        ps.setString(2, data.getModel());
        ps.setString(3, data.getCode());
        ps.setDouble(4, data.getPrice());
        ps.setDouble(5, data.getPromotion_price());
        ps.setBoolean(6, data.isSold_out());
        ps.setInt(7, data.getGuarantee());
        ps.setString(8, data.getIntroduction());
        ps.setString(9, data.getImage());
        ps.setDate(10, (Date) data.getCreateDate());
        ps.setBoolean(11, data.isDeleted());
        ps.setInt(12, data.getCategoryId());
        ps.setInt(13, data.getBrandId());
        ps.setInt(14, data.getId());

        if (ps.executeUpdate() > 0)
            return data;
        return null;
    }

    public boolean delete(int id) throws Exception {
        String sql = "update product set deleted = b'1' where id = ?";
        PreparedStatement ps = getPS(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    }

    private Product getObject(ResultSet rs) {
        Product product = new Product();
        try {
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setModel(rs.getString("model"));
            product.setCode(rs.getString("code"));
            product.setGuarantee(rs.getInt("guarantee"));
            product.setCreateDate(rs.getDate("create_date"));
            product.setImage(rs.getString("image"));
            product.setIntroduction(rs.getString("introduction"));
            product.setPrice(rs.getDouble("price"));
            product.setPromotion_price(rs.getDouble("promotion_price"));
            product.setDeleted(rs.getBoolean("deleted"));
            product.setSold_out(rs.getBoolean("sold_out"));
            product.setBrandId(rs.getInt("brand_id"));
            product.setCategoryId(rs.getInt("category_id"));
        } catch (SQLException throwables) {
            System.out.println("Mapping product fail");
            throwables.printStackTrace();
        }
        return product;
    }

    private PreparedStatement getPS(String sql) throws SQLException {
        return MyConnection.connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
}

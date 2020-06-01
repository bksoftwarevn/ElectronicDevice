package com.bksoftware.dao;

import com.bksoftware.model.CriteriaType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CriteriaTypeDAO extends BaseDAO<CriteriaType> {

    public CriteriaTypeDAO(String table) {
        super(table);
    }

    @Override
    public CriteriaType upload(CriteriaType data) throws Exception {
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
    public CriteriaType update(CriteriaType data) throws Exception {
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
    protected CriteriaType getObject(ResultSet rs) {
        CriteriaType type = new CriteriaType();
        try {
            type.setId(rs.getInt("id"));
            type.setName(rs.getString("name"));
            type.setDeleted(rs.getBoolean("deleted"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return type;
    }

}

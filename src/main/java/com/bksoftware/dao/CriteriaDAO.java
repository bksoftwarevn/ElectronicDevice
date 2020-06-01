package com.bksoftware.dao;

import com.bksoftware.model.Criteria;
import com.bksoftware.model.CriteriaType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CriteriaDAO extends BaseDAO<Criteria> {
    
    public CriteriaDAO(String table) {
        super(table);
    }

    @Override
    public Criteria upload(Criteria data) throws Exception {
        String sql = "insert into " + table + " value(null,?,?,?);";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, data.getName());
        ps.setBoolean(2, data.isDeleted());
        ps.setInt(3, data.getCriteriaTypeId());
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
    public Criteria update(Criteria data) throws Exception {
        String sql = "update " + table + " set name = ?, deleted = ?, criteria_type_id = ? where id = ?";
        PreparedStatement ps = getPS(sql);
        ps.setString(1, data.getName());
        ps.setBoolean(2, data.isDeleted());
        ps.setInt(3, data.getCriteriaTypeId());
        ps.setInt(4, data.getId());
        if (ps.executeUpdate() > 0)
            return data;
        return null;
    }

    @Override
    protected Criteria getObject(ResultSet rs) {
        Criteria criteria = new Criteria();
        try {
            criteria.setId(rs.getInt("id"));
            criteria.setName(rs.getString("name"));
            criteria.setDeleted(rs.getBoolean("deleted"));
            criteria.setCriteriaTypeId(rs.getInt(4));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return criteria;
    }
}

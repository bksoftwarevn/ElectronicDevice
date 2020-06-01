package com.bksoftware.dao;

import com.bksoftware.model.MyConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDAO<T> {

    protected String table;

    public BaseDAO(String table) {
        this.table = table;
    }

    public T findById(int id) throws Exception {
        String sql = "select * from " + table + " where id = ? and deleted = false";
        PreparedStatement ps = getPS(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.first();
        return getObject(rs);
    }

    public List<T> findAll() throws Exception {
        String sql = "select * from " + table + " where deleted = false";
        PreparedStatement ps = getPS(sql);
        ResultSet rs = ps.executeQuery();
        rs.first();
        List<T> data = new ArrayList<>();
        do {
            data.add(getObject(rs));
        } while (rs.next());
        return data;
    }

    public abstract T upload(T data) throws Exception;

    public abstract T update(T data) throws Exception;

    public boolean delete(int id) throws Exception {
        String sql = "update " + table + " set deleted = b'1' where id = ?";
        PreparedStatement ps = getPS(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    }

    protected abstract T getObject(ResultSet rs);

    protected PreparedStatement getPS(String sql) throws SQLException {
        return MyConnection.connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
}

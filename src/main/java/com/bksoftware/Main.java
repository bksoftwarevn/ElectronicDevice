package com.bksoftware;

import com.bksoftware.dao.BrandDAO;
import com.bksoftware.model.Brand;
import com.bksoftware.model.MyConnection;

import java.lang.reflect.Field;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyConnection myConnection = new MyConnection();
        try {
            myConnection.getMyconnection();
            BrandDAO dao = new BrandDAO();
//            Brand brand = dao.upload(new Brand(0, "Dell", false));
//            System.out.println(brand.getId());
               dao.update(new Brand(1,"SpaceX", false));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

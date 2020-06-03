package com.bksoftware;

import com.bksoftware.controller.ProductController;
import com.bksoftware.dao.ProductDAO;
import com.bksoftware.model.MyConnection;
import com.bksoftware.model.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyConnection myConnection = new MyConnection();
        try {
            myConnection.connectDB();
            ProductController controller = new ProductController();
//            try {
//                if (controller.upload(new Product(4, "Nồi cơm điện X Pro", "NC-X", "NCD160"
//                        , 400000, 399000, false,
//                        12, null, "Nồi cơm siêu ngon",
//                        null, false, 1, 1)) != null) {
//                    System.out.println("add product success");
//                } else {
//                    System.out.println("add product fail");
//                }
//            }catch (Exception ex){
//                System.out.println("can not add product");
//            }
            ((List<Product>)controller.findAll().getData()).forEach(p -> System.out.println(p.toString()));
            myConnection.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

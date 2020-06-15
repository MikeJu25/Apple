package SQL;

import java.io.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;



public class AppleProductDataBase {
//    public static void withConnection(String user, String pass) throws SQLException {
//        System.out.println("Creating Connection...");
//        try (
//                Connection connection = DriverManager.getConnection("localhost:3306/apple",
//                        "root", "990428")) {
//            connection.setAutoCommit(false);
//            System.out.println("Creating Connection... Success");
//            //callback.accept(connection);
//        }
//    }
//    public static void main(String[]args){
//        String insert_str = "insert into Discount values(?, ?, ?)";
//
//        System.out.println("Create Statement...");
//        try (PreparedStatement stmt = connection.prepareStatement(insert_str)) {
//            stmt.setString(1, discountName);
//            stmt.setString(2, level);
//            stmt.setString(3, applicability);
//            System.out.println("Execute...");
//            stmt.executeUpdate();
//
//            connection.commit();
//            System.out.println("Changes Committed");
//        }
//
//    }
public static void main(String[] args) {
    try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
            "root", "990428");
         Statement stmt = cont.createStatement();
    ) {
//        String query2 = "insert into Discount values ('a', 'b', 'c')";
//        System.out.println("The SQL statement is: " + query2 + "\n");
//        int countInserted = stmt.executeUpdate(query2);
//        System.out.println(countInserted + " records inserted.\n");

        String strSelect = "select level from Discount where level = '0.9'";
        ResultSet rst = stmt.executeQuery(strSelect);
        System.out.println("The records selected are:");
        int rowCount = 0;
        while (rst.next()) {   // Move the cursor to the next row, return false if no more row
            //String dn = rst.getString("discountName");
            String lev = rst.getString("level");
            //String al = rst.getString("applicability");
            //System.out.println(dn + ", " + lev + ", " + al);
            System.out.println("  lev ");
            ++rowCount;
        }
        System.out.println("Total number of records = " + rowCount);

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}



//    public static void addDiscount(Connection connection, String discountName, String level, String applicability) throws SQLException {
//        String insert_str = "insert into Discount values(?, ?, ?)";
//
//        System.out.println("Create Statement...");
//        try (PreparedStatement stmt = connection.prepareStatement(insert_str)) {
//            stmt.setString(1, discountName);
//            stmt.setString(2, level);
//            stmt.setString(3, applicability);
//            System.out.println("Execute...");
//            stmt.executeUpdate();
//
//            connection.commit();
//            System.out.println("Changes Committed");
//        }
//    }
}




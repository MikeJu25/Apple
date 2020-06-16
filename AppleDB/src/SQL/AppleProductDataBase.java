package SQL;

import java.io.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;



public class AppleProductDataBase {

    //Query1 AddCustomer(Insertion)
public static void addDiscount(){
    try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/appledb?serverTimezone=UTC",
            "root", "q12345678");
         Statement stmt = cont.createStatement();
    ) {
        String query1 = "insert into Discount values ('a', 'b', 'c')";
        System.out.println("The SQL statement is: " + query1 + "\n");
        int countInserted = stmt.executeUpdate(query1);
        System.out.println(countInserted + " records inserted.\n");

        String strSelect = "select * from Discount";
        ResultSet rst = stmt.executeQuery(strSelect);
        System.out.println("The records selected are:");
        int rowCount = 0;
        while (rst.next()) {
            String dn = rst.getString("discountName");
            String lev = rst.getString("level");
            String al = rst.getString("applicability");
            System.out.println(dn + ", " + lev + ", " + al);
            ++rowCount;
        }
        System.out.println("Total number of records = " + rowCount);

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

//Query2 GetIphoneInfo(Select)
public static ArrayList<String> getPhoneInfo(){
    try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/appledb?serverTimezone=UTC",
            "root", "q12345678");
         Statement stmt = cont.createStatement();
    ) {
        String strSelect = "select im.name, im.phoneID, fc.color, fc.storage from iphonemanufacturedin2 im, featurescontains fc " +
                "where im.phoneID = fc.phoneID";
        ResultSet rst = stmt.executeQuery(strSelect);
        System.out.println("The records selected are:");
        int rowCount = 0;
        ArrayList<String> info = new ArrayList<>();
        while (rst.next()) {
            String nm = rst.getString("name");
            String id = rst.getString("phoneID");
            String cr = rst.getString("color");
            String st = rst.getString("storage");
            String together = nm + ", ID" + id + ", " + cr + ", " + st + "GB";
            info.add(together);
           // System.out.println(nm + ", " + cr + ", " + st);
            ++rowCount;
        }
    System.out.println("Total number of records = " + rowCount);
        return info;

} catch (SQLException ex) {
        ex.printStackTrace();
    }
    return null;
}

    //Query4 updateDiscountLevel(update)
    public static ArrayList<String> updateDl(String original, String target){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/appledb?serverTimezone=UTC",
                "root", "q12345678");
             Statement stmt = cont.createStatement();
        ) {
            String uQuery = "UPDATE Discount d SET level= ? WHERE d.discountName = ?";
            int countUpDate = stmt.executeUpdate(uQuery);

            String strSelect = "select * from Discount";
            ResultSet rst = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            int rowCount = 0;
            ArrayList<String> info = new ArrayList<>();
            while (rst.next()) {
                String dn = rst.getString("discountName");
                String lev = rst.getString("level");
                String al = rst.getString("applicability");
                System.out.println(dn + ", " + lev + ", " + al);
                String together = dn + ", " + lev + ", " + al;
                info.add(together);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Query6 priceHighToLow
    public static ArrayList<String> priceHighToLow(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/appledb?serverTimezone=UTC",
                "root", "q12345678");
             Statement stmt = cont.createStatement();
        ) {
            String oQuery = "select name, phoneID, year, price from iphonemanufacturedin2 order by price";
            ResultSet rst = stmt.executeQuery(oQuery);
            System.out.println("The records selected are:");
            int rowCount = 0;
            ArrayList<String> info = new ArrayList<>();
            while (rst.next()) {
                String nm = rst.getString("name");
                String phid = rst.getString("phoneID");
                String pc = rst.getString("price");
                String yr = rst.getString("year");

                String together = nm + ", ID" + phid + ", $" + pc + ", " + yr ;
                info.add(together);
               // System.out.println(nm + ", " + phid + ", " + pc + ", " + yr);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Query7 newestToOldest
    public static ArrayList<String> newestToOldest(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/appledb?serverTimezone=UTC",
                "root", "q12345678");
             Statement stmt = cont.createStatement();
        ) {
            String oQuery = "select distinct im.name, im.phoneID, im.price, im.year " +
                    "from iphonemanufacturedin2 im, featurescontains fc " +
                    "where fc.storage = '16' AND fc.phoneID = im.phoneID" +
                    " Order by year desc";
            ResultSet rst = stmt.executeQuery(oQuery);
            System.out.println("The records selected are:");
            int rowCount = 0;
            ArrayList<String> info = new ArrayList<>();
            while (rst.next()) {
                String nm = rst.getString("name");
                String phid = rst.getString("phoneID");
                String pc = rst.getString("price");
                String yr = rst.getString("year");

                String together = nm + ", " + phid + ", " + pc + ", " + yr;
                info.add(together);
                //System.out.println(nm + ", " + phid + ", " + pc + ", " +yr);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Query11 selectDiscount(select)
    public static ArrayList<String> selectDiscount(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/appledb?serverTimezone=UTC",
                "root", "q12345678");
             Statement stmt = cont.createStatement();
        ) {
            String strSelect = "select * from Discount";
            ResultSet rst = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            int rowCount = 0;
            ArrayList<String> info = new ArrayList<>();
            while (rst.next()) {
                String dn = rst.getString("discountName");
                String lev = rst.getString("level");
                String al = rst.getString("applicability");
                System.out.println(dn + ", " + lev + ", " + al);
                String together = dn + ", " + lev + ", " + al;
                info.add(together);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    }






package SQL;

import java.io.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;



public class AppleProductDataBase {

    //Query1 AddDiscount(Insertion)
    public static ArrayList<String> addDiscount(String nmt, String lv, String aty){
        String query1 = "insert into Discount values (?, ?, ?)";
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
             PreparedStatement insert_stmt = cont.prepareStatement(query1);
        ) {
            insert_stmt.setString(1,nmt);
            insert_stmt.setString(2,lv);
            insert_stmt.setString(3,aty);
            System.out.println("Execute...");
            insert_stmt.executeUpdate();

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
            return null;
        }
    }

    //Query2 GetIphoneInfo(Select)
    public static ArrayList<String> getPhoneInfo(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
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

    //Query3 removeDiscount(delete)
    public static ArrayList<String> removeDiscount(String nme){
        String sqlDelete = "delete from Discount where discountname = ?";
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
             PreparedStatement delete_stmt = cont.prepareStatement(sqlDelete);
        ) {
            delete_stmt.setString(1,nme);
            delete_stmt.executeUpdate();
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

    //Query4 updateDiscountLevel(update)
    public static ArrayList<String> updateDl(String leve, String nme){
        String uQuery = "UPDATE Discount d SET level= ? WHERE d.discountName = ?";
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
             PreparedStatement update_stmt = cont.prepareStatement(uQuery);
        ) {
            update_stmt.setString(1,leve);
            update_stmt.setString(2,nme);
            System.out.println("Execute...");
            update_stmt.executeUpdate();

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

    public static ArrayList<String> updateDiscount2(String leve, String nme){
        String uQuery = "UPDATE Discount d SET level= ? WHERE d.discountName = ?";
        String sQuery = "Select * from Discount where discountName = ?";
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
             PreparedStatement update_stmt = cont.prepareStatement(uQuery);
             PreparedStatement select_statement = cont.prepareStatement(sQuery);
        ) {
            update_stmt.setString(1,leve);
            update_stmt.setString(2,nme);
            System.out.println("Execute...");
            update_stmt.executeUpdate();

            select_statement.setString(1,nme);
            ResultSet rst = select_statement.executeQuery();
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
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
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

    //Query7 countNumber（aggregation)
    public static int count6(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
        ) {
            String cQuery = "select count(*) from iphone6";
            ResultSet rst = stmt.executeQuery(cQuery);
            int count = 0;
            if(rst.next()) {
                count = rst.getInt(1);
                System.out.println(count);
            };
            return count;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    //Query7 newestToOldest
    public static ArrayList<String> newestToOldest(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
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

    //Query8 nestedQuery（join）
    public static ArrayList<String> priceHigherThanAvg(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
        ) {
            String oQuery = "Select im.name, im.phoneID, im.price, f.color, f.storage \n" +
                    "From IphoneManufacturedIn2 im inner join featuresContains f\n" +
                    "Where f.phoneID = im.phoneID AND\n" +
                    "im.price > \n" +
                    "(select avg(price)\n" +
                    "From  IphoneManufacturedIn2)\n";
            ResultSet rst = stmt.executeQuery(oQuery);
            System.out.println("The records selected are:");
            int rowCount = 0;
            ArrayList<String> info = new ArrayList<>();
            while (rst.next()) {
                String nm = rst.getString("name");
                String phid = rst.getString("phoneID");
                String pc = rst.getString("price");
                String cl = rst.getString("color");
                String stg = rst.getString("storage");

                String together = nm + ", " + phid + ", " + pc + ", " + cl + ", " + stg + "GB";
                info.add(together);
                System.out.println(nm + ", " + phid + ", " + pc + ", " +cl + "," + stg + "GB");
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //Query11 selectDiscount(select)
    public static ArrayList<String> selectDiscount(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
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

    //Query11 iphAllDiscount(Division)
    public static ArrayList<String> iphAppToAllDiscounts(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
        ) {
            String oQuery = "Select im.name, im.phoneID, im.price from iphonemanufacturedin2 im " +
                    "Where not exists( " +
                    "Select * from retailedthrough2 rt2 " +
                    "Where not exists( " +
                    "Select rt1.discountname " +
                    "From retailedthrough1 rt1 " +
                    "Where im.phoneID = rt1.phoneID " +
                    "AND rt1.discountname = rt2.discountname))\n";
            ResultSet rst = stmt.executeQuery(oQuery);
            System.out.println("The records selected are:");
            int rowCount = 0;
            ArrayList<String> info = new ArrayList<>();
            while (rst.next()) {
                String nm = rst.getString("name");
                String phid = rst.getString("phoneID");
                String pc = rst.getString("price");

                String together = nm + ", " + phid + ", " + pc;
                info.add(together);
                System.out.println(nm + ", " + phid + ", " + pc);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Query12 CountX(aggregation)
    public static int countX(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
        ) {
            String cQuery = "select count(*) from iphoneX";
            ResultSet rst = stmt.executeQuery(cQuery);
            int count = 0;
            if(rst.next()) {
                count = rst.getInt(1);
                System.out.println(count);
            };
            return count;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }


    //Query13 CountSE(aggregation)
    public static int countSE(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
        ) {
            String cQuery = "select count(*) from iphoneSE1";
            ResultSet rst = stmt.executeQuery(cQuery);
            int count = 0;
            if(rst.next()) {
                count = rst.getInt(1);
                System.out.println(count);
            };
            return count;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    //Query10 nqGroupBy(nested)
    public static ArrayList<String> iPhoneAvgPrice(){
        try (Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple?serverTimezone=UTC",
                "root", "Guyingyuyi1!");
             Statement stmt = cont.createStatement();
        ) {
            String npQuery = "Select name, avg(price) as average from iphonemanufacturedin2 Group by name;";
            ResultSet rst = stmt.executeQuery(npQuery);
            ArrayList<String> info = new ArrayList<>();
            int rowCount = 0;
            while (rst.next()) {
                String nm = rst.getString("name");
                String pc = rst.getString("average");
                System.out.println(nm + ", $" + pc);
                String together = nm + ", $" + pc;
                info.add(together);
                ++rowCount;
            }
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}






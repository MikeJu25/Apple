package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppleProductDataBase {
    public static void withConnection(String user, String pass, SQLCustomerFUN<Connection> callback) throws SQLException {
        System.out.println("Creating Connection...");
        try (

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@loca　lhost:1522:ug", user, pass)) {
            connection.setAutoCommit(false);
            System.out.println("Creating Connection... Success");
            callback.accept(connection);
        }
    }


    public static void addDiscount(Connection connection, String discountName, String level, String applicability) throws SQLException {
        String insert_str = "insert into Discount values(?, ?, ?, ?)";

        System.out.println("Create Statement...");
        try (PreparedStatement stmt = connection.prepareStatement(insert_str)) {
            stmt.setString(1, discountName);
            stmt.setString(2, level);
            stmt.setString(3, applicability);
            System.out.println("Execute...");
            stmt.executeUpdate();

            connection.commit();
            System.out.println("Changes Committed");
        }
    }
}




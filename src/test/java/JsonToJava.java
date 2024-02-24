import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class JsonToJava {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null;
        ArrayList<CustomerDetails> al = new ArrayList<CustomerDetails>();

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "admin", "1234");

        // Object of statement class will help to execute queries

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CustomerInfo WHERE purchasedDate='2024-02-18' AND Location ='Asia';");

        //    resultSet.next(); -  setting pointer to particular row in sql table

        while (resultSet.next()) {
            // System.out.println(resultSet.getString(1));
            CustomerDetails cd = new CustomerDetails();
            // 3 different json files, 3 different java objects
            cd.setCourseName(resultSet.getString(1));
            cd.setPurchasedDate(resultSet.getString(2));
            cd.setAmount(resultSet.getInt(3));
            cd.setLocation(resultSet.getString(4));
            al.add(cd); //  add data from DB's raw into ArrayList

            System.out.println(cd.getCourseName());
            System.out.println(cd.getPurchasedDate());
            System.out.println(cd.getAmount());
            System.out.println(cd.getLocation());
        }
        for (int i = 0; i < al.size(); i++) {
            ObjectMapper om = new ObjectMapper();
            om.writeValue(new File("C:\\Users\\mmishina\\IdeaProjects\\Java-with-DB\\customerInfo" + i + ".json"), al.get(i));
        }

        connection.close();

    }
}

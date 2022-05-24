package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Main {

    public static final String createTableSQL = "CREATE TABLE users_aCichy " +
            "(ID INT PRIMARY KEY ," +
            " NAME VARCHAR(50), " +
            " SURNAME VARCHAR(50), " +
            " PHONE VARCHAR(50)); "+
            " PESEL VARCHAR(50)); ";
    public static String insert = "INSERT INTO users_aCichy VALUES(1,'antoni','cichy','111111111','81010200131');";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");

            String user = "postgres";
            String pass = "1dQxvBLTEpKTfgxQGD5FN";
            Properties props = new Properties();
            props.setProperty("user", user);
            props.setProperty("password", pass);

            String url = "jdbc:postgresql://msz-test.chq8qedm9jee.eu-west-1.rds.amazonaws.com/postgres";
            Connection con = DriverManager.getConnection(url, props);
            Statement st = con.createStatement();
            st.execute(createTableSQL);
            st.execute(insert);



            ResultSet rs = st.executeQuery(
                    "select surname,classid from users_aCichy ");
            while (rs.next()) {
                System.out.println(rs.getString("surname"));
                System.out.println(rs.getString("phone"));
            }
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void AddClientt(int id,String name, String surname, int phone,int pesel) {
        try {
            Class.forName("org.postgresql.Driver");

            String user = "postgres";
            String pass = "1dQxvBLTEpKTfgxQGD5FN";
            Properties props = new Properties();
            props.setProperty("user", user);
            props.setProperty("password", pass);
            String url = "jdbc:postgresql://msz-test.chq8qedm9jee.eu-west-1.rds.amazonaws.com/postgres";
            Connection con = DriverManager.getConnection(url, props);
            Statement st = con.createStatement();
            insert = "INSERT INTO users_aCichy VALUES(id,name,surname,phone,pesel);";
            st.execute(insert);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}


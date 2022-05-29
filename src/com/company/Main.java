package com.company;

import com.company.classes.models.Client;
import com.company.classes.models.Tariff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.MonthDay;
import java.util.Date;
import java.util.Properties;

public class Main {

    public static final String createTableSQL = "CREATE TABLE users_aCichy " +
            "(ID INT PRIMARY KEY ," +
            " NAME VARCHAR(50), " +
            " SURNAME VARCHAR(50), " +
            " PHONE VARCHAR(50)); " +
            " PESEL VARCHAR(50)); ";
    public static String insert = "INSERT INTO users_aCichy VALUES(1,'antoni','cichy','111111111','81010200131');";
    public static final String createTableSQL2 = "CREATE TABLE contracts_aCichy " +
            "(ID INT PRIMARY KEY ," +
            " Client VARCHAR(50), " +
            " Tariff VARCHAR(50), " +
            " Date DATE(50)); " +
            " Day VARCHAR(50)); ";
    public static String insert2 = "INSERT INTO contracts_aCichy VALUES(1,'antoni','tarrif1','12.01.2022','5');";

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
            st.execute(createTableSQL2);
            st.execute(insert2);


            ResultSet rs = st.executeQuery(
                    "select surname,phone from users_aCichy ");
            while (rs.next()) {
                System.out.println(rs.getString("surname"));
                System.out.println(rs.getString("phone"));
            }
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void AddClientt(int id, String name, String surname, int phone, int pesel) {
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
        public void AddContractt(int id, Client client, Tariff tariff, Date date, MonthDay monthday){
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
                insert2 = "INSERT INTO users_aCichy VALUES(id,client,tariff,date,monthday);";
                st.execute(insert2);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        public void DeleteClientt(int ClientId)
        {
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
                insert = "DELETE FROM users_aCichy WHERE ID == ClientId;";
                st.execute(insert);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    public void DeleteContractt(int ContractId)
    {
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
            insert2 = "DELETE FROM contracts_aCichy WHERE ID == ContractId;";
            st.execute(insert2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    }



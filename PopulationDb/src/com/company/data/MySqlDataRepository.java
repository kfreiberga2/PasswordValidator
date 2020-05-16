package com.company.data;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySqlDataRepository implements PopulationDataRepository {

    private Connection connection;
    private static final String  connectionString= "jdbc:mysql://localhost:3306/citypopulation_new?useTimezone=true&serverTimezone=UTC";
    private static final String connectionUser = "root";
    private static final String connectionPassword= "3menesi!";

    public MySqlDataRepository(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<City> getCities() {
        List<City> cities = new ArrayList<>();

        try {

             connection = DriverManager.getConnection(connectionString,connectionUser,connectionPassword);
            Statement statement =connection.createStatement();

            ResultSet rs = statement.executeQuery(City.SELECT_QUERY);

            while (rs.next()){



                cities.add(City.createCity(rs));

                // System.out.println(rs.getInt("city_id") + " "+rs.getString("city_name"));
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cities;
    }

    @Override
    public List<Population> getPopulations() {
        return null;
    }

    @Override
    public List<Region> getRegions() {

        List<Region> regions = new ArrayList<>();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(connectionString,connectionUser,connectionPassword);

            Statement statement =connection.createStatement();

            ResultSet rs = statement.executeQuery(Region.SELECT_QUERY);

            while (rs.next()){

                regions.add(Region.createRegion(rs));

            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return regions;

}

    @Override
    public <T> List<T> getList() {
        List<T> items = new ArrayList<>();

//        try {
//
//             connection = DriverManager.getConnection(connectionString,connectionUser,connectionPassword);
//
//            Statement statement =connection.createStatement();
//
//
//            ResultSet rs = statement.executeQuery(City.SELECT_QUERY);
//
//            while (rs.next()){
//
//             items.add(City.createCity(rs));
//
//            }
//            connection.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return items;
    }

    @Override
    public City getCityById(int id) {

        try {
            connection = DriverManager.getConnection(connectionString,connectionUser,connectionPassword);

            PreparedStatement stmt = connection.prepareStatement(City.SELECT_QUERY + " where city_id = ?");
            stmt.setInt(1,id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                return City.createCity(rs);
            }
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

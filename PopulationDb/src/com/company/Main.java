package com.company;
import com.company.data.City;
import com.company.data.MySqlDataRepository;
import com.company.data.PopulationDataRepository;
import com.company.data.PopulationWithCityAndRegion;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PopulationDataRepository repository = new MySqlDataRepository();

        var cities = repository.getCities();

        for (var city : cities){
            System.out.println(city.getName()+" "+city.getRegion().getName());
        }
        repository.getRegions().forEach(System.out::println);

        var city  =repository.getCityById(1);
        System.out.println(city.getName());



    }

    @Test
    public void  getCityPopulations(){
        //select * from citypopulation_new.population_with_city_and_region;

        List<PopulationWithCityAndRegion> population = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citypopulation_new?useTimezone=true&serverTimezone=UTC","root","3menesi!");
            Statement statement =con.createStatement();

            ResultSet rs = statement.executeQuery("select * from citypopulation_new.population_with_city_and_region");

            while (rs.next()){

                var pop = new PopulationWithCityAndRegion(rs.getInt("pyear"),
                        rs.getInt("p"),
                        rs.getString("name"),
                        rs.getString("region_name"));


                population.add(pop);

                // System.out.println(rs.getInt("city_id") + " "+rs.getString("city_name"));
            }
            con.close();

            for(var pop : population){
                System.out.println(pop);
            }

           population.stream().forEach(System.out::println);



        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }

    }

}

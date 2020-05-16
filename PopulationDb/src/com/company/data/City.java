package com.company.data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class City extends EntityBase{

    public static final String SELECT_QUERY  = "select * from citypopulation_new.city_with_region";
    private int id;

    public City(int id, String name, int founded, Region region) {
        this.id = id;
        this.name = name;
        this.founded = founded;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    private int founded;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    private Region region;

    public static City createCity(ResultSet rs)  {

        City city = null;
        try {
            city = new City(rs.getInt("city_id"),
                    rs.getString("city_name"),
                    rs.getInt("city_founded"),
                    new Region(rs.getInt("city_region_id"), rs.getString("region_name")));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return city;
    }

    @Override
    public String getSelectSql() {
        return SELECT_QUERY;
    }

    @Override
    public EntityBase getEntity(ResultSet rs) {
        return City.createCity(rs);
    }


}

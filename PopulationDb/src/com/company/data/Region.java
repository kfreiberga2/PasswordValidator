package com.company.data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Region extends EntityBase{
    public static final String SELECT_QUERY  = "select * from citypopulation_new.region";
    private int id;
    private String name;

    public Region(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Region createRegion(ResultSet rs)  {

        Region region = null;
        try {
            region = new Region(rs.getInt("region_id"),
                    rs.getString("region_name"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return region;
    }


    @Override
    public String getSelectSql() {
        return SELECT_QUERY;
    }

    @Override
    public EntityBase getEntity(ResultSet rs) {
        return Region.createRegion(rs);
    }
}

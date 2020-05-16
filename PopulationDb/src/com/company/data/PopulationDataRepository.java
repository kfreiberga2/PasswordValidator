package com.company.data;

import java.util.List;

public interface PopulationDataRepository {

    List<City> getCities();
    List<Population> getPopulations();
    List <Region> getRegions();

    <T> List<T> getList();

    City getCityById(int id);

}

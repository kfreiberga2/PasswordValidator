package com.company.data;

public class PopulationWithCityAndRegion {
    private int year;
    private int  population;
    private String name;
    private String region;

    public PopulationWithCityAndRegion(int year, int population, String name, String region) {
        this.year = year;
        this.population = population;
        this.name = name;
        this.region = region;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "PopulationWithCityAndRegion{" +
                "year=" + year +
                ", population=" + population +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}

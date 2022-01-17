package com.softserveinc.task03;

import com.softserveinc.task02.City;

import java.util.Arrays;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities;

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getCode() {
        return code;
    }

    public City getCapital() {
        return capital;
    }

    public City[] getCities() {
        return cities;
    }


    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = new City[]{capital};  // подсмотрено, не совсем понимаю это место
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", code='" + code + '\'' +
                ", capital=" + capital +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }

    public void addCity(City city) {
        cities = Arrays.copyOf(cities, cities.length + 1);
        cities[cities.length - 1] = city;
    }

    public int getInhabitants() {   // подсмотрено 50/50
        int allPeople = 0;

        if(cities == null) {
            return allPeople;
        }

        for(City city: cities) {
            allPeople = allPeople + city.getInhabitants();
        }

        return allPeople;
    }


}



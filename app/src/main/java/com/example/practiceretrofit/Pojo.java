package com.example.practiceretrofit;

//Step-2 create pojo class

public class Pojo {

    String country,continent;
    int cases,critical,recovered,active;

    public Pojo(String country, String continent, int cases, int critical, int recovered, int active) {
        this.country = country;
        this.continent = continent;
        this.cases = cases;
        this.critical = critical;
        this.recovered = recovered;
        this.active = active;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}

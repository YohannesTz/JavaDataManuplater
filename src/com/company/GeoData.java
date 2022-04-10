package com.company;

import java.util.Objects;

public class GeoData {

    private String countryName;
    private String capitalName;
    private String capitalLat;
    private String capitalLong;

    public GeoData(String capitalCountry, String capitalName, String capitalLat, String capitalLong) {
        this.countryName = capitalCountry;
        this.capitalName = capitalName;
        this.capitalLat = capitalLat;
        this.capitalLong = capitalLong;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getCapitalLat() {
        return capitalLat;
    }

    public void setCapitalLat(String capitalLat) {
        this.capitalLat = capitalLat;
    }

    public String getCapitalLong() {
        return capitalLong;
    }

    public void setCapitalLong(String capitalLong) {
        this.capitalLong = capitalLong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoData geoData = (GeoData) o;
        return Objects.equals(countryName, geoData.countryName) && Objects.equals(capitalName, geoData.capitalName) && Objects.equals(capitalLat, geoData.capitalLat) && Objects.equals(capitalLong, geoData.capitalLong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, capitalName, capitalLat, capitalLong);
    }

    @Override
    public String toString() {
        return "GeoData{" +
                "capitalCountry='" + countryName + '\'' +
                ", capitalName='" + capitalName + '\'' +
                ", capitalLat='" + capitalLat + '\'' +
                ", capitalLong='" + capitalLong + '\'' +
                '}';
    }
}

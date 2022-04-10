package com.company;

import java.util.Objects;

public class CorrectedData {
    private String countryName;
    private String region;
    private String happinessRank;
    private String happinessScore;
    private String standardError;
    private String economyGDPperCapita;
    private String family;
    private String healthLifeExpectancy;
    private String freedom;
    private String trustGovernmentCorruption;
    private String generosity;
    private String dystopiaResidual;
    private String year;
    private GeoData geoData;

    public CorrectedData(String countryName, String region, String happinessRank, String happinessScore, String standardError, String economyGDPperCapita, String family, String healthLifeExpectancy, String freedom, String trustGovernmentCorruption, String generosity, String dystopiaResidual, String year, GeoData geoData) {
        this.countryName = countryName;
        this.region = region;
        this.happinessRank = happinessRank;
        this.happinessScore = happinessScore;
        this.standardError = standardError;
        this.economyGDPperCapita = economyGDPperCapita;
        this.family = family;
        this.healthLifeExpectancy = healthLifeExpectancy;
        this.freedom = freedom;
        this.trustGovernmentCorruption = trustGovernmentCorruption;
        this.generosity = generosity;
        this.dystopiaResidual = dystopiaResidual;
        this.year = year;
        this.geoData = geoData;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHappinessRank() {
        return happinessRank;
    }

    public void setHappinessRank(String happinessRank) {
        this.happinessRank = happinessRank;
    }

    public String getHappinessScore() {
        return happinessScore;
    }

    public void setHappinessScore(String happinessScore) {
        this.happinessScore = happinessScore;
    }

    public String getStandardError() {
        return standardError;
    }

    public void setStandardError(String standardError) {
        this.standardError = standardError;
    }

    public String getEconomyGDPperCapita() {
        return economyGDPperCapita;
    }

    public void setEconomyGDPperCapita(String economyGDPperCapita) {
        this.economyGDPperCapita = economyGDPperCapita;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getHealthLifeExpectancy() {
        return healthLifeExpectancy;
    }

    public void setHealthLifeExpectancy(String healthLifeExpectancy) {
        this.healthLifeExpectancy = healthLifeExpectancy;
    }

    public String getFreedom() {
        return freedom;
    }

    public void setFreedom(String freedom) {
        this.freedom = freedom;
    }

    public String getTrustGovernmentCorruption() {
        return trustGovernmentCorruption;
    }

    public void setTrustGovernmentCorruption(String trustGovernmentCorruption) {
        this.trustGovernmentCorruption = trustGovernmentCorruption;
    }

    public String getGenerosity() {
        return generosity;
    }

    public void setGenerosity(String generosity) {
        this.generosity = generosity;
    }

    public String getDystopiaResidual() {
        return dystopiaResidual;
    }

    public void setDystopiaResidual(String dystopiaResidual) {
        this.dystopiaResidual = dystopiaResidual;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public GeoData getGeoData() {
        return geoData;
    }

    public void setGeoData(GeoData geoData) {
        this.geoData = geoData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CorrectedData that = (CorrectedData) o;
        return Objects.equals(countryName, that.countryName) && Objects.equals(region, that.region) && Objects.equals(happinessRank, that.happinessRank) && Objects.equals(happinessScore, that.happinessScore) && Objects.equals(standardError, that.standardError) && Objects.equals(economyGDPperCapita, that.economyGDPperCapita) && Objects.equals(family, that.family) && Objects.equals(healthLifeExpectancy, that.healthLifeExpectancy) && Objects.equals(freedom, that.freedom) && Objects.equals(trustGovernmentCorruption, that.trustGovernmentCorruption) && Objects.equals(generosity, that.generosity) && Objects.equals(dystopiaResidual, that.dystopiaResidual) && Objects.equals(year, that.year) && Objects.equals(geoData, that.geoData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, region, happinessRank, happinessScore, standardError, economyGDPperCapita, family, healthLifeExpectancy, freedom, trustGovernmentCorruption, generosity, dystopiaResidual, year, geoData);
    }

    @Override
    public String toString() {
        return "CorrectedData{" +
                "countryName='" + countryName + '\'' +
                ", region='" + region + '\'' +
                ", happinessRank='" + happinessRank + '\'' +
                ", happinessScore='" + happinessScore + '\'' +
                ", standardError='" + standardError + '\'' +
                ", economyGDPperCapita='" + economyGDPperCapita + '\'' +
                ", family='" + family + '\'' +
                ", healthLifeExpectancy='" + healthLifeExpectancy + '\'' +
                ", freedom='" + freedom + '\'' +
                ", trustGovernmentCorruption='" + trustGovernmentCorruption + '\'' +
                ", generosity='" + generosity + '\'' +
                ", dystopiaResidual='" + dystopiaResidual + '\'' +
                ", year='" + year + '\'' +
                ", geoData=" + geoData +
                '}';
    }
}

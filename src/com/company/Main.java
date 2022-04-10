package com.company;

import com.google.gson.Gson;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<CorrectedData> correctedDataList = new ArrayList<>();
        HashMap<String, GeoData> geoDataHashMap = new HashMap<>();

        try {
            CSVParser concapParser = new CSVParser(new FileReader(Paths.get("/home/jah/IdeaProjects/JavaDataManuplater/src/com/company/concap.csv").toFile()), CSVFormat.DEFAULT); //this is my setup please use your own unless you might end-up with problems
            CSVParser outputParser = new CSVParser(new FileReader(Paths.get("/home/jah/IdeaProjects/JavaDataManuplater/src/com/company/output.csv").toFile()), CSVFormat.DEFAULT); //this is my setup please use your own unless you might end-up with problems



            for (CSVRecord csvRecord : concapParser) {
                String countryName = csvRecord.get(0);
                String capitalName = csvRecord.get(1);
                String capitalLat = csvRecord.get(2);
                String capitalLong = csvRecord.get(3);

                GeoData geoData = new GeoData(countryName, capitalName, capitalLat, capitalLong);
                geoDataHashMap.put(countryName, geoData);
            }
            System.out.println(geoDataHashMap.size());

            for (CSVRecord csvRecord: outputParser) {
                String country = csvRecord.get(1);
                String region = csvRecord.get(2);
                String happinessRank = csvRecord.get(3);
                String happinessScore = csvRecord.get(4);
                String standardError = csvRecord.get(5);
                String gdp = csvRecord.get(6);
                String family = csvRecord.get(7);
                String lifeExp = csvRecord.get(8);
                String freedom = csvRecord.get(9);
                String trustGov = csvRecord.get(10);
                String generosity = csvRecord.get(11);
                String dystopiaRes = csvRecord.get(12);
                String year = csvRecord.get(13);

                GeoData countryGeoData = geoDataHashMap.get(country);

                correctedDataList.add(new CorrectedData(country, region, happinessRank, happinessScore, standardError, gdp, family, lifeExp,
                        freedom, trustGov, generosity, dystopiaRes, year, countryGeoData));
            }

            System.out.println(correctedDataList.size());

            /*try (
                    BufferedWriter writer = Files.newBufferedWriter(Paths.get("/home/jah/IdeaProjects/JavaDataManuplater/src/com/company/correctedData.csv"));
                    CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            ) {
                for (CorrectedData cd : correctedDataList) {
                    csvPrinter.printRecord(cd.getCountryName(), cd.getRegion(), cd.getHappinessRank(), cd.getHappinessScore(), cd.getStandardError(), cd.getEconomyGDPperCapita(), cd.getFamily(), cd.getHealthLifeExpectancy(), cd.getFreedom(), cd.getTrustGovernmentCorruption(), cd.getGenerosity(), cd.getDystopiaResidual(), cd.getYear(), cd.getGeoData().getCapitalName(), cd.getGeoData().getCapitalLat(), cd.getGeoData().getCapitalLong());
                }

                csvPrinter.flush();
            }*/

            String jsonText =  new Gson().toJson(correctedDataList);
            Files.writeString(Path.of("/home/jah/IdeaProjects/JavaDataManuplater/src/com/company/correctedData.json"), jsonText);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

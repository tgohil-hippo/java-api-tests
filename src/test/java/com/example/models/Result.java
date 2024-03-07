package com.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) 
public class Result {
    String postcode;
    Integer quality;
    Integer eastings;
    Integer northings;
    String country;
    String nhs_ha;
    Float longitude;
    Float latitude;
    String european_electoral_region;
    String primary_care_trust;
    String region;
    String lsoa;
    String msoa;
    String incode;
    String outcode;
    String parliamentary_constituency;
    String parliamentary_constituency_2024;
    String admin_district;
    String parish;
    String admin_county;
    String date_of_introduction;
    String admin_ward;
    String ced;
    String ccg;
    String nuts;
    String pfa;
}

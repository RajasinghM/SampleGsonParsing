package parsing.gson.com.samplegsonparsing;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rajasingh on 4/27/2016.
 */
public class Geonames {
    @SerializedName("lng")
    private String longitude;

    @SerializedName("lat")
    private String latitude;

    @SerializedName("geonameId")
    private String geonameid;

    @SerializedName("countrycode")
    private String countrycode;

    @SerializedName("name")
    private String cityname;

    @SerializedName("fclName")
    private String fclname;

    @SerializedName("toponymName")
    private String toponym;

    @SerializedName("fcodeName")
    private String fcodename;

    @SerializedName("wikipedia")
    private String wikipedia;

    @SerializedName("fcl")
    private String fcl;

    @SerializedName("population")
    private String population;

    @SerializedName("fcode")
    private String fcode;

    public Geonames(){

    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getFcl() {
        return fcl;
    }

    public void setFcl(String fcl) {
        this.fcl = fcl;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getFcodename() {
        return fcodename;
    }

    public void setFcodename(String fcodename) {
        this.fcodename = fcodename;
    }

    public String getToponym() {
        return toponym;
    }

    public void setToponym(String toponym) {
        this.toponym = toponym;
    }

    public String getFclname() {
        return fclname;
    }

    public void setFclname(String fclname) {
        this.fclname = fclname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getGeonameid() {
        return geonameid;
    }

    public void setGeonameid(String geonameid) {
        this.geonameid = geonameid;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}

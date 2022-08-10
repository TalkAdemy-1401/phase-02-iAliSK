package model.userinfo;

public class LocationInfo {
    private String country;
    private String location;
    private int lng;
    private int lat;
    private double livelng;
    private double livelat;
    private String liveLocation;

    public LocationInfo(String country, String location, int lng, int lat, double livelng, double livelat, String liveLocation) {
        this.country = country;
        this.location = location;
        this.lng = lng;
        this.lat = lat;
        this.livelng = livelng;
        this.livelat = livelat;
        this.liveLocation = liveLocation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public double getLivelng() {
        return livelng;
    }

    public void setLivelng(double livelng) {
        this.livelng = livelng;
    }

    public double getLivelat() {
        return livelat;
    }

    public void setLivelat(double livelat) {
        this.livelat = livelat;
    }

    public String getLiveLocation() {
        return liveLocation;
    }

    public void setLiveLocation(String liveLocation) {
        this.liveLocation = liveLocation;
    }
}

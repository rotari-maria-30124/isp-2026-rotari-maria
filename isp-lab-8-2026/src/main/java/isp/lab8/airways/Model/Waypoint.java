package isp.lab8.airways.Model;

import java.util.Objects;

/**
 * Example waypoint class which can be extended to be used in implementation of the exercise. Add constructor, getters, setters, etc.
 */
public class Waypoint {
    private int index;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Waypoint other = (Waypoint) obj;
        if (!Objects.equals(this.latitude, other.latitude) && !Objects.equals(this.longitude, other.longitude) && !Objects.equals(this.altitude, other.altitude)) {
            return false;
        }
        return true;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public int hashCode(){
        return Objects.hash(index,name);
    }
}
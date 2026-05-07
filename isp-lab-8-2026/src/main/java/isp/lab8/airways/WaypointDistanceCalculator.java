package isp.lab8.airways;

import java.lang.Math;

/**
 * Example how to calculate distance between 2 geographical points. Reuse part of this code in your application.
 */
public class WaypointDistanceCalculator {

    public static void main(String[] args) {
        // Example coordinates for two waypoints
        //Cluj-Napoca
        double lat1 = 46.7712;
        double lon1 = 23.6236;
        //Bucharest
        double lat2 = 44.4268;
        double lon2 = 26.1025;

        //Tasnad
        double lat3=47.0548;
        double lon3=23.9212;
        //Sopot
        double lat4=46.9804;
        double lon4=24.7365;
        // Calculate the distance between the two waypoints
        double distance = calculateDistance(lat1, lon1, lat2, lon2);
        double distance2 = calculateDistance(lat3, lon3, lat4, lon4);
        // Print the result
        System.out.println("The distance between the two waypoints is: " + distance + " kilometers");
        System.out.println("The distance between the two waypoints is: " + distance2 + " kilometers");
    }

    // Method to calculate the distance between two waypoints using the haversine formula
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        int earthRadius = 6371; // Radius of the Earth in kilometers
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = earthRadius * c;
        return distance;
    }
    public static double calculateDistance2(double lat3, double lon3, double lat4, double lon4) {
        int earthRadius = 6371; // Radius of the Earth in kilometers
        double dLat1 = Math.toRadians(lat4 - lat3);
        double dLon1 = Math.toRadians(lon4 - lon3);
        double b = Math.sin(dLat1 / 2) * Math.sin(dLat1 / 2) +
                Math.cos(Math.toRadians(lat3)) * Math.cos(Math.toRadians(lat4)) *
                        Math.sin(dLon1 / 2) * Math.sin(dLon1 / 2);
        double c1 = 2 * Math.atan2(Math.sqrt(b), Math.sqrt(1 - b));
        double distance2 = earthRadius * c1;
        return distance2;
    }
}


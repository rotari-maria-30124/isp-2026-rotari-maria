package isp.lab8.airways;

import isp.lab8.airways.Model.Route;
import isp.lab8.airways.Model.Waypoint;
import isp.lab8.airways.Repository.FileService;

public class Exercise {
    public static void main(String[] args) {
        Route r=new Route("1", "LRCL-LROP");

        Waypoint w1=new Waypoint();
        w1.setName("LRCL");
        w1.setLatitude(46.7852);
        w1.setLongitude(23.6862);
        w1.setAltitude(415);

        Waypoint w2=new Waypoint();
        w2.setName("TASOD");
        w2.setLatitude(47.0548);
        w2.setLongitude(23.9212);
        w2.setAltitude(10460);

        Waypoint w3=new Waypoint();
        w3.setName("SOPAV");
        w3.setLatitude(46.9804);
        w3.setLongitude(24.7365);
        w3.setAltitude(10900);

        Waypoint w4=new Waypoint();
        w4.setName("BIRGU");
        w4.setLatitude(45.9467);
        w4.setLongitude(26.0217);
        w4.setAltitude(10200);

        Waypoint w5=new Waypoint();
        w5.setName("LROP");
        w5.setLatitude(44.5711);
        w5.setLongitude(26.0858);
        w5.setAltitude(106);

        r.addWaypoint(w1);
        r.addWaypoint(w2);
        r.addWaypoint(w3);
        r.addWaypoint(w4);
        r.addWaypoint(w5);

        double totDist=0;
        totDist+= WaypointDistanceCalculator.calculateDistance(w1.getLatitude(), w1.getLongitude(), w2.getLatitude(), w2.getLongitude());
        totDist+= WaypointDistanceCalculator.calculateDistance(w2.getLatitude(), w2.getLongitude(), w3.getLatitude(), w3.getLongitude());
        totDist+= WaypointDistanceCalculator.calculateDistance(w3.getLatitude(), w3.getLongitude(), w4.getLatitude(), w4.getLongitude());
        totDist+= WaypointDistanceCalculator.calculateDistance(w4.getLatitude(), w4.getLongitude(), w5.getLatitude(), w5.getLongitude());
        FileService fileService=new FileService();
        fileService.save(r);
        System.out.println(r.getRouteName());
        System.out.println("The total distance is: " + totDist + " kilometers");
    }
}

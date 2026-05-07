package isp.lab8.airways.Model;

import isp.lab8.airways.Model.Waypoint;
import isp.lab8.airways.WaypointDistanceCalculator;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Route {
    private String routeID;
    private String routeName;
    private HashSet<Waypoint> waypoints=new HashSet<>();

    public Route() {}

    public Route(String routeID, String routeName) {
        this.routeID = routeID;
        this.routeName = routeName;
    }
    public void addWaypoint(Waypoint waypoint) {
        waypoints.add(waypoint);
    }
    public void removeWaypoint(Waypoint waypoint) {
        waypoints.remove(waypoint);
    }

    public String getRouteName() {
        return routeName;
    }

    public HashSet<Waypoint> getWaypoints() {
        return waypoints;
    }

    public double calculateTotalDistance(){
        List<Waypoint> list=new ArrayList<>(waypoints);
        double tot=0;
        for (int i = 0; i < list.size()-1; i++) {
            Waypoint w1=list.get(i);
            Waypoint w2=list.get(i+1);
            tot+= WaypointDistanceCalculator.calculateDistance(w1.getLatitude(), w1.getLongitude(), w2.getLatitude(), w2.getLongitude());
        }
        return tot;
    }


    // ./data/airplaneRouteManagement/
    //                                  CLJ-OTP/
    //                                          waypoint_CLJ/json
    //                                          waypoint_TASOD/json
    //                                          waypoint_SOPAV/json
    //                                          waypoint_BIRGU/json
    //                                          waypoint_OTP/json


}


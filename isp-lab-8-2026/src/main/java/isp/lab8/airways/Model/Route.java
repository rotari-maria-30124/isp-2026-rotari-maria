package isp.lab8.airways.model;

import isp.lab8.airways.Model.Waypoint;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;

public class Route {
    private String routeID;
    private String routeName;
    private HashSet<Waypoint> waypoints;

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
    }

    // ./data/airplaneRouteManagement/
    //                                  CLJ-OTP/
    //                                          waypoint_CLJ/json
    //                                          waypoint_TASOD/json
    //                                          waypoint_SOPAV/json
    //                                          waypoint_BIRGU/json
    //                                          waypoint_OTP/json


}


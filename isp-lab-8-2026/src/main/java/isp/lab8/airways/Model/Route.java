package isp.lab8.airways.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
@Getter
@Setter
public class Route {
    private String routeID;
    private String routeName;
    private HashSet<Waypoint> waypoints;

    public Route(){}

    public Route(String routeID, String routeName){
        this.routeID=routeID;
        this.routeName=routeName;
    }
    public void addWaypoint(Waypoint w){
        waypoints.add(w);
    }
    public void removeWaypoint(Waypoint w){
        waypoints.remove(w);
    }

    //./data/airplaneRouteManagement/
    //                                  CLJ-OTP/
    //                                          waypoint_CLJ.json
    //                                          waypoint_TASON.jason
    //                                          waypointSOPAV.jason
    //                                          waypoint_BIRGU.jason
    //                                          waypoint_OTP.jason
}

package isp.lab8.airways.Repository;

import isp.lab8.airways.Model.Route;
import java.util.List;

public interface FileServiceInterface {
    public void save(Route r);
    public List<Route> readAll();
}

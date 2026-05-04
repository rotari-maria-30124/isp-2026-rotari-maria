package isp.lab8.airways.repository;

import isp.lab8.airways.model.Route;

import java.util.List;

public interface FileServiceInterface {
    public void save(Route w);
    public List<Route> readAll();
}
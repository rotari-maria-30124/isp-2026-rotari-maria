package isp.lab8.airways.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import examples.files.FilesAndFoldersUtil;
import isp.lab8.airways.Model.Route;
import isp.lab8.airways.Model.Waypoint;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class FileService implements FileServiceInterface{
    private String workingFolder;
    private ObjectMapper mapper;

    public FileService(){
        this.workingFolder= Paths.get("data", "airplaneRouteManagement").toAbsolutePath().toString();
        FilesAndFoldersUtil.createFolder(workingFolder);
        this.mapper=new ObjectMapper();
    }
    @Override
    public void save(Route r){
        String folderName=r.getRouteName();
        this.workingFolder=Paths.get("data", "airplaneRouteManagement", folderName).toAbsolutePath().toString();
        FilesAndFoldersUtil.createFolder((workingFolder));
        //waypoints can be extracted with a for loop from HashSet
        for(Waypoint w:r.getWaypoints()){
            try{
                saveWaypoint(w, w.getName().toString() + ".json");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    private void saveWaypoint(Waypoint w, String path) throws IOException {
        this.mapper.writeValue(new FileWriter(Paths.get(workingFolder, path).toString()), w);
    }
    public Waypoint loadWaypoint(String path){

    }

    @Override
    public List<Route> readAll() {
        return List.of();
    }
}

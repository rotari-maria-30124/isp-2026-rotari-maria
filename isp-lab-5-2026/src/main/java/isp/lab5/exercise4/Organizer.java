package isp.lab5.exercise4;

public class Organizer {
    private String name;

    public Organizer(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return "Organizer: \n" +
                "name= " + name;
    }
}

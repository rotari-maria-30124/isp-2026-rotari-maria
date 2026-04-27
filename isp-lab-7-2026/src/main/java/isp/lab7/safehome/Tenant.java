package isp.lab7.safehome;

public class Tenant {
    private String name;

    public Tenant(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {return this.name.hashCode()==(((Tenant)obj).name.hashCode());
    }
}

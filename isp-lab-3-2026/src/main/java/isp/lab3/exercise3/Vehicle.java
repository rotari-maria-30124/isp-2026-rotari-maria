package isp.lab3.exercise3;

public class Vehicle {
    public String model;
    public String type;
    public int speed;
    public char fuelType;
    private static int instance=0;

    private void checkFuelType(char fuelType){
        if(fuelType!='0' && fuelType!='8'){
            System.out.println("Invalid fuel type. It can be '0' ir '8'");
        }
        else{
            this.fuelType=fuelType;
        }
    }
    public Vehicle(String model, String type, int speed, char fuelType){
        this.model=model;
        this.type=type;
        this.speed=speed;
        checkFuelType(fuelType);
        instance++;
    }

    public String getModel() { //click dr->generate->get
        return model;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public String toString() {
        return this.model + "(" + this.type+ ") speed" + this.speed + "fuelType" + this.fuelType;
    }
    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Vehicle) obj).model) && this.type.equals(((Vehicle) obj).type) && this.speed == ((Vehicle) obj).speed && this.fuelType == ((Vehicle) obj).fuelType;
    }
}

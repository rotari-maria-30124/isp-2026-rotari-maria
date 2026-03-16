package isp.lab3.exercise1;

public class Tree {
    private int height;
    public Tree(){//default constructor(nu primeste nimic)
        this.height=15;
    }
    public Tree(int height){
        this.height=height;
    }
    public void grow(int meters){
        if(meters>=0){
            this.height+=meters;
        }
        else{
            System.out.println("The tree can grow >=1 meter value");
        }
    }
    public void grow(){//supraincarcare
        this.height+=1;
    }
    public int getHeight(){
        return this.height;
    }
    //suprascriere
    @Override
    public String toString(){
        return "Tree [height=" + height + "]";
    }
}

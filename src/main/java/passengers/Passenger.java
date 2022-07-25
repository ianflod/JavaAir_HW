package passengers;

import java.util.ArrayList;

public class Passenger {

    private String name;
    private int bags;

    public Passenger(String name, int bags){
        this.name = name;
        this.bags = bags;
    }

    public String getName(){
        return name;
    }

    public int bagCount(){
        return bags;
    }


}

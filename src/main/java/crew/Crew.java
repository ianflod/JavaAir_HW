package crew;

public abstract class Crew {

    private String name;


    public Crew(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public String sayMessage(){
        return "Welcome to Inverness";
    }
}

package crew.cabincrew;

import crew.Crew;
import crew.RankType;

public class CabinCrew extends Crew {


    private RankType rankType;

    public CabinCrew(String name, RankType rankType){
        super(name);
        this.rankType = rankType;
    }

    public String getStringFromEnum(){
        return this.rankType.getValue();
    }

//    public RankType getType(){
//        return rankType;
//    }


}

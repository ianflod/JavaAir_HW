package crew.pilots;

import crew.Crew;
import crew.RankType;

public class Pilot extends Crew {

    private RankType rankType;
    private String licence;

    public Pilot(String name, RankType rankType, String licence){
        super(name);
        this.rankType = rankType;
        this.licence = licence;
    }

    public String getStringFromEnum(){
        return this.rankType.getValue();
    }

    public String getLicence(){
        return licence;
    }

    public String flyPlane() {
        return "ZZoooomm";
    }
}


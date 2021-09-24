package ROOM;

public class Room {
     public String acCondition;
     public String htCondition;
     public String fCondition;
     public String lCondition;

    public String getAcCondition() {
        return acCondition;
    }

    public void setAcCondition(String acCondition) {
        this.acCondition = acCondition;
    }

    public String getHtCondition() {
        return htCondition;
    }

    public void setHtCondition(String htCondition) {
        this.htCondition = htCondition;
    }

    public String getfCondition() {
        return fCondition;
    }

    public void setfCondition(String fCondition) {
        this.fCondition = fCondition;
    }

    public String getlCondition() {
        return lCondition;
    }

    public void setlCondition(String lCondition) {
        this.lCondition = lCondition;
    }

    public Room(String acCondition, String htCondition, String fCondition, String lCondition) {
        this.acCondition = acCondition;
        this.htCondition = htCondition;
        this.fCondition = fCondition;
        this.lCondition = lCondition;
    }

    public boolean AC_ON(){
        if(getAcCondition().equals("ON")){
            return true;
        } else {
            return false;
        }
    }
    public boolean HOME_THEATRE_ON(){
        if (getHtCondition().equals("ON")){
            return true;
        } else {
            return false;
        }
    }
    public boolean FAN_ON(){
        if (getfCondition().equals("ON")){
            return true;
        } else {
            return false;
        }
    }
    public boolean LIGHT_ON(){
        if (getlCondition().equals("ON")){
            return true;
        } else {
            return false;
        }
    }
}


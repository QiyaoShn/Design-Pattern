package ChainOfResponsbilityPattern;
public class MissionRequest {
    private String missionName;
    private int EnemyNumber;

    public MissionRequest(String missonName, int EnemyNumber){
    	this.EnemyNumber = EnemyNumber;
    	this.missionName = missonName;
    }

    public void setmissionName(String missionName){
    	this.missionName = missionName;
    }

    public void setEnemyNumber(int EnemyNumber){
    	this.EnemyNumber = EnemyNumber;
    }

    public String getmissionName(){
        return(this.missionName);
    }

    public int getEnemyNumber(){
        return (this.EnemyNumber);
    }

}

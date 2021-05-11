package ChainOfResponsbilityPattern;
public abstract class Officer {
    protected String name;
    protected Officer successor;

    public Officer(String name){
    	this.name = name;
    }

    public void setSuccessor(Officer successor){
    	this.successor = successor;
    }

    public abstract void handleMission(MissionRequest request);

}

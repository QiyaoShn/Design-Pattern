package ChainOfResponsbilityPattern;
public class Banzhang extends Officer {

    public Banzhang(String name){
    	super(name);
    }

	@Override
	public void handleMission(MissionRequest request) {
		if(request.getEnemyNumber()<10) {
			System.out.println("班长"+name+"接收通讯员报告"+request.getmissionName()+"敌人数量为："+request.getEnemyNumber()+"人，下达作战命令。");
		}else {
			if(this.successor!=null) {
				this.successor.handleMission(request);
			}
		}
	}

}

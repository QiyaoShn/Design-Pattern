package ChainOfResponsbilityPattern;
public class Paizhang extends Officer {

    public Paizhang(String name){
    	super(name);
    }
	@Override
	public void handleMission(MissionRequest request) {
		// TODO Auto-generated method stub
		if(request.getEnemyNumber()<50) {
			System.out.println("排长"+name+"接收通讯员报告"+request.getmissionName()+"敌人数量为："+request.getEnemyNumber()+"人，下达作战命令。");
		}else {
			if(this.successor!=null) {
				this.successor.handleMission(request);
			}
		}
	}

}

package ChainOfResponsbilityPattern;
public class Yingzhang extends Officer {

    public Yingzhang(String name){
    	super(name);
    }
	@Override
	public void handleMission(MissionRequest request) {
		// TODO Auto-generated method stub
		if(request.getEnemyNumber()<200) {
			System.out.println("营长"+name+"接收通讯员报告"+request.getmissionName()+"敌人数量为："+request.getEnemyNumber()+"人，下达作战命令。");
		}else {
			//System.out.println("需要开会讨论再下达作战命令");
			if(this.successor!=null) {
				this.successor.handleMission(request);
			}//构成环状职责链，导致死循环，实际应用中应避免这种情况
		}
	}

}

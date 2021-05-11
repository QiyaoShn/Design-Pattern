package ChainOfResponsbilityPattern;

public class client {
	public static void main(String[] args) {
		Officer objBanzhang,objPaizhang,objYingzhang;
		
		objBanzhang = new Banzhang("张一");
		objPaizhang = new Paizhang("张二");
		objYingzhang = new Yingzhang("张三");
		
		objBanzhang.setSuccessor(objPaizhang);
		objPaizhang.setSuccessor(objYingzhang);
		objYingzhang.setSuccessor(objBanzhang);
		
		MissionRequest lr1 = new MissionRequest("王一", 5);
		objBanzhang.handleMission(lr1);
		MissionRequest lr2 = new MissionRequest("王二", 15);
		objBanzhang.handleMission(lr2);
		MissionRequest lr3 = new MissionRequest("王三", 56);
		objBanzhang.handleMission(lr3);
		MissionRequest lr4 = new MissionRequest("王四", 300);
		objBanzhang.handleMission(lr4);
	}
}

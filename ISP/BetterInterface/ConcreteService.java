package BetterInterface;

public class ConcreteService implements AbstractServiceA,AbstractServiceB,AbstractServiceC{
	/*通过对接口细化，可以将其分割为三个专门的接口，每个接口中只包含一个方法，用于对应一个客户端
	 ，每个客户端只能看到与自己相关的业务方法，不能访问其他方法，保证了系统具有良好的封装性。但是，
	 接口不能太小，会造成接口泛滥，不利于维护；也不能太大，会违背接口隔离原则，灵活性差。*/
	@Override
	public void operatorC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operatorB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operatorA() {
		// TODO Auto-generated method stub
		
	}

}

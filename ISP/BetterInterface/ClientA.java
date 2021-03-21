package BetterInterface;

public class ClientA {
	//在使用接口隔离原则时需要注意接口的粒度，接口不能太小（接口中的方法以及实现该接口的类不能太多）
	//如果太小会导致系统中接口泛滥不利于维护；接口也不能太大，太大的接口将违背接口隔离原则，灵活性较差。
	AbstractServiceA a = new AbstractServiceA() {
		
		@Override
		public void operatorA() {
			// TODO Auto-generated method stub
			
		}
	};
}

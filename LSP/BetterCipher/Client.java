package BetterCipher;

public class Client {
	/*Client类和DataOperator类都针对CipherA进行编程，根据里氏代换
	 原则，能接受CipherA类的对象也能接受其子类CipherB类的对象，并且
	 将CipherA类对象替换成CipherB类对象很方便。如需增加新的加密算法
	 类，只需将其作为CipherA类或CipherB类的子类。*/
	DataOperator a = new DataOperator();
	CipherA b = new CipherA();
	public static void main(String[] args) {
		
	}
}

package BetterCipher;

public class CipherA {
	/*所有引用父类的地方必须也能透明地使用其子类的对象，反之不然。
	这就要求子类中的方法必须要在父类中声明，或者子类必须实现父类中声明的
	所有方法。运用里氏代换原则时父类最好设计成抽象类或者接口。*/
	public String encrypt(String plainText) {
		return plainText;
	}
}

package BadCipher;
public class Client {
	/*如需更换或使用新的一个加密算法类，需要修改该类和DataOperator
	 的源代码，违背了开闭原则*/
	public static void main(String[] args) {
		CipherA cipherA = new CipherA();
		DataOperator do = new DataOperator();
		do.setCipherA(cipherA);
	}
}

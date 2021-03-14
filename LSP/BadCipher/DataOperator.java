package BadCipher;

public class DataOperator {
	private CipherA cipherA;
	private CipherB cipherB;
	public void setCipherA(CipherA cipherA) {
	
	}
	public void setCipherB(CipherB cipherB) {
		
	}
	public String encrypt(String plainText) {
		return cipherA.encrypt(plainText);
	}
}

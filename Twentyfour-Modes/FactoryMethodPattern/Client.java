package FactoryMethodPattern;
public class Client {
	
	//封装生产细节
	public static void main(String[] args) {
		//Factory factory = new AFactory();
		Factory factory = (Factory)XMLUtil.getBean();
		Fruit fruit = factory.CreateFruit();
		fruit.eat();
	}
}

package SimpleFactoryPattern;

import java.lang.reflect.InvocationTargetException;

public class ClientClass {
	//当工厂类负责创建的对象比较少；客户端只知道传入工厂类的参数
	//对于如何创建对象不关心时可以使用简单工厂模式。
	//简单工厂模式又叫静态工厂方法模式（类创建型模式）
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		try {
			Fruit fruit;
			String fruitName = XMLUtil.getFruitName();
			fruit = Factory.CreateFruit(fruitName);
			fruit.eat();
			}catch(Exception e){
				System.out.println("暂无您要的水果!");
			}
	}	
}

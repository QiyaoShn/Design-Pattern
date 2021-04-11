package SimpleFactoryPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Factory {
	//使用静态工厂方法，造成工厂角色无法形成基于继承的等级结构，
	//因此只适用于一些并不复杂的环境下
    public static Fruit CreateFruit(String fruitName)throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException{
       Class<?> classCal = Class.forName("SimpleFactoryPattern."+fruitName);
       Constructor<?> c = classCal.getConstructor();
       Fruit cal = (Fruit)c.newInstance();
       return cal;
       //利用反射机制，使用类的无参数构造器来新建一个类的实例
       // 另一种实现方式：return (Fruit)Class.forName("SimpleFactoryPattern."+fruitName).getDeclaredConstructor().newInstance();
    }
}

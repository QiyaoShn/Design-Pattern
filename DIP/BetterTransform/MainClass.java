package BetterTransform;

public class MainClass {
	/*依赖倒转原则的常用实现方式之一是在代码中使用抽象类，而将
	 具体类放进元数据。要针对接口编程，不要针对实现编程。*/
	AbstructSource a = new AbstructSource() {
	};
	AbstractTransformer b = new AbstractTransformer() {
	};
}

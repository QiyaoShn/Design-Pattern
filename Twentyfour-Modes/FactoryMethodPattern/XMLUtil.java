package FactoryMethodPattern;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.lang.reflect.Constructor;
public class XMLUtil {
	//该方法用于从xml配置文件中提取水果名称，并返回该水果名称
	public static Object getBean() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("newFruitConfig.xml"));
			//获取包含品牌名称的文本节点
			NodeList nl = doc.getElementsByTagName("factoryName");
			Node classNode = nl.item(0).getFirstChild();
			String factoryname = classNode.getNodeValue();
			
			//通过类名生成实例对象并将其返回
			Class<?> c = Class.forName("FactoryMethodPattern."+factoryname);
			Constructor<?> cal = c.getConstructor();
			Object call = (Object)cal.newInstance();
			return call;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

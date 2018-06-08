package test;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import main.Student;

public class Test {

	public static void main(String[] args) {
		Test[] test=new Test[10];
		String[] string=new String[10];
		int[] hey=new int[10];
		Resource resrc=new ClassPathResource("applicationContext.xml");
		BeanFactory bFac=new XmlBeanFactory(resrc);
		Student s=(Student)bFac.getBean("studentBean");
		s.displayInfo();
	}
}

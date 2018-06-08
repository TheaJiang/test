package test;

import java.io.File;
import java.io.IOException;

import trial.InputStreamTrial;

public class ExecutionClass {
	public static void main(String[] args) throws IOException
//	{
//		char[] test={'i',13,'a','m','\n','a','\r','g','o','\r','\n','g','i'};
//		StringBuilder sb=new StringBuilder();
//		sb.append(test);
//		System.out.println(sb);
//		
//	}
	{
		File sourceF = new File("C:\\Users\\I317617\\workspace\\self\\PleaseMergeTo_AdvancedJavaTrial\\src\\data\\test.txt");
		File targetF = new File("C:\\Users\\I317617\\workspace\\self\\WebProj\\WebContent\\taostyle.css");
		
		InputStreamTrial test =new InputStreamTrial(sourceF,targetF);
		test.execute();
	}

}

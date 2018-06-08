package main;

import java.io.*;

public class InputStreamTrial {
	
	File sourceF = null;
	File targetF = null;

	public InputStreamTrial(File sourceF,File targetF){
		this.sourceF=sourceF;
		this.targetF=targetF;
	}
	
	public void execute() throws IOException {
		Reader r=null;
		Writer w=null;
		try {
			System.out.println(sourceF.getPath());
			System.out.println(targetF.getPath());
			
			 r = new FileReader(sourceF);
			 w=new FileWriter(targetF);
			
			char[] cbuf=new char[20];
			StringBuilder charStore=new StringBuilder();
			while(r.read(cbuf)!=-1){
//				System.out.print(cbuf);
				
				for(int m=0;m<cbuf.length;m++){
					charStore.append(cbuf[m]);
					
					if(cbuf[m]=='}'){
						charStore.append('\n');
					}
					
				}
				
			}
			w.write(charStore.toString().toCharArray());
		} catch (FileNotFoundException e) {
			System.out.println("File is not found!");
		}
		catch(IOException e){
			System.out.print("Encountered problem when reading the source file!");
		}finally{
			r.close();
			w.flush();
			w.close();
		}
	}

}

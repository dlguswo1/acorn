package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.URL;

public class ApplicationBean {
	private int visitCount;
	private String path;
	
	public ApplicationBean() {
		BufferedReader br = null;
		try{
			URL url = getClass().getResource("/");
			// getResource : 현재 위치(경로)를 알아내기 위함
			path = url.getPath().substring(1) + "counter.txt";
			
			br = new BufferedReader(new FileReader(path));
			String strCounter = br.readLine();
			visitCount = Integer.parseInt(strCounter);
		}
		catch(Exception err){
			err.printStackTrace();
		}
		finally{
			if(br != null){
				try{
					br.close();
				}
				catch(Exception err){}
			}
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		setFile();
	}

	public void setFile(){
		PrintWriter pw = null;
		
		try{
			pw = new PrintWriter(path);
			pw.println(visitCount);
		}
		catch(Exception err){
			err.printStackTrace();
		}
		finally{
			if(pw != null){
				try{
					pw.close();
				}
				catch(Exception err){}
			}
		}
	}
	
	public void setCounter(int num) {
		visitCount++;
		setFile();
	}
	
	public int getCounter() {
		return visitCount;
	}
}
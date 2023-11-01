package com.example;

public class SessionBean {
	private long startTime; // 경과한 시간
	private long instTime; // 처음 시작한 시간
	private long lastAccessTime; // 마지막 접근한 뒤 경과한 시간
	
	public SessionBean(){
		startTime = System.currentTimeMillis();
		instTime = startTime;
		lastAccessTime = startTime;
	}
	
	public long getElapsedTime(){
		lastAccessTime = System.currentTimeMillis();
		return (lastAccessTime - startTime)/1000;
	}
	
	public void setRestart(boolean b){
		// 매개변수는 무조건 있어야 하므로 아무거나 형석적으로 넣어줌
		// 안넣으면 에러남 파라미터가 넘어 오는 것이 있냐 없냐를 true false로 받아놓은 것 뿐
		startTime = System.currentTimeMillis();
		lastAccessTime = System.currentTimeMillis();
	}
	
	public long getElapsedTimeAfterInst(){
		lastAccessTime = System.currentTimeMillis();
		return (lastAccessTime - instTime)/1000;
	}
	
	public long getElapsedTimeAfterLastAccess(){
		long current = System.currentTimeMillis();
		long elapsed = (current-lastAccessTime)/1000;
		
		lastAccessTime = System.currentTimeMillis();
		
		return elapsed;
	}
}
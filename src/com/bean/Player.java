package com.bean;

import java.util.Scanner;

public class Player {
	private int levelNo;
	private int curScore;
	private long startTime;
	private long elapsedTime;
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getCurScore() {
		return curScore;
	}
	public void setCurScore(int curScore) {
		this.curScore = curScore;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	public void play(){
		while(true){
			Game game = new Game();
			game.setPlayer(this);
			Scanner scanner = new Scanner(System.in);
			String out = game.printStr().toString();
			String in = scanner.next();
			game.printResult(out,in);
			
		}
		
		
	}
	
	
	
}

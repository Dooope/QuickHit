package com.bean;

public class Level {

	private int levelNo;
	private int strLenth;
	private int strTimes;
	private int timeLimit;
	private int perScore;
	public Level(int levelNo, int strLenth, int strTimes, int  timeLimit, int perScore) {
		this.levelNo = levelNo;
		this.strLenth = strLenth;
		this.strTimes = strTimes;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
	}
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getStrLenth() {
		return strLenth;
	}
	public void setStrLenth(int strLenth) {
		this.strLenth = strLenth;
	}
	public int getStrTimes() {
		return strTimes;
	}
	public void setStrTimes(int strTimes) {
		this.strTimes = strTimes;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
	
	
}

package com.bean;

import java.nio.Buffer;
import java.util.Random;

public class Game {

	private Player player;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public StringBuffer printStr(){
		LevelParam levelParam = new LevelParam();
		StringBuffer stringBuffer = new StringBuffer();
		Random random = new Random();
		Level level = levelParam.levels[player.getLevelNo()];
		for(int i=0;i<level.getStrLenth();i++){
			int ran = random.nextInt(level.getStrLenth());
			switch (ran) {
			case 0:
				stringBuffer.append(">");
				break;
			case 1:
				stringBuffer.append("<");
				break;
			case 2:
				stringBuffer.append("=");
				break;
			case 3:
				stringBuffer.append(".");
				break;
			case 4:
				stringBuffer.append("+");
				break;
			case 5:
				stringBuffer.append("-");
				break;
			case 6:
				stringBuffer.append("*");
				break;
			case 7:
				stringBuffer.append("/");
				break;
			default:
				break;
			}
		}
		System.out.println(stringBuffer);
		player.setStartTime(System.currentTimeMillis());
		return stringBuffer;
	}
	
	public void printResult(String out,String in){
		LevelParam levelParam = new LevelParam();
		Level level = levelParam.levels[player.getLevelNo()];
		long currenTime = System.currentTimeMillis();
		player.setElapsedTime((currenTime - player.getStartTime())/1000);
		if(player.getElapsedTime()>level.getTimeLimit()){
			System.out.println("你输入太慢了，已经超时，退出");
			System.exit(1);
		}else{
			if(out.equals(in)){
				player.setCurScore(player.getCurScore()+level.getPerScore());
				player.setLevelNo(player.getLevelNo()+1);
				System.out.println("输入正确，您的积分："+player.getCurScore()+",您的级别："+player.getLevelNo()+"已用时间："+(currenTime - player.getStartTime())/1000+"秒");
				if(player.getLevelNo()==5){
					System.out.println("已达到最高级别，退出");
					System.exit(0);
				}
			}else{
				System.out.println("输入错误，退出");
				System.exit(1);
			}
		}
		
	}
}

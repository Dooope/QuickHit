package com.bean;

public class LevelParam {
	public final static Level levels[]=new Level[6];
	static{
		levels[0]=new Level(1, 2, 10, 30,1);
		levels[1]=new Level(2, 3, 9, 25,2); 
		levels[2]=new Level(3, 4, 8, 15,5); 
		levels[3]=new Level(4, 5, 7, 5,8); 
		levels[4]=new Level(5, 6, 6, 4,10); 
		levels[5]=new Level(6, 7, 5, 3,15);

	}
}

package com.hfy.array;

import java.util.Arrays;

//安排篮球运动员上场
public class basketballPlayerDemo {

	public static void main(String[] args) {
		//初始容量为5的线性列表
		PlayerList.init(5);
		//  2):安排5个球员上场:[11,22,33,44,55]
		PlayerList.add(11);
		PlayerList.add(22);
		PlayerList.add(33);
		PlayerList.add(44);
		PlayerList.add(55);
		//打印
		PlayerList.print();
		//查询索引位置为2的球衣号码是:33
		//Integer num = get(2);
		//System.out.println(num);
		//44球衣号的球员在场上的索引位置是:3
		//int index = getIntegerByPlayerNum(44);
		//System.out.println(index);
		//把索引为2的球员替换为333
		//set(2,333);
		//print();//[11,22,333,44,55]
		//update(33, 888);
		//print();
		//delete(2);//删除索引为2的元素
		//print();//[11,22,44,55]
	}

}

package com.android;

import java.math.BigInteger;
import java.util.ArrayList;

import android.app.Application;

public class Counter extends Application{
	
	//int count;
	int life3;
	public int getLife3() {
		return life3;
	}

	public void setLife3(int life3) {
		this.life3 = life3;
	}

	int life2;
	public int getLife2() {
		return life2;
	}

	public void setLife2(int life2) {
		this.life2 = life2;
	}

	int life1;

	public int getLife1() {
		return life1;
	}

	public void setLife1(int life1) {
		this.life1 = life1;
	}

	ArrayList arr;
	
       public ArrayList getArr() {
		return arr;
	}

	public void setArr(ArrayList arr) {
		this.arr = arr;
	}

	int count ;
        public String  getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	String  amount="0";
        
    
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
}

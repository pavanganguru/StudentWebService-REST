package com.dxc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marks {
	@Id
	private int stid;
	private String exid;
	private int sub1;
	private int sub2;
	private int sub3;

	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marks(int stid, String exid, int sub1, int sub2, int sub3) {
		super();
		this.stid = stid;
		this.exid = exid;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getExid() {
		return exid;
	}

	public void setExid(String exid) {
		this.exid = exid;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	@Override
	public String toString() {
		return "Marks [stid=" + stid + ", exid=" + exid + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}

}
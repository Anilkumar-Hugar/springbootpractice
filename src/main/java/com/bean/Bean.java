package com.bean;

public class Bean {
	String msg;
	static boolean isBeanInst = false;

	public Bean() {
	}

	public Bean(String msg) {
		super();
		this.msg = msg;
	}

	public static boolean postConstruct() {
		Bean.setBeanInst(true);
		if(isBeanInst==true) return true;
		else return false;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static boolean isBeanInst() {
		return isBeanInst;
	}

	public static void setBeanInst(boolean isBeanInst) {
		Bean.isBeanInst = isBeanInst;
	}

}

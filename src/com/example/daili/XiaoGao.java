package com.example.daili;

public class XiaoGao implements  Test {
	private  Test test;
	//小高也有考试的功能
	public XiaoGao(){
		
		this.test = new XiaoWang();
	
	}
	
	public XiaoGao(Test test){
		this.test = test;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		//名字是小高的，其实是小王在做题
		test.work();
	}

	
}

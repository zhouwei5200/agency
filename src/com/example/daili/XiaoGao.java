package com.example.daili;

public class XiaoGao implements  Test {
	private  Test test;
	//С��Ҳ�п��ԵĹ���
	public XiaoGao(){
		
		this.test = new XiaoWang();
	
	}
	
	public XiaoGao(Test test){
		this.test = test;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		//������С�ߵģ���ʵ��С��������
		test.work();
	}

	
}

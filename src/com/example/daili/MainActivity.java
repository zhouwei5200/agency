package com.example.daili;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //老师以为是小高在考试，其实是小王在做题
        XiaoGao gao = new XiaoGao();
        gao.work();
		
    }
    
    


    
}

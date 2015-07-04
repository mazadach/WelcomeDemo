package com.example.welcomedemo;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;


public class WelcomeActivity extends Activity {

		 
	    private final int SPLASH_DISPLAY_LENGHT = 3000; //延迟三秒 
	 
	    @Override
	    public void onCreate(Bundle savedInstanceState) { 
	        super.onCreate(savedInstanceState); 
	        setContentView(R.layout.activity_welcome); 
	        new Handler().postDelayed(new Runnable(){ 
	 
	         @Override
	         public void run() { 
	             Intent mainIntent = new Intent(WelcomeActivity.this,MainActivity.class); 
	             WelcomeActivity.this.startActivity(mainIntent); 
	             WelcomeActivity.this.finish(); 
	         } 
	             
	        }, SPLASH_DISPLAY_LENGHT); 
	    } 
	}

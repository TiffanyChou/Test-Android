package com.sample.pcomproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OtherActivity extends Activity implements OnClickListener {
	
	Button myButton1;
	Button myButton2;
	Button myButton3;
	
	//get this from MainActivity.java
	 @Override // not important. 
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.other_layout);
	        
	        myButton1 = (Button) findViewById(R.id.button2);
	        myButton1.setOnClickListener(this);
	        
	        myButton2 = (Button) findViewById(R.id.button3);
	        myButton2.setOnClickListener(this);
	        
	        myButton3 = (Button) findViewById(R.id.button4);
	        myButton3.setOnClickListener(this);
	    }
	   @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.activity_main, menu);
	        return true;
	    }
	 

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.v("mainActivity","I was clicked");
		Intent o = new Intent(this,OldProject.class);
		startActivity(o);
		
	}

    

}

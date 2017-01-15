package com.android;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KBCActivity extends Activity {
    /** Called when the activity is first created. */
	Button play,rules,exit,rate;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        play=(Button) findViewById(R.id.play);
        rules=(Button) findViewById(R.id.rules);
        exit=(Button) findViewById(R.id.exit);
       
        
        play.setOnClickListener(new OnClickListener() {
    		public void onClick(View v) {
    			play.setBackgroundResource(R.color.green);
    			  Intent i = new Intent(KBCActivity.this, GameActivity.class);
    		        startActivity(i);
    			//setContentView(R.layout.game);
    		}
    		
    });
        exit.setOnClickListener(new OnClickListener() {
    		public void onClick(View v) {
    			exit.setBackgroundResource(R.color.green);
    			Intent intent = new Intent(Intent.ACTION_MAIN);
    			intent.addCategory(Intent.CATEGORY_HOME);
    			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    			startActivity(intent);
    			
    		}
    		
    });
        
        rules.setOnClickListener(new OnClickListener() {
    		public void onClick(View v) {
    			rules.setBackgroundResource(R.color.green);
    			 Intent i = new Intent(KBCActivity.this, ruleActivity.class);
 		        startActivity(i);
    			
    		}
    		
    });
        
    }
}
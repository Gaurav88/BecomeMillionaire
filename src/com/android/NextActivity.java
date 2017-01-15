package com.android;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity  extends Activity{
	
	 Button next,finish;

	public void onBackPressed() {

		   return;
		}
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winamount);
        TextView text,text1; 
        String s= getIntent().getExtras().get("myKey").toString();
        text=(TextView)findViewById(R.id.text);
       // text1=(TextView)findViewById(R.id.text1);
        next = (Button) findViewById(R.id.next);
        finish = (Button) findViewById(R.id.finish);
      // finish.setVisibility(View.GONE);
       
       if(s.equalsIgnoreCase("1,00,00,000")){
    	   text.setText("Congratulation, Your answer is right....."+"\n\nYou have Won $."+s+"\n\nYOU ARE THE WINNER OF THIS GAME.");
    	   next.setVisibility(View.GONE); 
    	   finish.setVisibility(View.VISIBLE);
    	   
       }else{
        text.setText("Congratulation, Your answer is right....."+"\n\nYou have Won $: "+s);
       // text1.setText("You have won Rs: "+s);
       }
       
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	next.setBackgroundResource(R.color.green);
            	Intent in = new Intent(NextActivity.this, GameActivity.class);
            	
           	// in.putExtra("myKey", amount);
		        startActivity(in);
           
            } 
         });
        finish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	finish.setBackgroundResource(R.color.green);
            	Intent in = new Intent(NextActivity.this, KBCActivity.class);
            	
               	// in.putExtra("myKey", amount);
    		        startActivity(in);
               
           
            } 
         });
	}

}

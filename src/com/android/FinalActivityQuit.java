package com.android;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivityQuit extends Activity{
	

	 Button quit;
	public void onBackPressed() {

		   return;
		}

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amount);
        TextView text,text1;
        String s= getIntent().getExtras().get("myKey").toString();
        
        text=(TextView)findViewById(R.id.text); 
      //  text1=(TextView)findViewById(R.id.text1);
         quit = (Button) findViewById(R.id.quit);
        text.setText("Your final amount is $: "+s);
        //text1.setText("Your final amount is Rs: "+s+" and the correct answer is "+s1);
        
        quit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	quit.setBackgroundResource(R.color.green);
            	Intent in = new Intent(FinalActivityQuit.this, KBCActivity.class);
            	
           	// in.putExtra("myKey", amount);
		        startActivity(in);
           
            } 
         });
        
	}
}

package com.android;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends Activity{
	

	Button quit;
	public void onBackPressed() {

		   return;
		}

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amount);
        TextView text,text1;
        String s= getIntent().getExtras().get("myKey").toString();
        String s1= getIntent().getExtras().get("myKey1").toString();
        text=(TextView)findViewById(R.id.text); 
      //  text1=(TextView)findViewById(R.id.text1);
         quit = (Button) findViewById(R.id.quit);
        text.setText("Sorry, your ans is wrong...you have to quit the game\n"+"\nThe Correct Answer is : "+s1+"\n\nYour final amount is $: "+s);
        //text1.setText("Your final amount is Rs: "+s+" and the correct answer is "+s1);
        
        quit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	quit.setBackgroundResource(R.color.green);
            	Intent in = new Intent(FinalActivity.this, KBCActivity.class);
            	
           	// in.putExtra("myKey", amount);
		        startActivity(in);
           
            } 
         });
        
	}
}

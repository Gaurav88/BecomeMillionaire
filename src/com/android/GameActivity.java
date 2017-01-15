package com.android;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class GameActivity extends Activity {


	//int count;
	  /*Counter flag = (Counter)getApplicationContext();
	  int count=flag.getCount();*/
	// int amount = 0;
	Button quit,opt1,opt2,opt3,opt4,life1,life2,life3; 
	String rs;
	 //Counter flag = (Counter)getApplicationContext();
	final static Counter flag=new Counter();
 	final   int count=flag.getCount();
 	 final  String  amount=flag.getAmount();
 	final  int lifeLine1=flag.getLife1();
 	final int lifeLine2=flag.getLife2();
 	final int lifeLine3=flag.getLife3();
 	  ArrayList<Integer> arr= new ArrayList<Integer>();
 	  
 	  
 	  public void setA(final String ans){
 		 final AlertDialog.Builder builder = new AlertDialog.Builder(this);
 		 opt1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 Intent in = new Intent(GameActivity.this, NextActivity.class);
            	 opt1.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctanswer);
                 mediaPlayer.start();
            	 switch(count){
            	 case 0:
            		 flag.setAmount("5,000");
            		 flag.setCount(count+1);
            	 break;
            	 case 1:
            		 flag.setAmount("10,000");
            		 flag.setCount(count+1);
            		
            		 break;
            	 case 2:
            		 flag.setAmount("20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 3:
            		 flag.setAmount("40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 4:
            		 flag.setAmount("80,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 5:
            		 flag.setAmount("1,60,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 6:
            		 flag.setAmount("3,20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 7:
            		 flag.setAmount("6,40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 8:
            		 flag.setAmount("12,50,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 9:
            		 flag.setAmount("25,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 10:
            		 flag.setAmount("50,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 11:
            		 flag.setAmount("1,00,00,000");
            		 flag.setCount(count+1);
            		 flag.setCount(0);
  	        	   flag.setAmount("0");
  	        	   flag.setLife1(0);
  	        	   flag.setLife2(0);
  	        	   flag.setLife3(0); 
            		 break;
            	
            	 }
            	 rs=flag.getAmount();
            	 if(count==11){
            		 rs="1,00,00,000";
            	 }
            	 in.putExtra("myKey", rs);
 		        startActivity(in);
            
             } 
          });
    	 opt2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {

            	 opt2.setBackgroundResource(R.color.red);
            	 opt1.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
            	 flag.setCount(0);
                 flag.setAmount("0");
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 opt3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt3.setBackgroundResource(R.color.red);
            	 opt1.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
            	   flag.setLife1(0);
            	   flag.setCount(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
             } 
          });
    	 opt4.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt4.setBackgroundResource(R.color.red);
            	 opt1.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
                 flag.setCount(0);
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 life1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 if(lifeLine1==0){
            	 builder.setMessage("Are you sure you want to use your Life Line ?")
            	        .setCancelable(false)
            	        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	            	opt2.setVisibility(View.GONE);
                           	 opt3.setVisibility(View.GONE);
                           	 flag.setLife1(1);
            	            }
            	        })
            	        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	                 dialog.cancel();
            	            }
            	        });
            	 AlertDialog alert = builder.create();
            	 alert.show();
             }
    	 else{
    		 builder.setMessage("You have already used your life line...")
 	        .setCancelable(false)
 	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
 	            public void onClick(DialogInterface dialog, int id) {
 	            	dialog.cancel();
 	            }
 	        });
    		 AlertDialog alert = builder.create();
        	 alert.show();
    	 }
             }
             });
    	 
    	 life2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 if(lifeLine2==0){
                	 builder.setMessage("I Think the Correct Answer is A")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                               	 flag.setLife2(1);
                	            }
                	        });
                	       
                	 AlertDialog alert = builder.create();
                	alert.setTitle("Amitabh Bachchan");
                	alert.setIcon(R.drawable.amitabh);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 }
          });
    	 
    	 life3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 if(lifeLine3==0){
                	 builder.setMessage("Option A:          62% \nOption B:          10% \nOption C:          18% \nOption D:          10%")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                	            	flag.setLife3(1);
                	            }
                	        });
                	        
                	 AlertDialog alert = builder.create();
                	 //alert.setIcon(R.drawable.button);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 
            	                	 
             } 
          });
 	  }
 	  
 	  public void setB(final String ans){
 		 final AlertDialog.Builder builder = new AlertDialog.Builder(this);
 		 opt1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt1.setBackgroundResource(R.color.red);
            	 opt2.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            
            	 if(count >5 && count<12){
             		flag.setAmount("1,60,000");
             	}
               rs=flag.getAmount();
               flag.setCount(0);
               flag.setAmount("0");
          	   flag.setLife1(0);
          	   flag.setLife2(0);
          	   flag.setLife3(0);
            	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
            	
            	 in.putExtra("myKey", rs);
            	 in.putExtra("myKey1", ans);
 		        startActivity(in);
            
             } 
          });
    	 opt2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	
            	 Intent in = new Intent(GameActivity.this, NextActivity.class);
            	 opt2.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctanswer);
                 mediaPlayer.start();
            	 switch(count){
            	 case 0:
            		 flag.setAmount("5,000");
            		 flag.setCount(count+1);
            	 break;
            	 case 1:
            		 flag.setAmount("10,000");
            		 flag.setCount(count+1);
            		
            		 break;
            	 case 2:
            		 flag.setAmount("20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 3:
            		 flag.setAmount("40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 4:
            		 flag.setAmount("80,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 5:
            		 flag.setAmount("1,60,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 6:
            		 flag.setAmount("3,20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 7:
            		 flag.setAmount("6,40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 8:
            		 flag.setAmount("12,50,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 9:
            		 flag.setAmount("25,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 10:
            		 flag.setAmount("50,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 11:
            		 flag.setAmount("1,00,00,000");
            		 flag.setCount(count+1);
            		 flag.setCount(0);
  	        	   flag.setAmount("0");
  	        	   flag.setLife1(0);
  	        	   flag.setLife2(0);
  	        	   flag.setLife3(0);  
            		 break;
            	
            	 }
            	 rs=flag.getAmount();
            	 if(count==11){
            		 rs="1,00,00,000";
            	 }
            	 in.putExtra("myKey", rs);
 		        startActivity(in);
             } 
          });
    	 opt3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt3.setBackgroundResource(R.color.red);
            	 opt2.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
            	 flag.setCount(0);
                 flag.setAmount("0");
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 opt4.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt4.setBackgroundResource(R.color.red);
            	 opt2.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
            	 flag.setCount(0);
                 flag.setAmount("0");
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 life1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 if(lifeLine1==0){
            	 builder.setMessage("Are you sure you want to use your Life Line ?")
            	        .setCancelable(false)
            	        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	            	opt1.setVisibility(View.GONE);
                           	 opt3.setVisibility(View.GONE);
                           	 flag.setLife1(1);
            	            }
            	        })
            	        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	                 dialog.cancel();
            	            }
            	        });
            	 AlertDialog alert = builder.create();
            	 alert.show();
             }
    	 else{
    		 builder.setMessage("You have already used your life line...")
 	        .setCancelable(false)
 	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
 	            public void onClick(DialogInterface dialog, int id) {
 	            	dialog.cancel();
 	            }
 	        });
    		 AlertDialog alert = builder.create();
        	 alert.show();
    	 }
             }
             });
    	 
    	 life2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 if(lifeLine2==0){
                	 builder.setMessage("I Think the Correct Answer is B")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                               	 flag.setLife2(1);
                	            }
                	        });
                	       
                	 AlertDialog alert = builder.create();
                	alert.setTitle("Amitabh Bachchan");
                	alert.setIcon(R.drawable.amitabh);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 }
          });
    	 
    	 life3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 if(lifeLine3==0){
                	 builder.setMessage("Option A:          12% \nOption B:          60% \nOption C:          18% \nOption D:          10%")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                	            	flag.setLife3(1);
                	            }
                	        });
                	        
                	 AlertDialog alert = builder.create();
                	 //alert.setIcon(R.drawable.button);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 
            	                	 
             } 
          });
 	  }

 	  public void setC(final String ans){
 		 final AlertDialog.Builder builder = new AlertDialog.Builder(this);
 		 opt1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt1.setBackgroundResource(R.color.red);
            	 opt3.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
                 flag.setCount(0);
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 opt2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt2.setBackgroundResource(R.color.red);
            	 opt3.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000"); 
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
                 flag.setCount(0);
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 opt3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 Intent in = new Intent(GameActivity.this, NextActivity.class);
            	 opt3.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctanswer);
                 mediaPlayer.start();
            	 switch(count){
            	 case 0:
            		 flag.setAmount("5,000");
            		 flag.setCount(count+1);
            	 break;
            	 case 1:
            		 flag.setAmount("10,000");
            		 flag.setCount(count+1);
            		
            		 break;
            	 case 2:
            		 flag.setAmount("20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 3:
            		 flag.setAmount("40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 4:
            		 flag.setAmount("80,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 5:
            		 flag.setAmount("1,60,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 6:
            		 flag.setAmount("3,20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 7:
            		 flag.setAmount("6,40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 8:
            		 flag.setAmount("12,50,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 9:
            		 flag.setAmount("25,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 10:
            		 flag.setAmount("50,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 11:
            		 flag.setAmount("1,00,00,000");
            		 flag.setCount(count+1);
            		 flag.setCount(0);
  	        	   flag.setAmount("0");
  	        	   flag.setLife1(0);
  	        	   flag.setLife2(0);
  	        	   flag.setLife3(0); 
            		 break;
            	
            	 }
            	 rs=flag.getAmount();
            	 if(count==11){
            		 rs="1,00,00,000";
            	 }
            	 in.putExtra("myKey", rs);
 		        startActivity(in);
            
             } 
          });
    	 opt4.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt4.setBackgroundResource(R.color.red);
            	 opt3.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
                 flag.setCount(0);
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 life1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 if(lifeLine1==0){
            	 builder.setMessage("Are you sure you want to use your Life Line ?")
            	        .setCancelable(false)
            	        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	            	opt1.setVisibility(View.GONE);
                           	 opt2.setVisibility(View.GONE);
                           	 flag.setLife1(1);
            	            }
            	        })
            	        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	                 dialog.cancel();
            	            }
            	        });
            	 AlertDialog alert = builder.create();
            	 alert.show();
             }
    	 else{
    		 builder.setMessage("You have already used your life line...")
 	        .setCancelable(false)
 	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
 	            public void onClick(DialogInterface dialog, int id) {
 	            	dialog.cancel();
 	            }
 	        });
    		 AlertDialog alert = builder.create();
        	 alert.show();
    	 }
             }
             });
    	 
    	 life2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 if(lifeLine2==0){
                	 builder.setMessage("I Think the Correct Answer is C")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                               	 flag.setLife2(1);
                	            }
                	        });
                	       
                	 AlertDialog alert = builder.create();
                	alert.setTitle("Amitabh Bachchan");
                	alert.setIcon(R.drawable.amitabh);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 }
          });
    	 
    	 life3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 if(lifeLine3==0){
                	 builder.setMessage("Option A:          12% \nOption B:          10% \nOption C:          68% \nOption D:          10%")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                	            	flag.setLife3(1);
                	            }
                	        });
                	        
                	 AlertDialog alert = builder.create();
                	// alert.setIcon(R.drawable.button);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 
            	                	 
             } 
          });  
 	  }
 	  
 	  public void setD(final String ans){
 		 final AlertDialog.Builder builder = new AlertDialog.Builder(this);
 		 opt1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt1.setBackgroundResource(R.color.red);
            	 opt4.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
                 flag.setCount(0);
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 opt2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt2.setBackgroundResource(R.color.red);
            	 opt4.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
                 flag.setCount(0);
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
             } 
          });
    	 opt3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 opt3.setBackgroundResource(R.color.red);
            	 opt4.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wronganswer);
                 mediaPlayer.start();
            	 if(count >5 && count<12){
              		flag.setAmount("1,60,000");
              	}
            	 rs=flag.getAmount();
                 flag.setAmount("0");
                 flag.setCount(0);
            	   flag.setLife1(0);
            	   flag.setLife2(0);
            	   flag.setLife3(0);
              	 Intent in = new Intent(GameActivity.this, FinalActivity.class);
              	
              	 in.putExtra("myKey", rs);
              	 in.putExtra("myKey1", ans);
   		        startActivity(in);
            
             } 
          });
    	 opt4.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 Intent in = new Intent(GameActivity.this, NextActivity.class);
            	 opt4.setBackgroundResource(R.color.green);
            	 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctanswer);
                 mediaPlayer.start();
            	 switch(count){
            	 case 0:
            		 flag.setAmount("5,000");
            		 flag.setCount(count+1);
            	 break;
            	 case 1:
            		 flag.setAmount("10,000");
            		 flag.setCount(count+1);
            		
            		 break;
            	 case 2:
            		 flag.setAmount("20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 3:
            		 flag.setAmount("40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 4:
            		 flag.setAmount("80,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 5:
            		 flag.setAmount("1,60,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 6:
            		 flag.setAmount("3,20,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 7:
            		 flag.setAmount("6,40,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 8:
            		 flag.setAmount("12,50,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 9:
            		 flag.setAmount("25,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 10:
            		 flag.setAmount("50,00,000");
            		 flag.setCount(count+1);
            		 break;
            	 case 11:
            		 flag.setAmount("1,00,00,000");
            		 flag.setCount(count+1);
            		 flag.setCount(0);
  	        	   flag.setAmount("0");
  	        	   flag.setLife1(0);
  	        	   flag.setLife2(0);
  	        	   flag.setLife3(0); 
            		 break;
            	
            	 }
            	 rs=flag.getAmount();
            	 if(count==11){
            		 rs="1,00,00,000";
            	 }
            	 in.putExtra("myKey", rs);
 		        startActivity(in);
            
             } 
          });
    	 life1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 
            	 if(lifeLine1==0){
            	 builder.setMessage("Are you sure you want to use your Life Line ?")
            	        .setCancelable(false)
            	        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	            	opt1.setVisibility(View.GONE);
                           	 opt3.setVisibility(View.GONE);
                           	 flag.setLife1(1);
            	            }
            	        })
            	        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            	            public void onClick(DialogInterface dialog, int id) {
            	                 dialog.cancel();
            	            }
            	        });
            	 AlertDialog alert = builder.create();
            	 alert.show();
             }
    	 else{
    		 builder.setMessage("You have already used your life line...")
 	        .setCancelable(false)
 	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
 	            public void onClick(DialogInterface dialog, int id) {
 	            	dialog.cancel();
 	            }
 	        });
    		 AlertDialog alert = builder.create();
        	 alert.show();
    	 }
             }
             });
    	 
    	 life2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 if(lifeLine2==0){
                	 builder.setMessage("I Think the Correct Answer is D")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                               	 flag.setLife2(1);
                	            }
                	        });
                	       
                	 AlertDialog alert = builder.create();
                	alert.setTitle("Amitabh Bachchan");
                	alert.setIcon(R.drawable.amitabh);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 }
          });
    	 
    	 life3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
            	 if(lifeLine3==0){
                	 builder.setMessage("Option A:          12% \nOption B:          10% \nOption C:          18% \nOption D:          60%")
                	        .setCancelable(false)
                	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                	            public void onClick(DialogInterface dialog, int id) {
                	            	dialog.cancel();
                	            	flag.setLife3(1);
                	            }
                	        });
                	        
                	 AlertDialog alert = builder.create();
                	// alert.setIcon(R.drawable.button);
                	 alert.show();
                 }
        	 else{
        		 builder.setMessage("You have already used your life line...")
     	        .setCancelable(false)
     	        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	            public void onClick(DialogInterface dialog, int id) {
     	            	dialog.cancel();
     	            }
     	        });
        		 AlertDialog alert = builder.create();
            	 alert.show();
        	 }
                 
            	                	 
             } 
          });
 	  }
 	  
	public void onBackPressed() {

		  // return;
		final AlertDialog.Builder builder = new AlertDialog.Builder(this);
		 rs=flag.getAmount();
  	  
  	   
  	   builder.setMessage("Are you sure you want to quit the Game ?")
	        .setCancelable(false)
	        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int id) {
	             Intent in = new Intent(GameActivity.this, FinalActivityQuit.class);
	             flag.setCount(0);
	        	   flag.setAmount("0");
	        	   flag.setLife1(0);
	        	   flag.setLife2(0);
	        	   flag.setLife3(0); 
	          in.putExtra("myKey", rs);
		        startActivity(in);
	            }
	        })
	        .setNegativeButton("No", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int id) {
	                 dialog.cancel();
	            }
	        });
	 AlertDialog alert = builder.create();
	 alert.show();
		}
	
	//private String lv_arr[]={"Android","iPhone","BlackBerry","AndroidPeople"};
	 //ArrayList<Integer> arr=new ArrayList<Integer>();
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        if(count ==0){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.crorepati);
        mediaPlayer.start();
        }
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        
        //final AlertDialog.Builder builder = new AlertDialog.Builder(this);
      /* ListView lv1=(ListView)findViewById(R.id.listView1);
       lv1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));*/
      //  Button quit,opt1,opt2,opt3,opt4,life1,life2;
         quit = (Button) findViewById(R.id.quit);
         life1 = (Button) findViewById(R.id.life1);
         life2 = (Button) findViewById(R.id.life2);
         life3 = (Button) findViewById(R.id.life3);
         opt1 = (Button) findViewById(R.id.opt1);
         opt2 = (Button) findViewById(R.id.opt2);
         opt3 = (Button) findViewById(R.id.opt3);
         opt4 = (Button) findViewById(R.id.opt4);
         TextView text=(TextView)findViewById(R.id.text);
         TextView q1=(TextView)findViewById(R.id.q1);
         TextView q2=(TextView)findViewById(R.id.q2);
         TextView q3=(TextView)findViewById(R.id.q3);
         TextView q4=(TextView)findViewById(R.id.q4);
         TextView q5=(TextView)findViewById(R.id.q5);
         TextView q6=(TextView)findViewById(R.id.q6);
         TextView q7=(TextView)findViewById(R.id.q7);
         TextView q8=(TextView)findViewById(R.id.q8);
         TextView q9=(TextView)findViewById(R.id.q9);
         TextView q10=(TextView)findViewById(R.id.q10);
         TextView q11=(TextView)findViewById(R.id.q11);
         TextView q12=(TextView)findViewById(R.id.q12);
         
        /* final Counter flag = (Counter)getApplicationContext();
   	  final int count=flag.getCount();
   	  final String  amount=flag.getAmount();
   	  final int lifeLine1=flag.getLife1();
   	final int lifeLine2=flag.getLife2();
   	final int lifeLine3=flag.getLife3();
   	  ArrayList<Integer> arr= new ArrayList<Integer>();*/
   	//arr= flag.getArr(); 
   	  if(count==0){
   	 arr.add(500);
   	 flag.setArr(arr);
   	  }
   	final Random rand = new Random();
   	int no = 0;
    no=rand.nextInt(106);
          //Counter count = (Counter)getApplicationContext();
         //final int count=flag.getCount();
    arr= flag.getArr();
    if( !arr.isEmpty()){
    	
   	  for(int i=0;i<arr.size();i++){
           //no=rand.nextInt(4);
          if(arr.get(i)==no){
        	  no=rand.nextInt(106);
        	  i=0;
          }
   	  }
   	  }
    arr.add(no);
   	flag.setArr(arr);
   	
   	//code for view of correct questions
   	switch(count){
   	case 0:
   		q1.setBackgroundResource(R.color.orange);
   		break;
   	case 1:
   		q2.setBackgroundResource(R.color.orange);
   		//q1.setBackgroundColor(R.color.red);
   		break;
   	case 2:
   		q3.setBackgroundResource(R.color.orange);
   		//q2.setBackgroundColor(R.color.red);
   		break;
   	case 3:
   		q4.setBackgroundResource(R.color.orange);
   		//q3.setBackgroundColor(R.color.gray);
   		break;
   	case 4:
   		q5.setBackgroundResource(R.color.orange);
   		//q4.setBackgroundColor(R.color.gray);
   		break;
   	case 5:
   		q6.setBackgroundResource(R.color.orange);
   		//q5.setBackgroundColor(R.color.gray);
   		break;
   	case 6:
   		q7.setBackgroundResource(R.color.orange);
   		//q6.setBackgroundColor(R.color.gray);
   		break;
   	case 7:
   		q8.setBackgroundResource(R.color.orange);
   		//q7.setBackgroundColor(R.color.gray);
   		break;
   	case 8:
   		q9.setBackgroundResource(R.color.orange);
   		//q8.setBackgroundColor(R.color.gray);
   		break;
   	case 9:
   		q10.setBackgroundResource(R.color.orange);
   		//q9.setBackgroundColor(R.color.gray);
   		break;
   	case 10:
   		q11.setBackgroundResource(R.color.orange);
   		//q10.setBackgroundColor(R.color.gray);
   		break;
   	case 11:
   		q12.setBackgroundResource(R.color.orange);
   		//q11.setBackgroundColor(R.color.gray);
   		break; 
   		
   	}
        //int no=1;
   	
         quit.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
        	   quit.setBackgroundResource(R.color.green);
        	   rs=flag.getAmount();
        	  
        	   
        	   builder.setMessage("Are you sure you want to quit the Game ?")
   	        .setCancelable(false)
   	        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
   	            public void onClick(DialogInterface dialog, int id) {
   	             Intent in = new Intent(GameActivity.this, FinalActivityQuit.class);
   	          flag.setCount(0);
       	   flag.setAmount("0");
       	   flag.setLife1(0);
       	   flag.setLife2(0);
       	   flag.setLife3(0); 
   	          in.putExtra("myKey", rs);
    		        startActivity(in);
   	            }
   	        })
   	        .setNegativeButton("No", new DialogInterface.OnClickListener() {
   	            public void onClick(DialogInterface dialog, int id) {
   	                 dialog.cancel();
   	            }
   	        });
   	 AlertDialog alert = builder.create();
   	 alert.show();
        	   
           } 
        });

         
        // for(int j=1;j<13;j++){
        switch(no){
        case 0:
        	text.setText(R.string.q1_b);
        	opt1.setText(R.string.q1_1);
        	opt2.setText(R.string.q1_2);
        	opt3.setText(R.string.q1_3);
        	opt4.setText(R.string.q1_4);
        	 setB("Blue Whale");
        	 break;
        	 
        case 1:
        	text.setText(R.string.q2_c);
        	opt1.setText(R.string.q2_1);
        	opt2.setText(R.string.q2_2);
        	opt3.setText(R.string.q2_3);
        	opt4.setText(R.string.q2_4);
        	 
        	setC("NewYork");
        	 break;
        case 2:
        	text.setText(R.string.q3_a);
        	opt1.setText(R.string.q3_1);
        	opt2.setText(R.string.q3_2);
        	opt3.setText(R.string.q3_3);
        	opt4.setText(R.string.q3_4);
        	 
        	setA("Bankok");
        	 break;
        case 3:
        	text.setText(R.string.q4_d);
        	opt1.setText(R.string.q4_1);
        	opt2.setText(R.string.q4_2);
        	opt3.setText(R.string.q4_3);
        	opt4.setText(R.string.q4_4);
        	 
        	setD("Vienna");
        	 break;
        case 4:
        	text.setText(R.string.q5_a);
        	opt1.setText(R.string.q5_1);
        	opt2.setText(R.string.q5_2);
        	opt3.setText(R.string.q5_3);
        	opt4.setText(R.string.q5_4);
        	 
        	setA("Ïndia");
        	 break;
        	 
        case 5:
        	text.setText(R.string.q6_b);
        	opt1.setText(R.string.q6_1);
        	opt2.setText(R.string.q6_2);
        	opt3.setText(R.string.q6_3);
        	opt4.setText(R.string.q6_4);
        	 setB("John Napier");

        	 break;
        	 
        case 6:
        	text.setText(R.string.q7_c);
        	opt1.setText(R.string.q7_1);
        	opt2.setText(R.string.q7_2);
        	opt3.setText(R.string.q7_3);
        	opt4.setText(R.string.q7_4);
        	 
        	setC("energy");
        	 break;
        	 
        case 7:
        	text.setText(R.string.q8_c);
        	opt1.setText(R.string.q8_1);
        	opt2.setText(R.string.q8_2);
        	opt3.setText(R.string.q8_3);
        	opt4.setText(R.string.q8_4);
        	 
        	setC("Liver");
        	 break;
        	 
        case 8:
        	text.setText(R.string.q9_a);
        	opt1.setText(R.string.q9_1);
        	opt2.setText(R.string.q9_2);
        	opt3.setText(R.string.q9_3);
        	opt4.setText(R.string.q9_4);
        	 
        	setA("1963");
        	 break;
        	 
        case 9:
        	text.setText(R.string.q10_b);
        	opt1.setText(R.string.q10_1);
        	opt2.setText(R.string.q10_2);
        	opt3.setText(R.string.q10_3);
        	opt4.setText(R.string.q10_4);
        	 setB("Germany");

        	 break;
        	 
        case 10 :
        	text.setText(R.string.q11_b);
        	opt1.setText(R.string.q11_1);
        	opt2.setText(R.string.q11_2);
        	opt3.setText(R.string.q11_3);
        	opt4.setText(R.string.q11_4);
        	 setB("antibiotic");

        	 break;
        case 11:
        	text.setText(R.string.q12_b);
        	opt1.setText(R.string.q12_1);
        	opt2.setText(R.string.q12_2);
        	opt3.setText(R.string.q12_3);
        	opt4.setText(R.string.q12_4);
        	 setB("120/80");

        	 break;
        	 
        case 12:
        	text.setText(R.string.q13_d);
        	opt1.setText(R.string.q13_1);
        	opt2.setText(R.string.q13_2);
        	opt3.setText(R.string.q13_3);
        	opt4.setText(R.string.q13_4);
        	 setD("Motion Pictures");

        	 break;
        	 
        case 13:
        	text.setText(R.string.q14_b);
        	opt1.setText(R.string.q14_1);
        	opt2.setText(R.string.q14_2);
        	opt3.setText(R.string.q14_3);
        	opt4.setText(R.string.q14_4);
        	 setB("Canada");

        	 break;
        	 
        case 14:
        	text.setText(R.string.q15_c);
        	opt1.setText(R.string.q15_1);
        	opt2.setText(R.string.q15_2);
        	opt3.setText(R.string.q15_3);
        	opt4.setText(R.string.q15_4);
        	setC("Rabindranath Tagore");
        	 
        	break;

        	case 15:
        	text.setText(R.string.q16_c);
        	opt1.setText(R.string.q16_1);
        	opt2.setText(R.string.q16_2);
        	opt3.setText(R.string.q16_3);
        	opt4.setText(R.string.q16_4);
        	setC("1901");
        	 
        	break;

        	case 16:
        	text.setText(R.string.q17_b);
        	opt1.setText(R.string.q17_1);
        	opt2.setText(R.string.q17_2);
        	opt3.setText(R.string.q17_3);
        	opt4.setText(R.string.q17_4);
        	setB("Dr. C. V. Raman");
        	 
        	break;

        	case 17:
        	text.setText(R.string.q18_a);
        	opt1.setText(R.string.q18_1);
        	opt2.setText(R.string.q18_2);
        	opt3.setText(R.string.q18_3);
        	opt4.setText(R.string.q18_4);
        	setA("Leo Tolstoy");
        	 
        	break;

        	case 18:
        	text.setText(R.string.q19_b);
        	opt1.setText(R.string.q19_1);
        	opt2.setText(R.string.q19_2);
        	opt3.setText(R.string.q19_3);
        	opt4.setText(R.string.q19_4);
        	setB("an Irishman");
        	 
        	break;

        	case 19:
        	text.setText(R.string.q20_c);
        	opt1.setText(R.string.q20_1);
        	opt2.setText(R.string.q20_2);
        	opt3.setText(R.string.q20_3);
        	opt4.setText(R.string.q20_4);
        	setC("Algernon Sidney");
        	 
        	break;

        	case 20:
        	text.setText(R.string.q21_a);
        	opt1.setText(R.string.q21_1);
        	opt2.setText(R.string.q21_2);
        	opt3.setText(R.string.q21_3);
        	opt4.setText(R.string.q21_4);
        	setA("Rupert Murdoch");
        	 
        	break;

        	case 21:
        	text.setText(R.string.q22_b);
        	opt1.setText(R.string.q22_1);
        	opt2.setText(R.string.q22_2);
        	opt3.setText(R.string.q22_3);
        	opt4.setText(R.string.q22_4);
        	setB("Aristotle");
        	 
        	break;

        	case 22:
        	text.setText(R.string.q23_d);
        	opt1.setText(R.string.q23_1);
        	opt2.setText(R.string.q23_2);
        	opt3.setText(R.string.q23_3);
        	opt4.setText(R.string.q23_4);
        	setD("Jonathan Swift");
        	 
        	break;

        	case 23:
        	text.setText(R.string.q24_a);
        	opt1.setText(R.string.q24_1);
        	opt2.setText(R.string.q24_2);
        	opt3.setText(R.string.q24_3);
        	opt4.setText(R.string.q24_4);
        	setA("Rakta Karabi");
        	 
        	break;

        	case 24:
        	text.setText(R.string.q25_c);
        	opt1.setText(R.string.q25_1);
        	opt2.setText(R.string.q25_2);
        	opt3.setText(R.string.q25_3);
        	opt4.setText(R.string.q25_4);
        	setC("Australia");
        	 
        	break;

        	case 25:
        	text.setText(R.string.q26_a);
        	opt1.setText(R.string.q26_1);
        	opt2.setText(R.string.q26_2);
        	opt3.setText(R.string.q26_3);
        	opt4.setText(R.string.q26_4);
        	setA("China");
        	 
        	break;

        	case 26:                 //check it
        	text.setText(R.string.q27_b);
        	opt1.setText(R.string.q27_1);
        	opt2.setText(R.string.q27_2);
        	opt3.setText(R.string.q27_3);
        	opt4.setText(R.string.q27_4);
        	setA("1880s");
        	 
        	break;

        	case 27:
        	text.setText(R.string.q28_c);
        	opt1.setText(R.string.q28_1);
        	opt2.setText(R.string.q28_2);
        	opt3.setText(R.string.q28_3);
        	opt4.setText(R.string.q28_4);
        	setC("Pacific ocean");
        	 
        	break;

        	case 28:
        	text.setText(R.string.q29_a);
        	opt1.setText(R.string.q29_1);
        	opt2.setText(R.string.q29_2);
        	opt3.setText(R.string.q29_3);
        	opt4.setText(R.string.q29_4);
        	setA("lake Victoria");
        	 
        	break;

        	case 29:
        	text.setText(R.string.q30_a);
        	opt1.setText(R.string.q30_1);
        	opt2.setText(R.string.q30_2);
        	opt3.setText(R.string.q30_3);
        	opt4.setText(R.string.q30_4);
        	setA("Bifocal spectacles");
        	 
        	break;

        	case 30:
        	text.setText(R.string.q31_b);
        	opt1.setText(R.string.q31_1);
        	opt2.setText(R.string.q31_2);
        	opt3.setText(R.string.q31_3);
        	opt4.setText(R.string.q31_4);
        	setB("1930s");
        	 
        	break;

        	case 31:
        	text.setText(R.string.q32_b);
        	opt1.setText(R.string.q32_1);
        	opt2.setText(R.string.q32_2);
        	opt3.setText(R.string.q32_3);
        	opt4.setText(R.string.q32_4);
        	setB("Edward Jenner");
        	 
        	break;

        	case 32:
        	text.setText(R.string.q33_c);
        	opt1.setText(R.string.q33_1);
        	opt2.setText(R.string.q33_2);
        	opt3.setText(R.string.q33_3);
        	opt4.setText(R.string.q33_4);
        	setC("United States");
        	 
        	break;

        	case 33:
        	text.setText(R.string.q34_b);
        	opt1.setText(R.string.q34_1);
        	opt2.setText(R.string.q34_2);
        	opt3.setText(R.string.q34_3);
        	opt4.setText(R.string.q34_4);
        	setB("Electric streetcar");
        	 
        	break;

        	case 34:
        	text.setText(R.string.q35_c);
        	opt1.setText(R.string.q35_1);
        	opt2.setText(R.string.q35_2);
        	opt3.setText(R.string.q35_3);
        	opt4.setText(R.string.q35_4);
        	setC("ASEAN");
        	 
        	break;

        	case 35:
        	text.setText(R.string.q36_b);
        	opt1.setText(R.string.q36_1);
        	opt2.setText(R.string.q36_2);
        	opt3.setText(R.string.q36_3);
        	opt4.setText(R.string.q36_4);
        	setB("New York");
        	 
        	break;

        	case 36:
        	text.setText(R.string.q37_a);
        	opt1.setText(R.string.q37_1);
        	opt2.setText(R.string.q37_2);
        	opt3.setText(R.string.q37_3);
        	opt4.setText(R.string.q37_4);
        	setA("UNFPA");
        	 
        	break;

        	case 37:
        	text.setText(R.string.q38_d);
        	opt1.setText(R.string.q38_1);
        	opt2.setText(R.string.q38_2);
        	opt3.setText(R.string.q38_3);
        	opt4.setText(R.string.q38_4);
        	setD("Rome");
        	 
        	break;

        	case 38:
        	text.setText(R.string.q39_d);
        	opt1.setText(R.string.q39_1);
        	opt2.setText(R.string.q39_2);
        	opt3.setText(R.string.q39_3);
        	opt4.setText(R.string.q39_4);
        	setD("Bolivia");
        	 
        	break;

        	case 39:
        	text.setText(R.string.q40_d);
        	opt1.setText(R.string.q40_1);
        	opt2.setText(R.string.q40_2);
        	opt3.setText(R.string.q40_3);
        	opt4.setText(R.string.q40_4);
        	setD("Myanmar");
        	 
        	break;

        	case 40:
        	text.setText(R.string.q41_a);
        	opt1.setText(R.string.q41_1);
        	opt2.setText(R.string.q41_2);
        	opt3.setText(R.string.q41_3);
        	opt4.setText(R.string.q41_4);
        	setA("1977");
        	 
        	break;

        	case 41:
        	text.setText(R.string.q42_a);
        	opt1.setText(R.string.q42_1);
        	opt2.setText(R.string.q42_2);
        	opt3.setText(R.string.q42_3);
        	opt4.setText(R.string.q42_4);
        	setA("NATO");
        	 
        	break;

        	case 42:
        	text.setText(R.string.q43_b);
        	opt1.setText(R.string.q43_1);
        	opt2.setText(R.string.q43_2);
        	opt3.setText(R.string.q43_3);
        	opt4.setText(R.string.q43_4);
        	setB("1920");
        	 
        	break;

        	case 43:
        	text.setText(R.string.q44_b);
        	opt1.setText(R.string.q44_1);
        	opt2.setText(R.string.q44_2);
        	opt3.setText(R.string.q44_3);
        	opt4.setText(R.string.q44_4);
        	setB("1974");
        	 
        	break;

        	case 44:
        	text.setText(R.string.q45_c);
        	opt1.setText(R.string.q45_1);
        	opt2.setText(R.string.q45_2);
        	opt3.setText(R.string.q45_3);
        	opt4.setText(R.string.q45_4);
        	setC("Zoroastrianism");
        	 
        	break;

        	case 45:
        	text.setText(R.string.q46_b);
        	opt1.setText(R.string.q46_1);
        	opt2.setText(R.string.q46_2);
        	opt3.setText(R.string.q46_3);
        	opt4.setText(R.string.q46_4);
        	setB("Mosquito");
        	 
        	break;

        	case 46:
        	text.setText(R.string.q47_a);
        	opt1.setText(R.string.q47_1);
        	opt2.setText(R.string.q47_2);
        	opt3.setText(R.string.q47_3);
        	opt4.setText(R.string.q47_4);
        	setA("1914");  //change to 1914
        	 
        	break;

        	case 47:
        	text.setText(R.string.q48_c);
        	opt1.setText(R.string.q48_1);
        	opt2.setText(R.string.q48_2);
        	opt3.setText(R.string.q48_3);
        	opt4.setText(R.string.q48_4);
        	setC("mica");
        	 
        	break;

        	case 48:
        	text.setText(R.string.q49_b);
        	opt1.setText(R.string.q49_1);
        	opt2.setText(R.string.q49_2);
        	opt3.setText(R.string.q49_3);
        	opt4.setText(R.string.q49_4);
        	setB("10 December");
        	 
        	break;

        	case 49:
        	text.setText(R.string.q50_b);
        	opt1.setText(R.string.q50_1);
        	opt2.setText(R.string.q50_2);
        	opt3.setText(R.string.q50_3);
        	opt4.setText(R.string.q50_4);
        	setB("1932");
        	 
        	break;

        	case 50:
        	text.setText(R.string.q51_b);
        	opt1.setText(R.string.q51_1);
        	opt2.setText(R.string.q51_2);
        	opt3.setText(R.string.q51_3);
        	opt4.setText(R.string.q51_4);
        	setB("Sachin Tendulkar");
        	 
        	break;

        	case 51:
        	text.setText(R.string.q52_d);
        	opt1.setText(R.string.q52_1);
        	opt2.setText(R.string.q52_2);
        	opt3.setText(R.string.q52_3);
        	opt4.setText(R.string.q52_4);
        	setD("434");
        	 
        	break;

        	case 52:
        	text.setText(R.string.q53_c);
        	opt1.setText(R.string.q53_1);
        	opt2.setText(R.string.q53_2);
        	opt3.setText(R.string.q53_3);
        	opt4.setText(R.string.q53_4);
        	setC("Sri Lanka");
        	 
        	break;

        	case 53:
        	text.setText(R.string.q54_d);
        	opt1.setText(R.string.q54_1);
        	opt2.setText(R.string.q54_2);
        	opt3.setText(R.string.q54_3);
        	opt4.setText(R.string.q54_4);
        	setD("1896");
        	 
        	break;

        	case 54:
        	text.setText(R.string.q55_d);
        	opt1.setText(R.string.q55_1);
        	opt2.setText(R.string.q55_2);
        	opt3.setText(R.string.q55_3);
        	opt4.setText(R.string.q55_4);
        	setD("Monica Seles");
        	 
        	break;

        	case 55:
        	text.setText(R.string.q56_b);
        	opt1.setText(R.string.q56_1);
        	opt2.setText(R.string.q56_2);
        	opt3.setText(R.string.q56_3);
        	opt4.setText(R.string.q56_4);
        	setB("Golf");
        	 
        	break;

        	case 56:
        	text.setText(R.string.q57_d);
        	opt1.setText(R.string.q57_1);
        	opt2.setText(R.string.q57_2);
        	opt3.setText(R.string.q57_3);
        	opt4.setText(R.string.q57_4);
        	setD("3 to 30 MHz");
        	 
        	break;

        	case 57:
        	text.setText(R.string.q58_b);
        	opt1.setText(R.string.q58_1);
        	opt2.setText(R.string.q58_2);
        	opt3.setText(R.string.q58_3);
        	opt4.setText(R.string.q58_4);
        	setB("May 1994");
        	 
        	break;

        	case 58:
        	text.setText(R.string.q59_c);
        	opt1.setText(R.string.q59_1);
        	opt2.setText(R.string.q59_2);
        	opt3.setText(R.string.q59_3);
        	opt4.setText(R.string.q59_4);
        	setC("Joseph Priestleystring");
        	 
        	break;

        	case 59:
        	text.setText(R.string.q60_c);
        	opt1.setText(R.string.q60_1);
        	opt2.setText(R.string.q60_2);
        	opt3.setText(R.string.q60_3);
        	opt4.setText(R.string.q60_4);
        	setC("Ken Thompson");
        	 
        	break;

        	case 60:
        	text.setText(R.string.q61_c);
        	opt1.setText(R.string.q61_1);
        	opt2.setText(R.string.q61_2);
        	opt3.setText(R.string.q61_3);
        	opt4.setText(R.string.q61_4);
        	setC("Capacitor");
        	 
        	break;

        	case 61:
        	text.setText(R.string.q62_a);
        	opt1.setText(R.string.q62_1);
        	opt2.setText(R.string.q62_2);
        	opt3.setText(R.string.q62_3);
        	opt4.setText(R.string.q62_4);
        	setA("ENIAC");
        	 
        	break;

        	case 62:
        	text.setText(R.string.q63_d);
        	opt1.setText(R.string.q63_1);
        	opt2.setText(R.string.q63_2);
        	opt3.setText(R.string.q63_3);
        	opt4.setText(R.string.q63_4);
        	setD("America Online");
        	 
        	break;

        	case 63:
        	text.setText(R.string.q64_a);
        	opt1.setText(R.string.q64_1);
        	opt2.setText(R.string.q64_2);
        	opt3.setText(R.string.q64_3);
        	opt4.setText(R.string.q64_4);
        	setA("OS-2");
        	 
        	break;

        	case 64:
        	text.setText(R.string.q65_b);
        	opt1.setText(R.string.q65_1);
        	opt2.setText(R.string.q65_2);
        	opt3.setText(R.string.q65_3);
        	opt4.setText(R.string.q65_4);
        	setB("Department of Defence");
        	 
        	break;

        	case 65:
        	text.setText(R.string.q66_a);
        	opt1.setText(R.string.q66_1);
        	opt2.setText(R.string.q66_2);
        	opt3.setText(R.string.q66_3);
        	opt4.setText(R.string.q66_4);
        	setA("August 12, 1981");
        	 
        	break;

        	case 66:
        	text.setText(R.string.q67_c);
        	opt1.setText(R.string.q67_1);
        	opt2.setText(R.string.q67_2);
        	opt3.setText(R.string.q67_3);
        	opt4.setText(R.string.q67_4);
        	setC("Copernicus");
        	 
        	break;

        	case 67:
        	text.setText(R.string.q68_b);
        	opt1.setText(R.string.q68_1);
        	opt2.setText(R.string.q68_2);
        	opt3.setText(R.string.q68_3);
        	opt4.setText(R.string.q68_4);
        	setB("December 22");
        	 
        	break;

        	case 68:
        	text.setText(R.string.q69_d);
        	opt1.setText(R.string.q69_1);
        	opt2.setText(R.string.q69_2);
        	opt3.setText(R.string.q69_3);
        	opt4.setText(R.string.q69_4);
        	setD("31st May");
        	 
        	break;

        	case 69:
        	text.setText(R.string.q70_d);
        	opt1.setText(R.string.q70_1);
        	opt2.setText(R.string.q70_2);
        	opt3.setText(R.string.q70_3);
        	opt4.setText(R.string.q70_4);
        	setD("October 16");
        	 
        	break;

        	case 70:
        	text.setText(R.string.q71_b);
        	opt1.setText(R.string.q71_1);
        	opt2.setText(R.string.q71_2);
        	opt3.setText(R.string.q71_3);
        	opt4.setText(R.string.q71_4);
        	setB("1/50 th");
        	 
        	break;

        	case 71:
        	text.setText(R.string.q72_b);
        	opt1.setText(R.string.q72_1);
        	opt2.setText(R.string.q72_2);
        	opt3.setText(R.string.q72_3);
        	opt4.setText(R.string.q72_4);
        	setB("gums");
        	 
        	break;

        	case 72:
        	text.setText(R.string.q73_a);
        	opt1.setText(R.string.q73_1);
        	opt2.setText(R.string.q73_2);
        	opt3.setText(R.string.q73_3);
        	opt4.setText(R.string.q73_4);
        	setA("Alaska");
        	 
        	break;

        	case 73:
        	text.setText(R.string.q74_a);
        	opt1.setText(R.string.q74_1);
        	opt2.setText(R.string.q74_2);
        	opt3.setText(R.string.q74_3);
        	opt4.setText(R.string.q74_4);
        	setA("Japan");
        	 
        	break;

        	case 74:
        	text.setText(R.string.q75_a);
        	opt1.setText(R.string.q75_1);
        	opt2.setText(R.string.q75_2);
        	opt3.setText(R.string.q75_3);
        	opt4.setText(R.string.q75_4);
        	setA("Qatar");
        	 
        	break;

        	case 75:
        	text.setText(R.string.q76_c);
        	opt1.setText(R.string.q76_1);
        	opt2.setText(R.string.q76_2);
        	opt3.setText(R.string.q76_3);
        	opt4.setText(R.string.q76_4);
        	setC("CH4");
        	 
        	break;

        	case 76:
        	text.setText(R.string.q77_d);
        	opt1.setText(R.string.q77_1);
        	opt2.setText(R.string.q77_2);
        	opt3.setText(R.string.q77_3);
        	opt4.setText(R.string.q77_4);
        	setD("Rice");
        	 
        	break;

        	case 77:
        	text.setText(R.string.q78_a);
        	opt1.setText(R.string.q78_1);
        	opt2.setText(R.string.q78_2);
        	opt3.setText(R.string.q78_3);
        	opt4.setText(R.string.q78_4);
        	setA("Stearic acid");
        	 
        	break;

        	case 78:
        	text.setText(R.string.q79_d);
        	opt1.setText(R.string.q79_1);
        	opt2.setText(R.string.q79_2);
        	opt3.setText(R.string.q79_3);
        	opt4.setText(R.string.q79_4);
        	setD("Petra Kvitova");
        	 
        	break;

        	case 79:
        	text.setText(R.string.q80_c);
        	opt1.setText(R.string.q80_1);
        	opt2.setText(R.string.q80_2);
        	opt3.setText(R.string.q80_3);
        	opt4.setText(R.string.q80_4);
        	setC("Golf");
        	 
        	break;

        	case 80:
        	text.setText(R.string.q81_c);
        	opt1.setText(R.string.q81_1);
        	opt2.setText(R.string.q81_2);
        	opt3.setText(R.string.q81_3);
        	opt4.setText(R.string.q81_4);
        	setC("K. J. O Brein");
        	 
        	break;

        	case 81:
        	text.setText(R.string.q82_c);
        	opt1.setText(R.string.q82_1);
        	opt2.setText(R.string.q82_2);
        	opt3.setText(R.string.q82_3);
        	opt4.setText(R.string.q82_4);
        	setC("Lionel Messi");
        	 
        	break;

        	case 82:
        	text.setText(R.string.q83_d);
        	opt1.setText(R.string.q83_1);
        	opt2.setText(R.string.q83_2);
        	opt3.setText(R.string.q83_3);
        	opt4.setText(R.string.q83_4);
        	setD("Short Corner");
        	 
        	break;

        	case 83:
        	text.setText(R.string.q84_a);
        	opt1.setText(R.string.q84_1);
        	opt2.setText(R.string.q84_2);
        	opt3.setText(R.string.q84_3);
        	opt4.setText(R.string.q84_4);
        	setA("India");
        	 
        	break;

        	case 84:
        	text.setText(R.string.q85_b);
        	opt1.setText(R.string.q85_1);
        	opt2.setText(R.string.q85_2);
        	opt3.setText(R.string.q85_3);
        	opt4.setText(R.string.q85_4);
        	setB("Athens");
        	 
        	break;

        	case 85:
        	text.setText(R.string.q86_a);
        	opt1.setText(R.string.q86_1);
        	opt2.setText(R.string.q86_2);
        	opt3.setText(R.string.q86_3);
        	opt4.setText(R.string.q86_4);
        	setA("Lothal");
        	 
        	break;

        	case 86:
        	text.setText(R.string.q87_b);
        	opt1.setText(R.string.q87_1);
        	opt2.setText(R.string.q87_2);
        	opt3.setText(R.string.q87_3);
        	opt4.setText(R.string.q87_4);
        	setB("Yangon");
        	 
        	break;

        	case 87:
        	text.setText(R.string.q88_b);
        	opt1.setText(R.string.q88_1);
        	opt2.setText(R.string.q88_2);
        	opt3.setText(R.string.q88_3);
        	opt4.setText(R.string.q88_4);
        	setB("Canada");
        	 
        	break;

        	case 88:
        	text.setText(R.string.q89_b);
        	opt1.setText(R.string.q89_1);
        	opt2.setText(R.string.q89_2);
        	opt3.setText(R.string.q89_3);
        	opt4.setText(R.string.q89_4);
        	setB("Barclays Bank");
        	 
        	break;

        	case 89:
        	text.setText(R.string.q90_b);
        	opt1.setText(R.string.q90_1);
        	opt2.setText(R.string.q90_2);
        	opt3.setText(R.string.q90_3);
        	opt4.setText(R.string.q90_4);
        	setB("Dove, Olive branch");
        	 
        	break;

        	case 90:
        	text.setText(R.string.q91_a);
        	opt1.setText(R.string.q91_1);
        	opt2.setText(R.string.q91_2);
        	opt3.setText(R.string.q91_3);
        	opt4.setText(R.string.q91_4);
        	setA("Tea");
        	 
        	break;

        	case 91:
        	text.setText(R.string.q92_c);
        	opt1.setText(R.string.q92_1);
        	opt2.setText(R.string.q92_2);
        	opt3.setText(R.string.q92_3);
        	opt4.setText(R.string.q92_4);
        	setC("Napoleon Bonaparte");
        	 
        	break;

        	case 92:
        	text.setText(R.string.q93_c);
        	opt1.setText(R.string.q93_1);
        	opt2.setText(R.string.q93_2);
        	opt3.setText(R.string.q93_3);
        	opt4.setText(R.string.q93_4);
        	setC("Vasco-da-Gama");
        	 
        	break;

        	case 93:
        	text.setText(R.string.q94_a);
        	opt1.setText(R.string.q94_1);
        	opt2.setText(R.string.q94_2);
        	opt3.setText(R.string.q94_3);
        	opt4.setText(R.string.q94_4);
        	setA("volcanic rocks");
        	 
        	break;

        	case 94:
        	text.setText(R.string.q95_b);
        	opt1.setText(R.string.q95_1);
        	opt2.setText(R.string.q95_2);
        	opt3.setText(R.string.q95_3);
        	opt4.setText(R.string.q95_4);
        	setB("Black soil");
        	 
        	break;

        	case 95:
        	text.setText(R.string.q96_b);
        	opt1.setText(R.string.q96_1);
        	opt2.setText(R.string.q96_2);
        	opt3.setText(R.string.q96_3);
        	opt4.setText(R.string.q96_4);
        	setB("Cuba");
        	 
        	break;

        	case 96:
        	text.setText(R.string.q97_a);
        	opt1.setText(R.string.q97_1);
        	opt2.setText(R.string.q97_2);
        	opt3.setText(R.string.q97_3);
        	opt4.setText(R.string.q97_4);
        	setA("Kathmandu");
        	 
        	break;

        	case 97:
        	text.setText(R.string.q98_a);
        	opt1.setText(R.string.q98_1);
        	opt2.setText(R.string.q98_2);
        	opt3.setText(R.string.q98_3);
        	opt4.setText(R.string.q98_4);
        	setA("1945");
        	 
        	break;

        	case 98:
        	text.setText(R.string.q99_a);
        	opt1.setText(R.string.q99_1);
        	opt2.setText(R.string.q99_2);
        	opt3.setText(R.string.q99_3);
        	opt4.setText(R.string.q99_4);
        	setA("1564");
        	 
        	break;

        	case 99:
        	text.setText(R.string.q100_b);
        	opt1.setText(R.string.q100_1);
        	opt2.setText(R.string.q100_2);
        	opt3.setText(R.string.q100_3);
        	opt4.setText(R.string.q100_4);
        	setB("570 AD");
        	 
        	break;

        	case 100:
        	text.setText(R.string.q101_b);
        	opt1.setText(R.string.q101_1);
        	opt2.setText(R.string.q101_2);
        	opt3.setText(R.string.q101_3);
        	opt4.setText(R.string.q101_4);
        	setB("Booker Prize");
        	 
        	break;

        	case 101:
        	text.setText(R.string.q102_d);
        	opt1.setText(R.string.q102_1);
        	opt2.setText(R.string.q102_2);
        	opt3.setText(R.string.q102_3);
        	opt4.setText(R.string.q102_4);
        	setD("Canada");
        	 
        	break;

        	case 102:
        	text.setText(R.string.q103_a);
        	opt1.setText(R.string.q103_1);
        	opt2.setText(R.string.q103_2);
        	opt3.setText(R.string.q103_3);
        	opt4.setText(R.string.q103_4);
        	setA("Kelvin");
        	 
        	break;

        	case 103:
        	text.setText(R.string.q104_b);
        	opt1.setText(R.string.q104_1);
        	opt2.setText(R.string.q104_2);
        	opt3.setText(R.string.q104_3);
        	opt4.setText(R.string.q104_4);
        	setB("1492 AD");
        	 
        	break;

        	case 104:
        	text.setText(R.string.q105_a);
        	opt1.setText(R.string.q105_1);
        	opt2.setText(R.string.q105_2);
        	opt3.setText(R.string.q105_3);
        	opt4.setText(R.string.q105_4);
        	setA("anemia");
        	 
        	break;

        	case 105:
        	text.setText(R.string.q106_c);
        	opt1.setText(R.string.q106_1);
        	opt2.setText(R.string.q106_2);
        	opt3.setText(R.string.q106_3);
        	opt4.setText(R.string.q106_4);
        	setC("Romer");
        	 
        	break;

        	case 106:
            	text.setText(R.string.q107_b);
            	opt1.setText(R.string.q107_1);
            	opt2.setText(R.string.q107_2);
            	opt3.setText(R.string.q107_3);
            	opt4.setText(R.string.q107_4);
            	setB("United States of America");
            	 
            	break;
            	
        	case 107:
            	text.setText(R.string.q108_c);
            	opt1.setText(R.string.q108_1);
            	opt2.setText(R.string.q108_2);
            	opt3.setText(R.string.q108_3);
            	opt4.setText(R.string.q108_4);
            	setC("anemometer");
            	 
            	break;

        	case 108:
            	text.setText(R.string.q109_c);
            	opt1.setText(R.string.q109_1);
            	opt2.setText(R.string.q109_2);
            	opt3.setText(R.string.q109_3);
            	opt4.setText(R.string.q109_4);
            	setC("15");
            	 
            	break;	
            	
        	case 109:
            	text.setText(R.string.q110_c);
            	opt1.setText(R.string.q110_1);
            	opt2.setText(R.string.q110_2);
            	opt3.setText(R.string.q110_3);
            	opt4.setText(R.string.q110_4);
            	setC("fermentation");
            	 
            	break;	
            	
        	case 110:
            	text.setText(R.string.q111_d);
            	opt1.setText(R.string.q111_1);
            	opt2.setText(R.string.q111_2);
            	opt3.setText(R.string.q111_3);
            	opt4.setText(R.string.q111_4);
            	setD("bone marrow");
            	 
            	break;
            	
        	case 111:
            	text.setText(R.string.q112_c);
            	opt1.setText(R.string.q112_1);
            	opt2.setText(R.string.q112_2);
            	opt3.setText(R.string.q112_3);
            	opt4.setText(R.string.q112_4);
            	setC("Prudential Cup");
            	 
            	break;	
            	
        	case 112:
            	text.setText(R.string.q113_d);
            	opt1.setText(R.string.q113_1);
            	opt2.setText(R.string.q113_2);
            	opt3.setText(R.string.q113_3);
            	opt4.setText(R.string.q113_4);
            	setD("1 : 500");
            	 
            	break;
            	
        	case 113:
            	text.setText(R.string.q114_c);
            	opt1.setText(R.string.q114_1);
            	opt2.setText(R.string.q114_2);
            	opt3.setText(R.string.q114_3);
            	opt4.setText(R.string.q114_4);
            	setC("46");
            	 
            	break;
            	
        	case 114:
            	text.setText(R.string.q115_c);
            	opt1.setText(R.string.q115_1);
            	opt2.setText(R.string.q115_2);
            	opt3.setText(R.string.q115_3);
            	opt4.setText(R.string.q115_4);
            	setC("lithosphere");
            	 
            	break;	
            	
        	case 115:
            	text.setText(R.string.q116_a);
            	opt1.setText(R.string.q116_1);
            	opt2.setText(R.string.q116_2);
            	opt3.setText(R.string.q116_3);
            	opt4.setText(R.string.q116_4);
            	setA("Russia");
            	 
            	break;	
            	
        	case 116:
            	text.setText(R.string.q117_b);
            	opt1.setText(R.string.q117_1);
            	opt2.setText(R.string.q117_2);
            	opt3.setText(R.string.q117_3);
            	opt4.setText(R.string.q117_4);
            	setB("The Hague");
            	 
            	break;	
            	
        	case 117:
            	text.setText(R.string.q118_b);
            	opt1.setText(R.string.q117_1);
            	opt2.setText(R.string.q117_2);
            	opt3.setText(R.string.q117_3);
            	opt4.setText(R.string.q117_4);
            	setB("Darwin");
            	 
            	break;	
            	
        	case 118:
            	text.setText(R.string.q119_a);
            	opt1.setText(R.string.q116_1);
            	opt2.setText(R.string.q116_2);
            	opt3.setText(R.string.q116_3);
            	opt4.setText(R.string.q116_4);
            	setA("steel");
            	 
            	break;	
            	
        	case 119:
            	text.setText(R.string.q120_c);
            	opt1.setText(R.string.q120_1);
            	opt2.setText(R.string.q120_2);
            	opt3.setText(R.string.q120_3);
            	opt4.setText(R.string.q120_4);
            	setC("8 minutes");
            	 
            	break;
        
        }
       
       //  }
	}
}

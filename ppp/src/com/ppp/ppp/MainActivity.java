package com.ppp.ppp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.EditText;

public class MainActivity extends Activity {
	static final String PPP_URL = "";
	public static String username = null;
	public static String userid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        EditText namefield = (EditText) findViewById(R.id.editText1);
//        SharedPreferences prefs = this.getSharedPreferences("PPP", Context.MODE_PRIVATE);
//        if (!prefs.contains("name")){
//        	username = namefield.getText().toString();
//        	prefs.edit().putString("name", username);
//        	AsyncHttpClient client = new AsyncHttpClient();
//        	RequestParams params =  new RequestParams();
//        	params.put("", namefield.getText());
//        	client.get(PPP_URL+"", params, new JsonHttpResponseHandler() {
//        		@Override
//        		public void onSuccess(JSONObject response) {
//        			System.out.println(response.toString());
//        			userid = "";
//        		}
//        	});
//        }
//        else username = prefs.getString("name",null);
        Intent rooms = new Intent(this, PhotoroomActivity.class);
        
        startActivity(rooms);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

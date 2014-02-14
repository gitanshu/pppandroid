package com.ppp.ppp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;



public class PhotoroomActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photoroom);
		//Log.d("username",MainActivity.username);
		ArrayList<RoomObject> al = new ArrayList<RoomObject>();
		al.add(new RoomObject());
		al.add(new RoomObject());
		ListView list = (ListView) findViewById((R.id.RoomList));
		RoomAdapter ra = new RoomAdapter(this, R.layout.list_row, al);
		list.setAdapter(ra);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photoroom, menu);
		return true;
	}

}
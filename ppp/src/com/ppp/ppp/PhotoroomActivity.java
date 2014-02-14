package com.ppp.ppp;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
	
	public void createnew(View v){
		NewRoomDialog nr = new NewRoomDialog();
		nr.show(getFragmentManager(), null);
	}
	
	public static class NewRoomDialog extends DialogFragment {
	    @Override
	    public Dialog onCreateDialog(Bundle savedInstanceState) {
	        // Use the Builder class for convenient dialog construction
	        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	        final LayoutInflater inflater = getActivity().getLayoutInflater();
	        final EditText roomfield = (EditText) inflater.inflate(R.layout.newroom, null).findViewById(R.id.roomname);
     	    final EditText passfield = (EditText) inflater.inflate(R.layout.newroom, null).findViewById(R.id.password);
     	    Dialog dialog =  builder.create();
     	    Button positive = ((AlertDialog) dialog).getButton(DialogInterface.BUTTON_POSITIVE);
	        builder.setView(inflater.inflate(R.layout.newroom, null))
	               .setPositiveButton("Create", new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                	   String roomname =  roomfield.getText().toString();
	                	   String password =  passfield.getText().toString();
	                	   if (!roomname.equals("")){
	                		   
	                	   }
	                	   else {
	                		   
	                	   }
	                	   
	                   }
	               })
	               .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                	   	NewRoomDialog.this.getDialog().cancel();
	                   }
	               });
	        // Create the AlertDialog object and return it
	        return builder.create();
	    }
	}

}

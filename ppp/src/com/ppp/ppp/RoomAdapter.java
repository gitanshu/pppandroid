package com.ppp.ppp;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RoomAdapter extends ArrayAdapter<RoomObject>{
	ArrayList<RoomObject> obj = new ArrayList<RoomObject>();
	Context mcontext;
	public RoomAdapter(Context context, int resource, ArrayList<RoomObject> al) {
		super(context, resource, al);
		mcontext = context;
		obj = al;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		RoomObject currentObject = obj.get(position);
		LayoutInflater inflater = (LayoutInflater) this.mcontext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_row,
				parent, false);
		TextView title = (TextView) rowView.findViewById(R.id.roomname);
		ImageView thumb = (ImageView) rowView.findViewById(R.id.thumb);
		ImageView lock = (ImageView) rowView.findViewById(R.id.lock);
		title.setText(currentObject.getRoomname());
		thumb.setImageResource(R.drawable.ic_launcher);
		lock.setImageResource(R.drawable.ic_launcher);
		return rowView;

		
}
	
}
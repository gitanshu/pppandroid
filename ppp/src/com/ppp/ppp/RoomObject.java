package com.ppp.ppp;

public class RoomObject {
	int lock;
	String url;
	String roomname;
	
	public RoomObject(){
		this.lock = 0;
		this.url = null;
		this.roomname = "comic";
	}

	public int getLock() {
		return lock;
	}

	public void setLock(int lock) {
		this.lock = lock;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	
}

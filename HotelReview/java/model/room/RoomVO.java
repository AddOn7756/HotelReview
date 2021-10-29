package model.room;

public class RoomVO {

	private int roomNum;
	private int hotelNum;
	private String roomName;
	private String expln;
	
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getHotelNum() {
		return hotelNum;
	}
	public void setHotelNum(int hotelNum) {
		this.hotelNum = hotelNum;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getExpln() {
		return expln;
	}
	public void setExpln(String expln) {
		this.expln = expln;
	}
	
	@Override
	public String toString() {
		return "RoomVO [roomNum=" + roomNum + ", hotelNum=" + hotelNum + ", roomName=" + roomName + ", expln=" + expln
				+ "]";
	}
	
	
	
}

package model.images;

public class ImagesVO {

	private int imageNum;
	private int roomNum;
	private int hotelNum;
	private String imageId;
	
	public int getImageNum() {
		return imageNum;
	}
	public void setImageNum(int imageNum) {
		this.imageNum = imageNum;
	}
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
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	
	@Override
	public String toString() {
		return "ImagesVO [imageNum=" + imageNum + ", roomNum=" + roomNum + ", hotelNum=" + hotelNum + ", imageId="
				+ imageId + "]";
	}
	
	
	
}

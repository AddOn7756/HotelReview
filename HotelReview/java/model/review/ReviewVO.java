package model.review;

import java.sql.Date;

public class ReviewVO {

	private int reNum;
	private int hotelNum;
	private int memNum;
	private int roomNum;
	private String content;
	private Date rdate;
	private String writer;
	private String image;

	public int getReNum() {
		return reNum;
	}
	public void setReNum(int reNum) {
		this.reNum = reNum;
	}
	public int getHotelNum() {
		return hotelNum;
	}
	public void setHotelNum(int hotelNum) {
		this.hotelNum = hotelNum;
	}
	public int getMemNum() {
		return memNum;
	}
	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ReviewVO [reNum=" + reNum + ", hotelNum=" + hotelNum + ", memNum=" + memNum + ", roomNum=" + roomNum
				+ ", content=" + content + ", rdate=" + rdate + ", writer=" + writer + ", image="+ image + "]";
	}

}

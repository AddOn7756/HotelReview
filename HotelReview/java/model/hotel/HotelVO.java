package model.hotel;

public class HotelVO {

	private int hotelNum;
	private String name;
	private String pnum;
	private String addr;
	private String expln;
	private int rating;
	private int recnt;
	private String lttLng;
	
	public int getHotelNum() {
		return hotelNum;
	}
	public void setHotelNum(int hotelNum) {
		this.hotelNum = hotelNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getExpln() {
		return expln;
	}
	public void setExpln(String expln) {
		this.expln = expln;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRecnt() {
		return recnt;
	}
	public void setRecnt(int recnt) {
		this.recnt = recnt;
	}
	public String getLttLng() {
		return lttLng;
	}
	public void setLttLng(String lttLng) {
		this.lttLng = lttLng;
	}
	
	@Override
	public String toString() {
		return "HotelVO [hotelNum=" + hotelNum + ", name=" + name + ", pnum=" + pnum + ", addr=" + addr + ", expln="
				+ expln + ", rating=" + rating + ", recnt=" + recnt + ", lttLng=" + lttLng + "]";
	}
	
	
}

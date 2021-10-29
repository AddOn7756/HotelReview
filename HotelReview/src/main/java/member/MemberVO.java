package model.member;

public class MemberVO {

	private int memNum;
	private String name;
	private String id;
	private String pw;
	private String email;
	private String birth;
	private String image;
	private String hp;
	private String gender;
	private String addr;
	public int getMemNum() {
		return memNum;
	}
	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memNum=" + memNum + ", name=" + name + ", id=" + id + ", pw=" + pw + ", email=" + email
				+ ", birth=" + birth + ", image=" + image + ", hp=" + hp + ", gender=" + gender + ", addr=" + addr
				+ "]";
	}
	
	


}

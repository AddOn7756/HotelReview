package model.member;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

class MemberRowMapper implements RowMapper<MemberVO>{

	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		MemberVO data = new MemberVO();
		
		data.setMemNum(rs.getInt("memnum"));
		data.setName(rs.getString("name"));
		data.setId(rs.getString("id"));
		data.setPw(rs.getString("pw"));
		data.setEmail(rs.getString("email"));
		data.setBirth(rs.getString("birth"));
		data.setImage(rs.getString("image"));
		data.setHp(rs.getString("hp"));
		data.setGender(rs.getString("gender"));
		data.setAddr(rs.getNString("addr"));
		
		return data;
	}
	
}

@Repository()
public class SpringMemberDAO {

	private static final String sql_SELECT_ALL="SELECT * FROM mamber";
	private static final String sql_SELECT_ONE="SELECT * FROM member WHERE memnum=?";
	private static final String sql_INSERT="INSERT INTO member(memnum, name, id, pw, email, birth, hp, gender, addr) VALUES((SELECT NVL(MAX(memnum),0)+1 FROM member),?,?,?,?,?,?,?,?)";
	private static final String sql_DELETE="DELETE FROM hotel WHERE memnum=?";
	private static final String sql_UPDATE="UPDATE member pw=?, email=?, image=?, hp=?, addr=? WHERE memnum=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;   //외부에서 주입받아 사용 

	public List<MemberVO> getMemberList(){
		System.out.println("SpringHotelDAO getHotelList");
		return jdbcTemplate.query(sql_SELECT_ALL, new MemberRowMapper());
	}
	public MemberVO getMemberData(MemberVO vo) {
		System.out.println("SpringHotelDAO getHotelData");
		Object[] args = { vo.getMemNum() };
		return jdbcTemplate.queryForObject(sql_SELECT_ONE, args ,new MemberRowMapper());
	}
	public boolean insert(MemberVO vo) {
		boolean flag = false;
		jdbcTemplate.update(sql_INSERT, vo.getName(), vo.getId(), vo.getPw(), vo.getEmail(), vo.getBirth(), vo.getHp(), vo.getGender(), vo.getAddr());
		flag=true;
		return flag;
	}
	public boolean delete(MemberVO vo) {
		boolean flag = false;
		jdbcTemplate.update(sql_DELETE, vo.getMemNum());
		flag=true;
		return flag;
	}
	public boolean update(MemberVO vo) {
		boolean flag = false;
		jdbcTemplate.update(sql_UPDATE, vo.getPw(), vo.getEmail(), vo.getImage(), vo.getHp(), vo.getAddr(), vo.getMemNum());
		flag=true;
		return flag;
	}


}

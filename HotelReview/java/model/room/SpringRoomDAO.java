package model.room;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

class RoomRowMapper implements RowMapper<RoomVO> {

	@Override
	public RoomVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		RoomVO data = new RoomVO();
		
		data.setRoomNum(rs.getInt("roomnum"));
		data.setHotelNum(rs.getInt("hotelnum"));
		data.setRoomName(rs.getString("roomName"));
		data.setExpln(rs.getString("expln"));
		
		return data;
	}
}

@Repository()
public class SpringRoomDAO {
	
	// 전체 방출력
	private static final String sql_SELECT_ALL="SELECT * FROM room";
	// 방한개 출력
	private static final String sql_SELECT_ONE="SELECT * FROM room WHERE roomnum=?";
	// 방정보 입력
	private static final String sql_INSERT="INSERT INTO room(roomnum, hotelnum, roomname, expln) VALUES((SELECT NVL(MAX(roomnum),0)+1 FROM room),?,?,?)";
	// 방삭제
	private static final String sql_DELETE="DELETE FROM room WHERE roomnum=?";
	// 방정보 수정
	private static final String sql_UPDATE="UPDATE room roomname=?, expln=? WHERE roomnum=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// 전체 호텔 리스트
	public List<RoomVO> getRoomList(){
		System.out.println("SpringHotelDAO getHotelList");
		return jdbcTemplate.query(sql_SELECT_ALL, new RoomRowMapper());
	}
	// 호텔 한개 출력
	public RoomVO getRoomData(RoomVO vo) {
		System.out.println("SpringHotelDAO getHotelData");
		Object[] args = { vo.getRoomNum() };
		return jdbcTemplate.queryForObject(sql_SELECT_ONE, args ,new RoomRowMapper());
	}
	// 호텔 등록
	public boolean insert(RoomVO vo) {
		boolean flag = false;
		jdbcTemplate.update(sql_INSERT, vo.getHotelNum(), vo.getRoomName(), vo.getExpln());
		flag=true;
		return flag;
	}
	// 호텔 삭제
	public boolean delete(RoomVO vo) {
		boolean flag = false;
		jdbcTemplate.update(sql_DELETE, vo.getRoomNum());
		flag=true;
		return flag;
	}
	// 호텔 수정
	public boolean update(RoomVO vo) {
		boolean flag = false;
		jdbcTemplate.update(sql_UPDATE, vo.getRoomName(), vo.getExpln(), vo.getRoomNum());
		flag=true;
		return flag;
	}
	
	
}

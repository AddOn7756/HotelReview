package model.hotel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

class HotelRowMapper implements RowMapper<HotelVO>{

	@Override
	public HotelVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		HotelVO data = new HotelVO();

		data.setHotelNum(rs.getInt("hotelnum"));
		data.setName(rs.getString("name"));
		data.setPnum(rs.getString("pnum"));
		data.setAddr(rs.getString("addr"));
		data.setExpln(rs.getString("expln"));
		data.setRating(rs.getInt("rating"));
		data.setRecnt(rs.getInt("recnt"));
		data.setLttLng(rs.getString("lttlng"));

		return data;
	}
}

@Repository()
public class SpringHotelDAO {

	private static final String sql_SELECT_ALL="SELECT * FROM hotel";
	private static final String sql_SELECT_ONE="SELECT * FROM hotel WHERE hotelnum=?";
	private static final String sql_INSERT="INSERT INTO hotel(hotelnum, name, pnum, addr, expln, lttlng) values((SELECT NVL(MAX(hotlnum), 0)+1 FROM hotel), ?,?,?,?,?)";
	private static final String sql_DELETE="DELETE FROM hotel WHERE hotelnum=?";
	private static final String sql_UPDATE="UPDATE hotel name=?, pnum=?, addr=?, expln=?, lttLng=? WHERE hotelnum=?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 호텔 리스트
	public List<HotelVO> getHotelList(){
		System.out.println("SpringHotelDAO getHotelList");
		return jdbcTemplate.query(sql_SELECT_ALL, new HotelRowMapper());
	}
	// 호텔 한개
	public HotelVO getHotelData(HotelVO vo) {
		System.out.println("SpringHotelDAO getHotelData");
		Object[] args = { vo.getHotelNum() };
		return jdbcTemplate.queryForObject(sql_SELECT_ONE, args, new HotelRowMapper());
	}
	// 호텔 입력
	public boolean insert(HotelVO vo) {
		boolean flag = false;
		Object[] args= {vo.getName(), vo.getPnum(), vo.getAddr(), vo.getExpln(), vo.getLttLng() };
		jdbcTemplate.update(sql_INSERT, args);
		flag=true;
		return flag;
	}
	// 호텔 삭제
	public boolean delete(HotelVO vo) {
		boolean flag = false;
		jdbcTemplate.update(sql_DELETE, vo.getHotelNum());
		flag=true;
		return flag;
	}
	// 호텔 수정
	public boolean update(HotelVO vo) {
		boolean flag = false;
		Object[] args= {vo.getName(), vo.getPnum(), vo.getAddr(), vo.getExpln(), vo.getLttLng(), vo.getHotelNum() };
		jdbcTemplate.update(sql_UPDATE, args);
		flag=true;
		return flag;
	}
	
	
}

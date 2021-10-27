package model.hotel;

import java.util.List;

public interface HotelService {

	List<HotelVO> getHotelList();
	HotelVO getHotelData(HotelVO vo);
	boolean insert(HotelVO vo);
	boolean delete(HotelVO vo);
	boolean update(HotelVO vo);
	
}

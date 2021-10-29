package model.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private SpringReviewDAO springReviewDAO;
	
	@Override
	public List<ReviewVO> getReviewList() {
		return springReviewDAO.getReviewList();
	}

	/*@Override
	public ReviewVO getReviewData(ReviewVO vo) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public boolean insert(ReviewVO vo) {
		return springReviewDAO.insert(vo);
	}

	@Override
	public boolean delete(ReviewVO vo) {
		return springReviewDAO.delete(vo);
	}

	@Override
	public boolean update(ReviewVO vo) {
		return springReviewDAO.update(vo);
	}

	
	
}

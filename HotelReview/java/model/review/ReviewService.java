package model.review;

import java.util.List;

public interface ReviewService {

	List<ReviewVO> getReviewList();
	// ReviewVO getReviewData(ReviewVO vo);
	boolean insert(ReviewVO vo);
	boolean delete(ReviewVO vo);
	boolean update(ReviewVO vo);
}

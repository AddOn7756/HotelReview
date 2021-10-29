package controller.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.review.ReviewServiceImpl;
import model.review.ReviewVO;

@Controller
public class ReviewController {

	@Autowired
	private ReviewServiceImpl reviewService;
	
	@RequestMapping("/blogSingle.do")
	public String getReviewList(Model model){
		
		List<ReviewVO> datas = new ArrayList<ReviewVO>();
		datas = reviewService.getReviewList();
		System.out.println("리뷰 컨트롤러 겟리스트 : "+datas);
		model.addAttribute("datas", datas);
		
		return "blogSingle.jsp";
	}
	@RequestMapping(value="/insertReview.do", method=RequestMethod.POST)
	public String insert(ReviewVO vo) {
		if(reviewService.insert(vo)) {
			return "blogSingle.do";
		}
		else {
			return "blogSingle.do";
		}
	}
	@RequestMapping("/deleteReview.do")
	public String delete(ReviewVO vo) {
		if(reviewService.delete(vo)) {
			System.out.println("댓글삭제 성공");
			return "blogSingle.do";
		}
		else {
			System.out.println("댓글삭제 실패");
			return "blogSingle.do";
		}
	}
	@RequestMapping("/updateReview.do")
	public String update(ReviewVO vo) {
		if(reviewService.update(vo)) {
			return "blogSingle.do";
		}
		else {
			return "blogSingle.do";
		}
	}
	
	
}

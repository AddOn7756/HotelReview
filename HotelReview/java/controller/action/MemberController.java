package controller.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.member.MemberServiceImpl;
import model.member.MemberVO;
import model.member.SpringMemberDAO;

@Controller
public class MemberController {

	@Autowired
	private MemberServiceImpl memberService;
	
	// 로그인
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(HttpSession session, MemberVO vo, HttpServletResponse response) throws IOException {
		// System.out.println("MemberController login.do : "+vo.getId());
		PrintWriter out = response.getWriter();
	    response.setContentType("text/html; charset=UTF-8");
	    
		if(vo.getId()==null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디값 공백에러!");
		}
		MemberVO data=memberService.getMemberData(vo);
		if(data!=null){
			session.setAttribute("member", data);
			return "redirect:index.jsp";
		}
		else{
			out.println("<script>alert('로그인 정보가 일치 하지 않습니다');history.go(-1)</script>");
			return "redirect:login.jsp";
		}
	}
	// 로그아웃
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main.jsp";
	}
	// 회원가입
	@RequestMapping("/signup.do")
	public String signup(MemberVO vo, SpringMemberDAO dao) {
		if(memberService.insert(vo)) {
			return "redirect:login.jsp";
		}
		else {
			return "redirect:signup.jsp";
		}
	}
	// 회원정보 수정
	@RequestMapping("/editMember.do")
	public String editMember(MemberVO vo, HttpSession session) {
		if(memberService.update(vo)) {
			session.setAttribute("member", vo);
			return "redirect:myPage.jsp";
		}
		else {
			return "redirect:editMember.jsp";
		}
	}
	// 회원삭제
	@RequestMapping("/deleteMember.do")
	public String deleteMember(HttpSession session, MemberVO vo) {
		vo = (MemberVO)session.getAttribute("member");
		if(memberService.delete(vo)) {
			session.invalidate();
			return "redirect:main.jsp";
		}
		else {
			return "redirect:main.jsp";
		}
	}
	/*@RequestMapping("myPage")
	public MemberVO myPage(HttpSession session, MemberVO vo) {
		vo = (MemberVO)session.getAttribute("member");
		
	}*/
	
	
	
}

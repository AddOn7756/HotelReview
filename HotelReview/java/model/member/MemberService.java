package model.member;

import java.util.List;

public interface MemberService {

	List<MemberVO> getMemberList();
	MemberVO getMemberData(MemberVO vo);
	boolean insert(MemberVO vo);
	boolean delete(MemberVO vo);
	boolean update(MemberVO vo);

}

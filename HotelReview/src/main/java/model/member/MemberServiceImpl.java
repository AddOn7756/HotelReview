package model.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SpringMemberDAO SpringMemberDAO;
	
	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return SpringMemberDAO.getMemberList();
	}

	@Override
	public MemberVO getMemberVO(MemberVO vo) {
		// TODO Auto-generated method stub
		return SpringMemberDAO.getMemberData(vo);
	}

	@Override
	public boolean insert(MemberVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(MemberVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MemberVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}

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
		return SpringMemberDAO.getMemberList();
	}
	
	@Override
	public MemberVO getMemberData(MemberVO vo) {
		try {
			return SpringMemberDAO.getMemberData(vo);
		} catch(Exception e) {
			return null;
		}
	}
	
	@Override
	public boolean insert(MemberVO vo) {
		return SpringMemberDAO.insert(vo);
	}

	@Override
	public boolean delete(MemberVO vo) {
		return SpringMemberDAO.delete(vo);
	}

	@Override
	public boolean update(MemberVO vo) {
		return SpringMemberDAO.update(vo);
	}
	
}

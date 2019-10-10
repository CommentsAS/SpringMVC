package lab.spring.youtube.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.spring.youtube.dao.UserDAO;
import lab.spring.youtube.model.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;

//	public List<UserVO> getYoutuberList() {
//		return dao.getYoutuberList();
//	}

	public int addUser(UserVO user) throws ParseException {
		return dao.addUser(user);
	}
//
//	public int modifyUser(UserVO user) {
//		return dao.modifyUser(user);
//	}
//
//	public UserVO getUser(String userid) {
//		return dao.getUser(userid);
//	}
//
	public UserVO login(String user_id, String pwd) {
		return dao.login(userid, userpwd);
	}
//
//	public List<UserVO> getUserList() {
//		return dao.getUserList();
//	}
	@Override
	public List<UserVO> getYoutuberList() {
		// TODO Auto-generated method stub
		return null;
	}
}

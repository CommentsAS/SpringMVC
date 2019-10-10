package lab.spring.youtube.service;

import java.text.ParseException;
import java.util.List;

import lab.spring.youtube.model.UserVO;

public interface UserService {
	public List<UserVO> getYoutuberList();
	public int addUser(UserVO user) throws ParseException;
//	public int modifyUser(UserVO user);
//	public UserVO getUser(String userid);
	public UserVO login(String userid, String userpwd);
//	public List<UserVO> getUserList();
}

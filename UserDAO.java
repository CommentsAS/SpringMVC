package lab.spring.youtube.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lab.spring.youtube.model.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public List<UserVO> getYoutuberList() {
		return sqlSession.selectList("lab.mybatis.user.UserMapper.getYoutuberList");
	}
	
	public UserVO login(String userid, String userpwd) {
		Object vo = null;
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("userid", userid);
		hm.put("userpwd", userpwd);
		vo = sqlSession.selectOne("lab.mybatis.user.UserMapper.login", hm);
		return (UserVO)vo; 
	}
	
	public int addUser(UserVO user) throws ParseException {
		if(user.getBirth()==null) {
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
			user.setBirth(transFormat.parse(user.getYear()+"-"+user.getMonth()+"-"+user.getDay()));
		}
		return sqlSession.insert("lab.mybatis.user.UserMapper.addUser", user);
	}
	
//	public int modifyUser(UserVO user) {
//		return sqlSession.update("lab.mybatis.user.UserMapper.modifyUser", user);
//	}
//	
//	public UserVO getUser(String userid) {
//		return sqlSession.selectOne("lab.mybatis.user.UserMapper.getUser", userid);
//	}

}

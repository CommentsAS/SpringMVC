package lab.spring.youtube.controller;

import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
//
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.youtube.model.UserVO;
import lab.spring.youtube.service.UserService;



//
@Controller
public class UserController {
	@Autowired
	UserService service;
////
////	   @RequestMapping(value="/youtuberlist.do", method=RequestMethod.GET)
////	   public ModelAndView form() {
////	      ModelAndView mav = new ModelAndView();
////	      List<UserVO> list = null;
////	      list = service.getYoutuberList();
////	      
////	      mav.addObject("user_info", list);
////	      mav.setViewName("main2");
////	      System.out.println(list.size());
////	      System.out.println(list.get(0).toString());
////	      return mav; 
////	   }	
////	
//	
	//회원가입
	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public ModelAndView getjoin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("joinForm");
		return mav;
	}
	@RequestMapping(value="/join.do", method=RequestMethod.POST)
	public ModelAndView postjoin(UserVO vo) throws ParseException {
		ModelAndView mav = new ModelAndView();
		if(service.addUser(vo)>0) {
			mav.setViewName("main2"); //로그인으로 보내야함
		}else {
			mav.setViewName("joinForm");
		}
		return mav;
	}

   
////////////////////////硫붿씤/////////////////////
////	@RequestMapping(value="/main.do", method=RequestMethod.GET)
////	public ModelAndView userList(HttpSession session) {
////		ModelAndView mav = new ModelAndView();
////		List<UserVO> list = null;
////		list = service.getUserList();
////		mav.addObject("list", list);
////		mav.setViewName("main");
////		return mav;
////	}
//	@RequestMapping(value="/login.do", method=RequestMethod.GET)
//	public ModelAndView form() {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("loginForm");
//		return mav; 
//	}
//	
//	@RequestMapping(value="/login.do", method=RequestMethod.POST)
//	public ModelAndView login(@RequestParam("userid")String userid,
//							  @RequestParam("userpwd")String userpwd,
//							  HttpSession session) {
//		ModelAndView mav = new ModelAndView();
//		UserVO vo = null;
//		vo = service.login(userid, userpwd);
//		session.setAttribute("authInfo", vo); 
//		mav.addObject("user", vo);
//		if(vo!=null) {
//			mav.setViewName("main");
//		} else {
//			mav.setViewName("loginFail");
//		}
//		return mav;
//	} 
//	
//	@RequestMapping(value="/logout.do")
//	public String logout(HttpSession session) {
//		session.invalidate();
//		return "redirect:main.do";
//	}
//	
//	@RequestMapping(value="/getUser.do", method=RequestMethod.POST)
//	public UserVO findUser(String userid) {
//		UserVO user = null;
//		user = service.getUser(userid);
//		return user;
//	}

//   @RequestMapping(value="/modify.do", method=RequestMethod.GET)
//   public ModelAndView findUser(String userid) {
//      ModelAndView mav = new ModelAndView();
//      UserVO user = service.getUser(userid);
//      mav.addObject("user", user);
//      mav.setViewName("user_modify");
//      return mav;
//   }
//   
//   @RequestMapping(value="/update.do", method=RequestMethod.POST)
//   public ModelAndView updateUser(@ModelAttribute("user")
//                      UserVO vo) throws Exception {
//      ModelAndView mav = new ModelAndView();
//      int row = 0;
//      System.out.println(vo.getUserid());
//      System.out.println(row);
//      row = service.modifyUser(vo);
//
//      if(row != 0) {
//         mav.setViewName("redirect:/login.do");
//      } 
//      return mav;
//     }
}

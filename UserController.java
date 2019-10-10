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
	
	//로그인
		@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav; 
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("user_id")String user_id,
							  @RequestParam("pwd")String pwd,
							  HttpSession session) {
		ModelAndView mav = new ModelAndView();
		UserVO vo = null;
		vo = service.login(user_id, pwd);
		session.setAttribute("vo", vo); 
		mav.addObject("user", vo);
		if(vo!=null) {
			mav.setViewName("main2");
		} else {
			mav.setViewName("loginFail");
		}
		return mav;
	} 
	
	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main.do";
	}
	
	
	
	
	
	
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


}

package lab.spring.youtube.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.youtube.model.ChannelVO;
import lab.spring.youtube.service.ChannelService;


@Controller
public class ChannelController {

	
	@Autowired
	ChannelService service;
	
	   @RequestMapping(value="/main.do", method=RequestMethod.GET)
	   public ModelAndView form() {
	      ModelAndView mav = new ModelAndView();
	      List<ChannelVO> list1 = null;
	      list1 = service.subscriberTop();
	      mav.addObject("list1", list1);
	      
	      List<ChannelVO> list2 = null;
	      list2 = service.viewTop();
	      mav.addObject("list2", list2);
	      
	      List<ChannelVO> list3 = null;
	      list3 = service.videoTop();
	      mav.addObject("list3", list3);
	     
	      mav.setViewName("main2");

	      return mav; 
	   }	


}

package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.User;
import com.jk.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("ser")
@Controller
public class TestOneController {

 @Autowired
 private TestOneService testOneService;

 @RequestMapping(value="/findUser")
 public String findUser(HttpServletResponse hsr) throws IOException {

  return "index";
 }
 @RequestMapping(value="/selectUser")
 public void selectUser(HttpServletResponse hsq,Integer pageSize,Integer start ) throws IOException {
  List<User> u = testOneService.selectUser("sss",start,pageSize);
	/*mo.addObject("user", u);
	mo.setViewName("index");*/
  int i = testOneService.selectUserCount();
  Map<String,Object> map = new HashMap<String,Object>();
  map.put("rows", u);
  map.put("total", i);
  hsq.getWriter().write(JSON.toJSONString(map));

 }
 @RequestMapping(value="/selectUpdateJsp")
 public ModelAndView selectUpdateJsp(int id, ModelAndView mo) {
  System.out.println(id);
  User u =testOneService.selectUpdateJsp(id);
  mo.setViewName("updateUser");
  mo.addObject("list", u);

  return mo;
 }
 @RequestMapping(value="/updateFrom",method= RequestMethod.POST)
 public void updateFrom(@PathVariable User user, HttpServletResponse hsr) throws IOException {
  System.out.println(user.getName());
  System.out.println(user.getId()+"==================");
  testOneService.updateFrom(user);
  hsr.getWriter().write(JSON.toJSONString(""));
 }

}


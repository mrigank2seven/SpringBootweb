package com.telusko.springbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController 
{
    
    @RequestMapping("/home")
    public ModelAndView home(ModelAndView modelView)
    {
        modelView.setViewName("index");
        return modelView;
    }

    // @RequestMapping("/add") servlet way
    // public String add(HttpServletRequest req, HttpSession session){

    //     int num1 = Integer.parseInt(req.getParameter("num1"));
    //     int num2 = Integer.parseInt(req.getParameter("num2"));
    //     int result = num1 + num2;
    //     session.setAttribute("result", result);
    //     return "result.jsp";
    // }

    @RequestMapping("/add") // Spring Way
    public ModelAndView add(@RequestParam("num1") int num1 , @RequestParam("num2") int num2, ModelAndView modelView){
        int result = num1 + num2;
        modelView.addObject("result", result);
        modelView.setViewName("result");
        return modelView;
    }

    // {
    //     "Model":"Returns Only Data",
    //     "ModelAndView": "Returns data and view"
    // }

    @RequestMapping("/requestUser")
    public ModelAndView requestMethodName(ModelAndView modelAndView) {
        modelAndView.setViewName("base");
        return modelAndView;
    }

    @RequestMapping("/addUser")
    public String addUsers(Alien alien, Model model){
        System.out.println(alien);
        model.addAttribute("aid", alien.getAid());
        model.addAttribute("aName", alien.getAName());
        model.addAttribute("course", alien.getCourseName());
        return "alien";
    }


}

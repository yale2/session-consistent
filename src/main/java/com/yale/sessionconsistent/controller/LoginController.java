package com.yale.sessionconsistent.controller;

import com.yale.sessionconsistent.entity.Resume;
import com.yale.sessionconsistent.entity.User;
import com.yale.sessionconsistent.service.ResumeService;
import com.yale.sessionconsistent.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author yale
 */
@Controller
@Slf4j
@RequestMapping("/demo")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private RedisTemplate<String,Integer> redisTemplate;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response,User user){
        User queryUser = userService.findByUsernameAndPassword(user);
        ModelAndView modelAndView=new ModelAndView();
        if(null == queryUser){
            modelAndView.setViewName("index");
            modelAndView.addObject("errMsg","用户名或密码错误");
            return modelAndView;
        }
        List<Resume> resumes = resumeService.findAll();
        modelAndView.setViewName("list");
        request.getSession().setAttribute("username",user.getUsername());
        modelAndView.addObject("resumes",resumes);
        return modelAndView;
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Resume resume = resumeService.findById(id);
        modelAndView.addObject("resume", resume);
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Resume resume) {
        resumeService.saveOrUpdate(resume);
        return "redirect:list";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }


    @RequestMapping("delete")
    public String delete(Long id) {
        resumeService.deleteById(id);
        return "redirect:list";
    }
}

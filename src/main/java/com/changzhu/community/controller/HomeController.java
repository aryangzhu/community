package com.changzhu.community.controller;

import com.changzhu.community.entity.DiscussPost;
import com.changzhu.community.entity.Page;
import com.changzhu.community.entity.User;
import com.changzhu.community.service.DiscussPostService;
import com.changzhu.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leiliu
 * @date 22-6-24 上午11:42
 */
@Controller
public class HomeController {
    @Autowired
    UserService userService;

    @Autowired
    DiscussPostService discussPostService;


    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("data",new String("thymleaf"));
        return "hello";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getPageIndex(Model model, Page page){
        page.setRows(discussPostService.findDiscussPostRows(0));
        page.setPath("/index");
        //分页查询
        List<DiscussPost> list = discussPostService.findDiscussPosts(0,page.getOffset(),page.getLimit());
        List<Map<String,Object>> discussPosts=new ArrayList<>();
        if(list!=null){
            for (DiscussPost post:
                 list) {
                Map<String,Object> map = new HashMap<>();
                map.put("post",post);
                User user=userService.findUserById(post.getUserId());
                map.put("user",user);
                discussPosts.add(map);
            }
        }

        model.addAttribute("discussPosts",discussPosts);
        return "index";
    }
}

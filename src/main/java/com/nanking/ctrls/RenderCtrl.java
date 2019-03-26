package com.nanking.ctrls;

import com.nanking.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class RenderCtrl extends BaseCtrl {

    @Autowired
    private TestService testService;

    @RequestMapping(value="/admin/**", method=RequestMethod.GET)
    public ModelAndView index(Map<String, Object> model, HttpServletRequest request) {
        Map<String, Object> data = new HashMap<>();
        data.put("title", "INDEX");
        Map<String, Object> testRet = testService.findAll();
        data.put("list", testRet.get("data"));
        return this.render("admin", data);
    }
}

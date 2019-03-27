package com.nanking.ctrls;

import com.nanking.models.domain.Input;
import com.nanking.services.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@Controller
public class InputCtrl {
    @Autowired
    private InputService inputService;
/**添加新的入库订单/修改入库订单
 *
 */
@RequestMapping(value="/",method=RequestMethod.GET)
        public String login()
{
    return "input";
}
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String addInput(Model model, Input input)
    {
        Integer id=input.getId();
        if(id==null)
        {
            //入库单号为空时，新增入库订单
           int result  =inputService.add(input);
        }
        else{
            //不为空，对订单进行修改
          int result =inputService.modify(input);
        }
         //model.addAttribute("input",ntIeger);
        //入库主表填写完成后，跳转到入库详情表页面
         return "redirect:/inputDetail";




    }

}

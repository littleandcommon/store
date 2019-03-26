package com.nanking.ctrls;

import com.nanking.models.domain.Input;
import com.nanking.services.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
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
public class InputCtrl extends BaseCtrl {
    //@Autowired
    @Reference
    private InputService inputService;
/**添加新的入库订单/修改入库订单
 *
 */
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String addInput(Input input)
    {
        Integer inputId=input.getInputId();
        if(inputId==null)
        {
            //入库单号为空时，新增入库订单
            inputService.add(input);
        }
        else{
            //不为空，对订单进行修改
            inputService.modify(input);
        }

       return "redirect:/inputDetail";




    }

}

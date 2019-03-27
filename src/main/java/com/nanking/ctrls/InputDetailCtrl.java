package com.nanking.ctrls;

import com.nanking.models.domain.InputDetail;
import com.nanking.services.InputDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InputDetailCtrl {
    @Autowired
   private  InputDetailService inputDetailService;

    @RequestMapping(value="/detail" ,method= RequestMethod.POST)
            public String Detail(Model model, InputDetail inputDetail)
    {
        Integer inputDetailId=inputDetail.getInputDetailId();
        if(inputDetailId==null)
        {
            //入库单号为空时，新增入库订单
            int result  =inputDetailService.addDetail(inputDetail);
        }
        else{
            //不为空，对订单进行修改
            int result =inputDetailService.modifyDetail(inputDetail);
        }
        //model.addAttribute("input",ntIeger);
        //入库主表填写完成后，跳转到入库详情表页面
        return "redirect:/saveOk";





    }
}


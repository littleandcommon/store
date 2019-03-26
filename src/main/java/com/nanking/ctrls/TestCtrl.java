package com.nanking.ctrls;


import com.nanking.common.Result;
import com.nanking.models.domain.Test;
import com.nanking.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;


@RestController
@RequestMapping("/test")
public class TestCtrl extends BaseCtrl {

    @Autowired
    private TestService testService;

    @GetMapping()
    public Result findAll(Test test) {
        Map<String, Object> map = testService.findAll();
        return this.send(map);
    }

    @PostMapping
    public Result addTest(@Valid Test test) {
        return this.send(null);
    }

    @DeleteMapping("/delete/{testId}")
    public Result testPath(@PathVariable int testId) {
        return this.send(testId);
    }
}

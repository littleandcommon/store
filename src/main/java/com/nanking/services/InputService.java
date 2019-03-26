package com.nanking.services;

import com.nanking.models.dao.InputDao;
import com.nanking.models.domain.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class InputService implements InputDao{
    //底层的方法注入进来
    @Autowired
    private InputDao inputDao;
     @Override
    public int add(Input input)
    {
        return inputDao.add(input);

    }
    @Override
    public int modify(Input input)
    {
        return inputDao.modify(input);
    }




}

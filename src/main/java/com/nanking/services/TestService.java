package com.nanking.services;


import com.nanking.models.dao.TestDao;
import com.nanking.models.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public Map<String, Object> findAll(){
        Map<String, Object> map = new HashMap<>();
        List<Test> list = testDao.findAll();
        map.put("data", list);
        map.put("total", 100);
        return map;
    }

    @Transactional
    public Map<String, Object> findAllByTrans(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Test> list = testDao.findAll();
        map.put("data", list);
        map.put("total", 100);
        return map;
    }
}

package com.nanking.services;

import com.nanking.models.dao.OutputDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutputService {
    @Autowired
    private OutputDao outputService;

}

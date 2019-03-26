package com.nanking.models.dao;


import com.nanking.models.domain.Test;

import java.util.List;

public interface TestDao {
    public List<Test> findAll();
}

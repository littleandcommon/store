package com.nanking.services;

import com.nanking.models.dao.InputDao;
import com.nanking.models.dao.InputDetailDao;
import com.nanking.models.domain.InputDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class InputDetailService implements InputDetailDao {
    @Autowired
    private InputDetailDao inputDetailDao;

    @Override
    public int addDetail(InputDetail inputDetail){
        return inputDetailDao.addDetail(inputDetail);

    }
    @Override
    public int modifyDetail(InputDetail inputDetail)
    {
        return inputDetailDao.modifyDetail(inputDetail);

    }
}

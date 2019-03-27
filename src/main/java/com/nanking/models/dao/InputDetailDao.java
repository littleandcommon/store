package com.nanking.models.dao;

import com.nanking.models.domain.InputDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InputDetailDao {
    int addDetail(InputDetail inputDetail);
    int modifyDetail(InputDetail inputDetail);

}

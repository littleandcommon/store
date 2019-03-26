package com.nanking.models.dao;

import com.nanking.models.domain.Input;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//把当前的Mapper变为spring 的一个bean
@Mapper
public interface InputDao {
    /**
     * 新增入库单号
     * @param id
     * @return
     */
    int add(Input input);

    /**更改相关的其他属性
     *
     * @param id
     * @return
     */
    int  modify(Input input);

}

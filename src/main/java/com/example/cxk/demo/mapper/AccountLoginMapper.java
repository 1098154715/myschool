package com.example.cxk.demo.mapper;

import com.example.cxk.demo.dto.vo.AccountLoginVO;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AccountLoginMapper extends com.example.cxk.demo.mapper.generator.AccountLoginMapper {

    AccountLoginVO getAccountLoginByUserName(@Param("userName") String userName);
}
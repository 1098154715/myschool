package com.example.cxk.demo.service.impl;

import com.example.cxk.demo.dto.vo.AccountLoginVO;
import com.example.cxk.demo.entity.AccountLogin;
import com.example.cxk.demo.entity.AccountLoginExample;
import com.example.cxk.demo.mapper.AccountLoginMapper;
import com.example.cxk.demo.service.AccountLoginService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AccountLoginServiceImpl implements AccountLoginService {
    private final AccountLoginMapper accountLoginMapper;

    public AccountLoginServiceImpl(AccountLoginMapper accountLoginMapper) {
        this.accountLoginMapper = accountLoginMapper;
    }


    @Override
    public AccountLoginVO getAccountLoginByUserNameAndPassword(String userName) {
        AccountLoginExample example=new AccountLoginExample();
        example.createCriteria().andUserNameEqualTo(userName);
        AccountLoginVO accountLogins= accountLoginMapper.getAccountLoginByUserName(userName);
        return accountLogins;
    }


    @Override
    public void insert(AccountLogin login) {
        login.setCreateTime(LocalDateTime.now());
        login.setId(UUID.randomUUID().toString().replaceAll("-",""));
        accountLoginMapper.insert(login);
    }
}

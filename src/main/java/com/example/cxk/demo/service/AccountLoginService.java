package com.example.cxk.demo.service;

import com.example.cxk.demo.dto.vo.AccountLoginVO;
import com.example.cxk.demo.entity.AccountLogin;


public interface AccountLoginService {
    AccountLoginVO getAccountLoginByUserNameAndPassword(String userName);

    void insert(AccountLogin login);
}

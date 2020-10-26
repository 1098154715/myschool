package com.example.cxk.demo.controller;

import com.example.cxk.demo.dto.submit.RegisterAccountSubmit;
import com.example.cxk.demo.dto.vo.AccountLoginVO;
import com.example.cxk.demo.entity.AccountLogin;
import com.example.cxk.demo.enums.HttpStateEnum;
import com.example.cxk.demo.service.AccountLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.cxk.demo.util.EncryptUtil;
import com.example.cxk.demo.util.RedisUtils;
import com.example.cxk.demo.util.RespMassage;

import javax.validation.Valid;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 登录Controller
 */

@Slf4j
@Api(value = "账户管理", tags = "账户管理")
@RestController
@RequestMapping(value = "/account")
public class AccountController extends BaseController {
    @Autowired
    private AccountLoginService accountLoginService;
    @Autowired
    private RedisUtils redisUtils;

    @GetMapping(value = "/login")
    @ApiOperation(value = "用户密码登陆")
    public RespMassage<AccountLoginVO> login(AccountLogin submit, BindingResult bindingResult) throws IOException {
        log.info("登录参数：{}"+submit);
        //验证参数
        super.checkParameter(bindingResult);
        //验证密码
        String md5Password= EncryptUtil.md5Spring(submit.getPassword());
        //查询数据库是否存在
        AccountLoginVO account = accountLoginService.getAccountLoginByUserNameAndPassword(submit.getUserName());
        if(account==null||(account!=null&&account.getPassword().equals(md5Password))){
            return new RespMassage<>(HttpStateEnum.FAILED.getStatus(), "您输入的账户或密码错误");
        }
        //登录成功！返回token
        account.setPassword(null);
        String token=redisUtils.addLoginRedis(RedisUtils.getLoginKey(),account);
       account.setToken(token);
        return new RespMassage<>(HttpStateEnum.FAILED.getStatus(), "您输入的账户或密码",account);
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ApiOperation(value = "用户注册")
    public RespMassage<AccountLoginVO> register(@RequestBody @Valid RegisterAccountSubmit submit, BindingResult bindingResult) throws IOException {
        log.info("注册参数：{}"+submit);
        //验证参数
        super.checkParameter(bindingResult);
        //验证密码
        AccountLoginVO loginVO=accountLoginService.getAccountLoginByUserNameAndPassword(submit.getUserName());
        if(loginVO!=null){
            return new RespMassage<>(HttpStateEnum.FAILED.getStatus(), "用户已存在！");
        }
        AccountLogin login=new AccountLogin();
        //密码加密
        login.setPassword(EncryptUtil.md5Spring(login.getPassword()));
        //绑定数据
        submit.binding(login);
        //保存数据
        accountLoginService.insert(login);

        return new RespMassage<>(HttpStateEnum.FAILED.getStatus(), "您已注册成功！");
    }
}

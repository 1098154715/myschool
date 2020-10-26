package com.example.cxk.demo.dto.submit;

import com.example.cxk.demo.entity.AccountLogin;
import com.example.cxk.demo.service.customannotation.ValSearch;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 注册数据
 *
 * @author cxk
 * @date 2020/8/7 16:52
 */
@Data
public class RegisterAccountSubmit {
    /**
     * 账户名称
     */
    @ApiModelProperty(value = "账户名称", required = true)
    @NotBlank(message = "账户名称不能为空")
    String userName;

    /**
     * 账户密码
     */
    @ApiModelProperty(value = "密码不能为空", required = true)
    @NotBlank(message = "密码不能为空")
    @ValSearch(min = 6, max = 20)
    String password;

    /**
     * 绑定数据
     */
   public void binding(AccountLogin accountLogin) {
        accountLogin.setUserName(userName);
        accountLogin.setPassword(password);
    }
}

package com.example.cxk.demo.dto.submit;

import com.example.cxk.demo.entity.AccountLogin;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 *
 */
@ApiModel
@Data
public class AccountLoginSubmit {
    /**
     * 账户名称
     */
    @ApiModelProperty(value = "账户名称",required = true)
    @NotBlank(message = "账户名称不能为空")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码",required = true)
    @NotBlank(message = "密码不能为空")
    private String password;

    public void translateTo(AccountLogin entity) {
       entity.withUserName(this.userName).withPassword(this.password);
    }
}

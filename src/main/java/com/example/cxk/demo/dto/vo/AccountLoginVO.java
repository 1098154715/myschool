package com.example.cxk.demo.dto.vo;

import com.example.cxk.demo.service.customannotation.ValSearch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@ApiModel
@Data
public class AccountLoginVO {
    /**
     * 账户名称
     */
    @ApiModelProperty(value = "账户名称")

    private String userName;

    /**
     * token
     */
    @ApiModelProperty(value = "用户token")

    private String token;


    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 自定义搜索（1可不写，如要写字数长度只能1到10）
     */
    @ApiModelProperty(value = "1可不写，如要写字数长度只能1到10")
    @ValSearch(min = 1L,max = 10L)
    private String search;

}

package com.example.cxk.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * <p>Table name:tt_account_login</p>
 * <p>Create time:2020-08-08 12:41:52</p>
 *
 * @author eros
 */
@Data
public class AccountLogin implements Serializable {
    /**
     * 登录账户id
     */
    private String id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;

    public AccountLogin withId(String id) {
        this.setId(id);
        return this;
    }

    public AccountLogin withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public AccountLogin withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public AccountLogin withCreateTime(LocalDateTime createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}
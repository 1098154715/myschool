package com.example.cxk.demo.mapper.generator;

import com.example.cxk.demo.entity.AccountLogin;
import com.example.cxk.demo.entity.AccountLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface AccountLoginMapper {
    long countByExample(AccountLoginExample example);

    int deleteByExample(AccountLoginExample example);

    @Delete({
        "delete from tt_account_login",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into tt_account_login (id, user_name, ",
        "password, create_time)",
        "values (#{id,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(AccountLogin record);

    int insertSelective(AccountLogin record);

    List<AccountLogin> selectByExampleWithRowbounds(AccountLoginExample example, RowBounds rowBounds);

    List<AccountLogin> selectByExample(AccountLoginExample example);

    @Select({
        "select",
        "id, user_name, password, create_time",
        "from tt_account_login",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.example.cxk.demo.mapper.generator.AccountLoginMapper.BaseResultMap")
    AccountLogin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AccountLogin record, @Param("example") AccountLoginExample example);

    int updateByExample(@Param("record") AccountLogin record, @Param("example") AccountLoginExample example);

    int updateByPrimaryKeySelective(AccountLogin record);

    @Update({
        "update tt_account_login",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(AccountLogin record);
}
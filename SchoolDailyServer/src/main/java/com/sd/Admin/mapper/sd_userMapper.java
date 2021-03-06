package com.sd.Admin.mapper;

import java.util.List;
import com.sd.Admin.pojo.sd_user;
import com.sd.Admin.pojo.sd_userExample;

public interface sd_userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_user
     *
     * @mbg.generated
     */
    int insert(sd_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_user
     *
     * @mbg.generated
     */
    int insertSelective(sd_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_user
     *
     * @mbg.generated
     */
    List<sd_user> selectByExample(sd_userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_user
     *
     * @mbg.generated
     */
    sd_user selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(sd_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(sd_user record);

	List<sd_user> getUsers();
}
package com.sd.Admin.mapper;

import java.util.List;
import com.sd.Admin.pojo.sd_punish;
import com.sd.Admin.pojo.sd_punishExample;

public interface sd_punishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_punish
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_punish
     *
     * @mbg.generated
     */
    int insert(sd_punish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_punish
     *
     * @mbg.generated
     */
    int insertSelective(sd_punish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_punish
     *
     * @mbg.generated
     */
    List<sd_punish> selectByExample(sd_punishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_punish
     *
     * @mbg.generated
     */
    sd_punish selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_punish
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(sd_punish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_punish
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(sd_punish record);
}
package com.sd.Admin.mapper;

import java.util.List;
import com.sd.Admin.pojo.sd_reward;
import com.sd.Admin.pojo.sd_rewardExample;

public interface sd_rewardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_reward
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_reward
     *
     * @mbg.generated
     */
    int insert(sd_reward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_reward
     *
     * @mbg.generated
     */
    int insertSelective(sd_reward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_reward
     *
     * @mbg.generated
     */
    List<sd_reward> selectByExample(sd_rewardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_reward
     *
     * @mbg.generated
     */
    sd_reward selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_reward
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(sd_reward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sd_reward
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(sd_reward record);
}
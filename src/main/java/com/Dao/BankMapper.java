package com.Dao;

import com.model.Bank;

public interface BankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    int insert(Bank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    int insertSelective(Bank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    Bank selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    int updateByPrimaryKeySelective(Bank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    int updateByPrimaryKey(Bank record);
}
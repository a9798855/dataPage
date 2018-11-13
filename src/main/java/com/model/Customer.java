package com.model;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.id
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.name
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.IDCard
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String idcard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.cell
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String cell;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.custManagerID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private Integer custmanagerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.applyDate
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private Date applydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.bizStatus
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String bizstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.weChatOpenID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String wechatopenid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.weChatUserName
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String wechatusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.province
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.city
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.gender
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.amount
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.uses
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String uses;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.bankID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private Integer bankid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.reference
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String reference;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.id
     *
     * @return the value of t_customer.id
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.id
     *
     * @param id the value for t_customer.id
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.name
     *
     * @return the value of t_customer.name
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.name
     *
     * @param name the value for t_customer.name
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.IDCard
     *
     * @return the value of t_customer.IDCard
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.IDCard
     *
     * @param idcard the value for t_customer.IDCard
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.cell
     *
     * @return the value of t_customer.cell
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getCell() {
        return cell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.cell
     *
     * @param cell the value for t_customer.cell
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setCell(String cell) {
        this.cell = cell == null ? null : cell.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.custManagerID
     *
     * @return the value of t_customer.custManagerID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public Integer getCustmanagerid() {
        return custmanagerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.custManagerID
     *
     * @param custmanagerid the value for t_customer.custManagerID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setCustmanagerid(Integer custmanagerid) {
        this.custmanagerid = custmanagerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.applyDate
     *
     * @return the value of t_customer.applyDate
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public Date getApplydate() {
        return applydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.applyDate
     *
     * @param applydate the value for t_customer.applyDate
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.bizStatus
     *
     * @return the value of t_customer.bizStatus
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getBizstatus() {
        return bizstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.bizStatus
     *
     * @param bizstatus the value for t_customer.bizStatus
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setBizstatus(String bizstatus) {
        this.bizstatus = bizstatus == null ? null : bizstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.weChatOpenID
     *
     * @return the value of t_customer.weChatOpenID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getWechatopenid() {
        return wechatopenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.weChatOpenID
     *
     * @param wechatopenid the value for t_customer.weChatOpenID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setWechatopenid(String wechatopenid) {
        this.wechatopenid = wechatopenid == null ? null : wechatopenid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.weChatUserName
     *
     * @return the value of t_customer.weChatUserName
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getWechatusername() {
        return wechatusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.weChatUserName
     *
     * @param wechatusername the value for t_customer.weChatUserName
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setWechatusername(String wechatusername) {
        this.wechatusername = wechatusername == null ? null : wechatusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.province
     *
     * @return the value of t_customer.province
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.province
     *
     * @param province the value for t_customer.province
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.city
     *
     * @return the value of t_customer.city
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.city
     *
     * @param city the value for t_customer.city
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.gender
     *
     * @return the value of t_customer.gender
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.gender
     *
     * @param gender the value for t_customer.gender
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.amount
     *
     * @return the value of t_customer.amount
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.amount
     *
     * @param amount the value for t_customer.amount
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.uses
     *
     * @return the value of t_customer.uses
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getUses() {
        return uses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.uses
     *
     * @param uses the value for t_customer.uses
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setUses(String uses) {
        this.uses = uses == null ? null : uses.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.bankID
     *
     * @return the value of t_customer.bankID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public Integer getBankid() {
        return bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.bankID
     *
     * @param bankid the value for t_customer.bankID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.reference
     *
     * @return the value of t_customer.reference
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getReference() {
        return reference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.reference
     *
     * @param reference the value for t_customer.reference
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }
}
package com.model;

public class CustManager {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cusmanager.id
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cusmanager.name
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cusmanager.cell
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String cell;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cusmanager.serverArea
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private String serverarea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cusmanager.bankID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    private Integer bankid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cusmanager.id
     *
     * @return the value of t_cusmanager.id
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cusmanager.id
     *
     * @param id the value for t_cusmanager.id
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cusmanager.name
     *
     * @return the value of t_cusmanager.name
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cusmanager.name
     *
     * @param name the value for t_cusmanager.name
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cusmanager.cell
     *
     * @return the value of t_cusmanager.cell
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getCell() {
        return cell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cusmanager.cell
     *
     * @param cell the value for t_cusmanager.cell
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setCell(String cell) {
        this.cell = cell == null ? null : cell.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cusmanager.serverArea
     *
     * @return the value of t_cusmanager.serverArea
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public String getServerarea() {
        return serverarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cusmanager.serverArea
     *
     * @param serverarea the value for t_cusmanager.serverArea
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setServerarea(String serverarea) {
        this.serverarea = serverarea == null ? null : serverarea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cusmanager.bankID
     *
     * @return the value of t_cusmanager.bankID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public Integer getBankid() {
        return bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cusmanager.bankID
     *
     * @param bankid the value for t_cusmanager.bankID
     *
     * @mbggenerated Mon Nov 12 11:10:35 CST 2018
     */
    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }
}
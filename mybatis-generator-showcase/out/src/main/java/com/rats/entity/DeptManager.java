package com.rats.entity;

import java.util.Date;

public class DeptManager extends DeptManagerKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_manager.from_date
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    private Date fromDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_manager.to_date
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    private Date toDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_manager.from_date
     *
     * @return the value of dept_manager.from_date
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_manager.from_date
     *
     * @param fromDate the value for dept_manager.from_date
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_manager.to_date
     *
     * @return the value of dept_manager.to_date
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_manager.to_date
     *
     * @param toDate the value for dept_manager.to_date
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
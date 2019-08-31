package com.yc.shoesMall.bean;

import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_num
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String orderNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.uid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.create_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.count_price
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Long countPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.finish_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Date finishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.address_id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private Integer addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.pay_method
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    private String payMethod;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_num
     *
     * @return the value of order.order_num
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_num
     *
     * @param orderNum the value for order.order_num
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.uid
     *
     * @return the value of order.uid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.uid
     *
     * @param uid the value for order.uid
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.create_time
     *
     * @return the value of order.create_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.create_time
     *
     * @param createTime the value for order.create_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.count_price
     *
     * @return the value of order.count_price
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Long getCountPrice() {
        return countPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.count_price
     *
     * @param countPrice the value for order.count_price
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setCountPrice(Long countPrice) {
        this.countPrice = countPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.finish_time
     *
     * @return the value of order.finish_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.finish_time
     *
     * @param finishTime the value for order.finish_time
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.address_id
     *
     * @return the value of order.address_id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.address_id
     *
     * @param addressId the value for order.address_id
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status
     *
     * @return the value of order.status
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status
     *
     * @param status the value for order.status
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.pay_method
     *
     * @return the value of order.pay_method
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.pay_method
     *
     * @param payMethod the value for order.pay_method
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }
}
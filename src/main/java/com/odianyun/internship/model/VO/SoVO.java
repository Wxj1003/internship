package com.odianyun.internship.model.VO;

import java.io.Serializable;

/**
 * @description:
 * @author: EDZ
 * @time: 10:30
 * @date: 2021/7/16
 */
public class SoVO implements Serializable {
    private static final long serialVersionUID = -6592575993631478052L;

    private Long id;

    private String orderCode;

    private Long userId;

    private String userName;

    private Long merchantId;

    private Integer orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}

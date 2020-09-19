package com.lmfirst.pojo.vo;

/**
 * MerchantOrdersVO
 *
 * @author leiming
 * @date 9/19/20
 */
public class MerchantOrdersVO {

    // 商户订单号
    private String merchantOrderId;
    // 商户方发起用户的用户主键
    private String merchantUserId;
    // 实际支付总金额
    private Integer amount;
    // 支付方式 1-微信 2-支付宝
    private Integer payMethod;
    // 回调地址
    private String returnUrl;

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

}

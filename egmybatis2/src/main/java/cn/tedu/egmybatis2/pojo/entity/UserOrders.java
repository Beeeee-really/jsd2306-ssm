package cn.tedu.egmybatis2.pojo.entity;

import java.util.Date;

public class UserOrders {
    private String orderId;
    private String custId;
    private Date orderDate;
    private String status;
    private Integer productsNum;
    private Double amt;

    @Override
    public String toString() {
        return "UserOrders{" +
                "orderId='" + orderId + '\'' +
                ", custId='" + custId + '\'' +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                ", productsNum=" + productsNum +
                ", amt=" + amt +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProductsNum() {
        return productsNum;
    }

    public void setProductsNum(Integer productsNum) {
        this.productsNum = productsNum;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }
}

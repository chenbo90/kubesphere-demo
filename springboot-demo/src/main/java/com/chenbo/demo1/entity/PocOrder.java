package com.chenbo.demo1.entity;

import org.apache.ibatis.type.Alias;

/**
 * @ClassName PocOrder
 * @Description TODO
 * @Author chenbo
 * @Date 2019-05-13 16:42
 **/
@Alias("pocOrder")
public class PocOrder {
    private int id;
    private String userid;
    private String orderid;
    private String productid;
    private String fee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PocOrder{");
        sb.append("id=").append(id);
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", orderid='").append(orderid).append('\'');
        sb.append(", productid='").append(productid).append('\'');
        sb.append(", fee='").append(fee).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

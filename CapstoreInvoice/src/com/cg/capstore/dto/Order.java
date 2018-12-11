package com.cg.capstore.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "order_details")
public class Order {	    
	    private String user_Id;
	    @Id
	    private String order_Id;
	    private String payment_Id;
	    private String order_status;
	    private Date order_date;
	    private Integer total_price;
	    private String product_Id;
	    private String coupon_Id;
	    
	    public String getProduct_Id() {
	        return product_Id;
	    }
	    public void setProduct_Id(String product_Id) {
	        this.product_Id = product_Id;
	    }
	    public String getCoupon_Id() {
	        return coupon_Id;
	    }
	    public void setCoupon_Id(String coupon_Id) {
	        this.coupon_Id = coupon_Id;
	    }
	    public String getUser_Id() {
	        return user_Id;
	    }
	    public void setUser_Id(String user_Id) {
	        this.user_Id = user_Id;
	    }
	    public String getOrder_Id() {
	        return order_Id;
	    }
	    public void setOrder_Id(String order_Id) {
	        this.order_Id = order_Id;
	    }
	    public String getPayment_Id() {
	        return payment_Id;
	    }
	    public void setPayment_Id(String payment_Id) {
	        this.payment_Id = payment_Id;
	    }
	    public String getOrder_status() {
	        return order_status;
	    }
	    public void setOrder_status(String order_status) {
	        this.order_status = order_status;
	    }
	    public Date getOrder_date() {
	        return order_date;
	    }
	    public void setOrder_date(Date order_date) {
	        this.order_date = order_date;
	    }
	    public Integer getTotal_price() {
	        return total_price;
	    }
	    public void setTotal_price(Integer total_price) {
	        this.total_price = total_price;
	    }
	    @Override
	    public String toString() {
	        return "Order [user_Id=" + user_Id + ", order_Id=" + order_Id
	                + ", payment_Id=" + payment_Id + ", order_status="
	                + order_status + ", order_date=" + order_date
	                + ", total_price=" + total_price + ", product_Id=" + product_Id
	                + ", coupon_Id=" + coupon_Id + "]";
	    }
	    public Order(String user_Id, String order_Id, String payment_Id,
	            String order_status, Date order_date, Integer total_price,
	            String product_Id, String coupon_Id) {
	        super();
	        this.user_Id = user_Id;
	        this.order_Id = order_Id;
	        this.payment_Id = payment_Id;
	        this.order_status = order_status;
	        this.order_date = order_date;
	        this.total_price = total_price;
	        this.product_Id = product_Id;
	        this.coupon_Id = coupon_Id;
	    }
	    public Order() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
}

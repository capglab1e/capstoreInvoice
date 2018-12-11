package com.cg.capstore.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id 
    @Column(name="prod_id", length=60)  
    private String prodId;
    
    @Column(name="prod_name", length=60)
    //@NotNull(message="slary should not be blank")
    private String prodName;
    
    @Column(name="description", length=60)
    //@NotNull(message="slary should not be blank")
    private String desc;
    
    @Column(name="price", length=60)
    //@NotNull(message="slary should not be blank")
    private double price;

    @Column(name="category_id", length=60)
    //@NotNull(message="slary should not be blank")
    private String categoryId;
    
    @Column(name="subCategory_id", length=60)
    //@NotNull(message="slary should not be blank")
    private String subCategoryId;   
    
    @Column(name="qty_supplied", length=60)
    //@NotNull(message="slary should not be blank")
    private int qtySupplied;
    
    @Column(name="qty_available", length=60)
    //@NotNull(message="slary should not be blank")
    private int qtyAvailable;
    
    @Column(name="merchant_id", length=60)
    //@NotNull(message="slary should not be blank")
    private String merchantId;
    
    @Column(name="rating", length=60)   
    private int rating;

    
    public Product() {
        super();
    }
    public Product(String prodId, String prodName, String desc, double price,
            String categoryId, String subCategoryId, int qtySupplied,
            int qtyAvailable, String merchantId, int rating) {
        super();
        this.prodId = prodId;
        this.prodName = prodName;
        this.desc = desc;
        this.price = price;
        this.categoryId = categoryId;
        this.subCategoryId = subCategoryId;
        this.qtySupplied = qtySupplied;
        this.qtyAvailable = qtyAvailable;
        this.merchantId = merchantId;
        this.rating = rating;
    }




    public String getProdId() {
        return prodId;
    }
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSubCategoryId() {
        return subCategoryId;
    }
    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public int getQtySupplied() {
        return qtySupplied;
    }
    public void setQtySupplied(int qtySupplied) {
        this.qtySupplied = qtySupplied;
    }

    public int getQtyAvailable() {
        return qtyAvailable;
    }
    public void setQtyAvailable(int qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
    }

    public String getMerchantId() {
        return merchantId;
    }
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Product [prodId=" + prodId + ", prodName=" + prodName
                + ", desc=" + desc + ", price=" + price + ", categoryId="
                + categoryId + ", subCategoryId=" + subCategoryId
                + ", qtySupplied=" + qtySupplied + ", qtyAvailable="
                + qtyAvailable + ", merchantId=" + merchantId + ", rating="
                + rating + "]";
    }

    
    
    
}

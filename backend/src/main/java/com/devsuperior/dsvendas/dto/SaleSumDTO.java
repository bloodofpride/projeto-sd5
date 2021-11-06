package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.model.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final Long serialVersionUID = 1L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO(){

    }

    public SaleSumDTO(Seller seller, Double sum){
        this.sellerName = seller.getNome();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}

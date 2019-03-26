package com.nanking.models.domain;

import org.springframework.stereotype.Component;

@Component
public class OutputDetail {
    public String outputId;
    public String outputNumber;
    public String storeName;
    public String goodsName;
    public String goodsSize;
    public String goodsPrice;
    public String goodsCount;
    public int outputDetailsId;
    public String goodsNumber;

    public String getOutputId() {
        return outputId;
    }

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    public String getOutputNumber() {
        return outputNumber;
    }

    public void setOutputNumber(String outputNumber) {
        this.outputNumber = outputNumber;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(String goodsCount) {
        this.goodsCount = goodsCount;
    }

    public int getOutputDetailsId() {
        return outputDetailsId;
    }

    public void setOutputDetailsId(int outputDetailsId) {
        this.outputDetailsId = outputDetailsId;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}

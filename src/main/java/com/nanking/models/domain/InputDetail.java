package com.nanking.models.domain;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

@Component
public class InputDetail {
    public String inputId;
    @NotEmpty(message="入库详情不能为空")
    public String inputNumber;
    public String storeName;
    @NotEmpty(message="产品名称不能为空")
    public String goodsName;
    public String goodsSize;
    public String goodsPrice;
    @NotEmpty(message="产品数量不能为空")
    public String goodsCount;
    public String goodsNumber;
    public int inputDetailId;

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
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

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public int getInputDetailId() {
        return inputDetailId;
    }

    public void setInputDetailId(int inputDetailId) {
        this.inputDetailId = inputDetailId;
    }
}

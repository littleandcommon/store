package com.nanking.models.domain;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Component
public class Input {
    public int inputNumber;
    @NotEmpty(message="入库类型不能为空")
    public String inputType;
    @NotNull(message="入库时间不能为空")
    public String inputTime;
    @NotEmpty(message="入库人不能为空")
    public String inputPerson;
    public String inputOperation;
    public String storeName;
    public int inputId;
    public String goodsNumber;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson;
    }

    public String getInputOperation() {
        return inputOperation;
    }

    public void setInputOperation(String inputOperation) {
        this.inputOperation = inputOperation;
    }

    public int getInputId() {
        return inputId;
    }

    public void setInputId(int inputId) {
        this.inputId = inputId;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}

package com.nanking.models.domain;

import org.springframework.stereotype.Component;

@Component
public class Output {
    public int outputNumber;
    public String outputType;
    public String outputTime;
    public String outputPerson;
    public String outputOperation;
    public int outputId;
    public String storeName;
    public String goodsNumber;


    public int getOutputNumber() {
        return outputNumber;
    }

    public void setOutputNumber(int outputNumber) {
        this.outputNumber = outputNumber;
    }

    public int getOutputId() {
        return outputId;
    }

    public void setOutputId(int outputId) {
        this.outputId = outputId;
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    public String getOutputTime() {
        return outputTime;
    }

    public void setOutputTime(String outputTime) {
        this.outputTime = outputTime;
    }

    public String getOutputPerson() {
        return outputPerson;
    }

    public void setOutputPerson(String outputPerson) {
        this.outputPerson = outputPerson;
    }

    public String getOutputOperation() {
        return outputOperation;
    }

    public void setOutputOperation(String outputOperation) {
        this.outputOperation = outputOperation;
    }



    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}

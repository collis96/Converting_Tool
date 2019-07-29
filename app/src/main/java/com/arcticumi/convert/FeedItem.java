package com.arcticumi.convert;

public class FeedItem {

    String baseCurrency;
    String targetCurrency;
    double exchangeRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "baseCurrency=" + baseCurrency + '\n' +
                ", targetCurrency=" + targetCurrency + '\n' +
                ", exchangeRate=" + exchangeRate + '\n';
    }
}

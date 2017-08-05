package com.company.logic;

/**
 * Created by prade on 8/5/2017.
 */
public class Currency {
    private int currencyId;
    public String currencyName;
    public double conversionRate;
    public boolean isBaseCurrency;
    public String currencySign;
    public boolean isValid;

    public boolean isValid() {
        return isValid;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        if(!StringValidationHelper.ValidateForEmptyOrNull(currencyName))
            throw new NullPointerException("parameter \'currencyName\' cannot be null");
        this.currencyName = currencyName;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        if(!isBaseCurrency)
            this.conversionRate = conversionRate;
    }

    public boolean isBaseCurrency() {
        return isBaseCurrency;
    }

    public void setBaseCurrency(boolean baseCurrency) {
        isBaseCurrency = baseCurrency;
        if(isBaseCurrency)
            conversionRate=0;
    }

    public String getCurrencySign() {
        return currencySign;
    }

    public void setCurrencySign(String currencySign) {
        if(!StringValidationHelper.ValidateForEmptyOrNull(currencySign))
            throw new NullPointerException("parameter \'currencySign\' cannot be null");
        this.currencySign = currencySign;
    }

    public Currency(){
        currencyId=-1;
        currencyName="USD";
        currencySign="$";
        isBaseCurrency=true;
        conversionRate=0;
        isValid=true;
    }

    public Currency(int currencyId, String currencyName, String currencySign, boolean isBaseCurrency, double conversionRate){
        currencyId=currencyId;
        setCurrencyName(currencyName);
        setCurrencySign(currencySign);
        setBaseCurrency(isBaseCurrency);
        setConversionRate(conversionRate);
        isValid=true;
    }
}

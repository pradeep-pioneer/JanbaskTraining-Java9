package com.company.logic;

/**
 * Created by prade on 8/5/2017.
 */
public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private Currency currency;
    private CustomerType type;
    private boolean isValid;

    public int getCustomerId(){return customerId;}
    public String getCustomerName(){return customerName;}
    public String getAddress(){return address;}
    public CustomerType getType(){return type;}
    public boolean getIsValid(){return isValid;}

    //setters
    public void setCustomerName(String name){
        if(!StringValidationHelper.ValidateForEmptyOrNull(name))
            throw new NullPointerException("parameter \'name\' cannot be null");
        customerName=name;
    }

    public void setAddress(String address){
        if(!StringValidationHelper.ValidateForEmptyOrNull(address))
            throw new NullPointerException("parameter \'address\' cannot be null");
        this.address=address;
    }

    public void setCurrency(Currency currency){
        if(currency==null){
            throw new NullPointerException("parameter \'currency\' cannot be null");
        }
        this.currency=currency;
    }

    public void setType(CustomerType type){
        if(currency==null)
            throw new NullPointerException("parameter \'type\' cannot be null");
        this.type=type;
    }

    public Customer(){
        customerId=-1;
        customerName="";
        address="";
        //ToDo: refactor this once the currency class is ready
        currency = new Currency();
        isValid=false;
        type=CustomerType.Individual;
    }

    public Customer(String customerName, String address, Currency currency, CustomerType type){
        //This is wrong - don't do this
        //this.customerName=customerName;
        setCustomerName(customerName);
        setAddress(address);
        setCurrency(currency);
        setType(type);
        isValid=true;
        Customer customer = new Customer();
        customer.setType(CustomerType.Individual);
    }

    public enum CustomerType {
        Individual,
        Organization
    }

    /*public class CustomerType{
        public static final int Individual  = 0;
        public static final int Organization  = 1;
        public int type = 0;
        public CustomerType(int type){
            this.type=type;
        }
    }*/
}

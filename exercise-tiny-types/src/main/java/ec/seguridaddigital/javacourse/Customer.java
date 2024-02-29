package ec.seguridaddigital.javacourse;

import java.util.List;

public class Customer {
    private int customerID;

    private String firstName;
    private String lastName;

    private String birthDate;
    private int age;

    private boolean hasHomeAddress;
    private String homeAddressStreet;
    private String homeAddressBuilding;
    private String homeAddressFloor;
    private String homeAddressCity;
    private String homeAddressZipCode;
    private String homeAddressProvince;
    private String homeAddressCountry;

    private boolean billingSameAsHomeAddress;

    private boolean hasBillingAddress;
    private String billingAddressStreet;
    private String billingAddressBuilding;
    private String billingAddressFloor;
    private String billingAddressCity;
    private String billingAddressZipCode;
    private String billingAddressProvince;
    private String billingAddressCountry;

    private boolean shippingSameAsHomeAddress;
    private boolean shippingSameAsBillingAddress;

    private boolean hasShippingAddress;
    private String shippingAddressStreet;
    private String shippingAddressBuilding;
    private String shippingAddressFloor;
    private String shippingAddressCity;
    private String shippingAddressZipCode;
    private String shippingAddressProvince;
    private String shippingAddressCountry;

    private String paymentMethod;

    private boolean hasCreditCard;
    private String cardNumber;
    private String cvv;
    private String nameOnCard;
    private String expirationOfCard;

    private boolean hasBank;
    private String bankName;
    private String bankAccountNumber;

    private List<Product> productsBought;

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasHomeAddress() {
        return hasHomeAddress;
    }

    public void setHasHomeAddress(boolean hasHomeAddress) {
        this.hasHomeAddress = hasHomeAddress;
    }

    public String getHomeAddressStreet() {
        return homeAddressStreet;
    }

    public void setHomeAddressStreet(String homeAddressStreet) {
        this.homeAddressStreet = homeAddressStreet;
    }

    public String getHomeAddressBuilding() {
        return homeAddressBuilding;
    }

    public void setHomeAddressBuilding(String homeAddressBuilding) {
        this.homeAddressBuilding = homeAddressBuilding;
    }

    public String getHomeAddressFloor() {
        return homeAddressFloor;
    }

    public void setHomeAddressFloor(String homeAddressFloor) {
        this.homeAddressFloor = homeAddressFloor;
    }

    public String getHomeAddressCity() {
        return homeAddressCity;
    }

    public void setHomeAddressCity(String homeAddressCity) {
        this.homeAddressCity = homeAddressCity;
    }

    public String getHomeAddressZipCode() {
        return homeAddressZipCode;
    }

    public void setHomeAddressZipCode(String homeAddressZipCode) {
        this.homeAddressZipCode = homeAddressZipCode;
    }

    public String getHomeAddressProvince() {
        return homeAddressProvince;
    }

    public void setHomeAddressProvince(String homeAddressProvince) {
        this.homeAddressProvince = homeAddressProvince;
    }

    public String getHomeAddressCountry() {
        return homeAddressCountry;
    }

    public void setHomeAddressCountry(String homeAddressCountry) {
        this.homeAddressCountry = homeAddressCountry;
    }

    public boolean isBillingSameAsHomeAddress() {
        return billingSameAsHomeAddress;
    }

    public void setBillingSameAsHomeAddress(boolean billingSameAsHomeAddress) {
        this.billingSameAsHomeAddress = billingSameAsHomeAddress;
    }

    public boolean isHasBillingAddress() {
        return hasBillingAddress;
    }

    public void setHasBillingAddress(boolean hasBillingAddress) {
        this.hasBillingAddress = hasBillingAddress;
    }

    public String getBillingAddressStreet() {
        return billingAddressStreet;
    }

    public void setBillingAddressStreet(String billingAddressStreet) {
        this.billingAddressStreet = billingAddressStreet;
    }

    public String getBillingAddressBuilding() {
        return billingAddressBuilding;
    }

    public void setBillingAddressBuilding(String billingAddressBuilding) {
        this.billingAddressBuilding = billingAddressBuilding;
    }

    public String getBillingAddressFloor() {
        return billingAddressFloor;
    }

    public void setBillingAddressFloor(String billingAddressFloor) {
        this.billingAddressFloor = billingAddressFloor;
    }

    public String getBillingAddressCity() {
        return billingAddressCity;
    }

    public void setBillingAddressCity(String billingAddressCity) {
        this.billingAddressCity = billingAddressCity;
    }

    public String getBillingAddressZipCode() {
        return billingAddressZipCode;
    }

    public void setBillingAddressZipCode(String billingAddressZipCode) {
        this.billingAddressZipCode = billingAddressZipCode;
    }

    public String getBillingAddressProvince() {
        return billingAddressProvince;
    }

    public void setBillingAddressProvince(String billingAddressProvince) {
        this.billingAddressProvince = billingAddressProvince;
    }

    public String getBillingAddressCountry() {
        return billingAddressCountry;
    }

    public void setBillingAddressCountry(String billingAddressCountry) {
        this.billingAddressCountry = billingAddressCountry;
    }

    public boolean isShippingSameAsHomeAddress() {
        return shippingSameAsHomeAddress;
    }

    public void setShippingSameAsHomeAddress(boolean shippingSameAsHomeAddress) {
        this.shippingSameAsHomeAddress = shippingSameAsHomeAddress;
    }

    public boolean isShippingSameAsBillingAddress() {
        return shippingSameAsBillingAddress;
    }

    public void setShippingSameAsBillingAddress(boolean shippingSameAsBillingAddress) {
        this.shippingSameAsBillingAddress = shippingSameAsBillingAddress;
    }

    public boolean isHasShippingAddress() {
        return hasShippingAddress;
    }

    public void setHasShippingAddress(boolean hasShippingAddress) {
        this.hasShippingAddress = hasShippingAddress;
    }

    public String getShippingAddressStreet() {
        return shippingAddressStreet;
    }

    public void setShippingAddressStreet(String shippingAddressStreet) {
        this.shippingAddressStreet = shippingAddressStreet;
    }

    public String getShippingAddressBuilding() {
        return shippingAddressBuilding;
    }

    public void setShippingAddressBuilding(String shippingAddressBuilding) {
        this.shippingAddressBuilding = shippingAddressBuilding;
    }

    public String getShippingAddressFloor() {
        return shippingAddressFloor;
    }

    public void setShippingAddressFloor(String shippingAddressFloor) {
        this.shippingAddressFloor = shippingAddressFloor;
    }

    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    public void setShippingAddressCity(String shippingAddressCity) {
        this.shippingAddressCity = shippingAddressCity;
    }

    public String getShippingAddressZipCode() {
        return shippingAddressZipCode;
    }

    public void setShippingAddressZipCode(String shippingAddressZipCode) {
        this.shippingAddressZipCode = shippingAddressZipCode;
    }

    public String getShippingAddressProvince() {
        return shippingAddressProvince;
    }

    public void setShippingAddressProvince(String shippingAddressProvince) {
        this.shippingAddressProvince = shippingAddressProvince;
    }

    public String getShippingAddressCountry() {
        return shippingAddressCountry;
    }

    public void setShippingAddressCountry(String shippingAddressCountry) {
        this.shippingAddressCountry = shippingAddressCountry;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(boolean hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getExpirationOfCard() {
        return expirationOfCard;
    }

    public void setExpirationOfCard(String expirationOfCard) {
        this.expirationOfCard = expirationOfCard;
    }

    public boolean isHasBank() {
        return hasBank;
    }

    public void setHasBank(boolean hasBank) {
        this.hasBank = hasBank;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public List<Product> getProductsBought() {
        return productsBought;
    }

    public void setProductsBought(List<Product> productsBought) {
        this.productsBought = productsBought;
    }

    public String getRealShippingAddressCountry() {
        if (this.shippingSameAsHomeAddress) {
            return this.homeAddressCountry;
        }
        if (this.shippingSameAsBillingAddress) {
            return this.billingAddressCountry;
        }
        return this.shippingAddressCountry;
    }

    public String getRealShippingAddressStreet() {
        if (this.shippingSameAsHomeAddress) {
            return this.homeAddressStreet;
        }
        if (this.shippingSameAsBillingAddress) {
            return this.billingAddressStreet;
        }
        return this.shippingAddressStreet;
    }
}

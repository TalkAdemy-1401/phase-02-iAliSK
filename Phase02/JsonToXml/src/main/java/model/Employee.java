package model;

import model.userinfo.PaymentInfo;
import model.userinfo.PrivateInfo;
import model.usersettings.AccountSettings;
import model.usersettings.ProfileSettings;
import model.userinfo.LocationInfo;

public class Employee {
    private String token;
    private int userType;
    private PrivateInfo privateInfo;
    private LocationInfo locationInfo;
    private PaymentInfo paymentInfo;
    private ProfileSettings profileSettings;
    private AccountSettings accountSettings;

    public Employee(String token, int userType, PrivateInfo privateInfo, LocationInfo locationInfo,
                    PaymentInfo paymentInfo, ProfileSettings profileSettings, AccountSettings accountSettings) {
        this.token = token;
        this.userType = userType;
        this.privateInfo = privateInfo;
        this.locationInfo = locationInfo;
        this.paymentInfo = paymentInfo;
        this.profileSettings = profileSettings;
        this.accountSettings = accountSettings;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public PrivateInfo getPrivateInfo() {
        return privateInfo;
    }

    public void setPrivateInfo(PrivateInfo privateInfo) {
        this.privateInfo = privateInfo;
    }

    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public ProfileSettings getProfileSettings() {
        return profileSettings;
    }

    public void setProfileSettings(ProfileSettings profileSettings) {
        this.profileSettings = profileSettings;
    }

    public AccountSettings getAccountSettings() {
        return accountSettings;
    }

    public void setAccountSettings(AccountSettings accountSettings) {
        this.accountSettings = accountSettings;
    }
}

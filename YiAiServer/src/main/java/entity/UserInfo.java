package entity;

public class UserInfo {
    private String userName;
    private String userAddress;
    private String userPhone;
    private UserHealth userHealth;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public UserHealth getUserHealth() {
        return userHealth;
    }

    public void setUserHealth(UserHealth userHealth) {
        this.userHealth = userHealth;
    }
}

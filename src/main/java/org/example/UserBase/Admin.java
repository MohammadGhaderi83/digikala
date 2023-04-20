package org.example.UserBase;

public class Admin extends UserBase{
    private String emailAddress;

    public Admin(String username, String password, String emailAddress) {
        super(username, password);
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Admin{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

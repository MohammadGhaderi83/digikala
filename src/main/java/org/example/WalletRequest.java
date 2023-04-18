package org.example;

import org.example.UserBase.User;

public class WalletRequest {
    User user;
    int amount;
    boolean isChecked;
    public WalletRequest(User user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getUsername()
    {
        return user.getUsername();
    }
    public void increase()
    {
        if (isChecked)
        {
            user.setWallet(user.getWallet() + amount);
        }
    }
}

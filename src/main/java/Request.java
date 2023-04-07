import org.example.UserBase.User;

public class Request {
    User user;
    int amount;
    boolean isChecked;

    public Request(User user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public void checked()
    {
        if (isChecked)
        {
            user.setWallet(user.getWallet() + amount);
        }
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
}

package app.model;


public class WebUser {
    private String loginId;
    private String password;
    private UserState state;

    private Customer customer; // 0..1 → 1

    public WebUser(String loginId, String password, UserState state) {
        this.loginId = loginId;
        this.password = password;
        this.state = state;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


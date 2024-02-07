package execution_model.homework;

public class Order {
    private double orderValue;
    private String orderDate;
    private String customerLogin;

    // Konstruktor
    public Order(double orderValue, String orderDate, String customerLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.customerLogin = customerLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }

    public void setCustomerLogin(String customerLogin) {
        this.customerLogin = customerLogin;
    }
}

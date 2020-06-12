package methods;

public class Customer {

    public boolean isNew;
    public String customerName;
    public int customerAge;
    public boolean isNewCustomer() {
        return isNew;
    }
public Customer(boolean _isNew, String customerName, int customerAge) {
        this.isNew = _isNew;
        setCustomerService();
        this.setFieldValues(customerName, customerAge);
}
    public void sendEmail(String message) {
        // send email
        System.out.println(message);
        System.out.println("email sent to new customer");
    }

    public void setCustomerService() {
        String message = "Hello new customer! Would you like to subscribe to the newsletter?";
        if (this.isNewCustomer()) {
            this.sendEmail(message);
        }
    }

    public void setFieldValues(String customerName, int customerAge) {
        this.customerName = customerName;
        this.customerAge = customerAge;
    }
}

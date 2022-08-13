package JerseyManagement;

public class CustomerPojo {
	private int CustomerId;
	private String CustomerName;
	private String CustomerMobile;
	private int CustomerAge;
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerMobile() {
		return CustomerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		CustomerMobile = customerMobile;
	}
	public int getCustomerAge() {
		return CustomerAge;
	}
	public void setCustomerAge(int customerAge) {
		CustomerAge = customerAge;
	}
	
}

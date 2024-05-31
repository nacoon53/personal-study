package lambdaTest1;

public class Employees {
	int employeeId;
	String employeeName = "";
	String phone = "";
	
	public Employees () {
		super();
	}
	
	public Employees(int employeeId, String employeeName, String phone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.phone = phone;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s",  employeeId, employeeName, phone);
	}
	
}

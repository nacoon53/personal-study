package AddressProject;

public class AddressDto {
	private int id = 1;
	private String name = "";
	private String phone = "";
	private String email = "";
	private String address = "";
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s %s", id, name, phone, email, address);
	}
	public AddressDto() {
		super();
	}
	
	public AddressDto(int id, String name, String phone, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

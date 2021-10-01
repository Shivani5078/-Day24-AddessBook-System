package addressBook.java;

public class contacts {
	private String fristname;

	
	private String lastname;
	private String address;
	private String city;
	private String state;
	private  String zip;
	private String phonenumber;
	private String   email;
	protected String getFristname() {
		return fristname;
	}
	protected void setFristname(String fristname) {
		this.fristname = fristname;
	}
	protected String getLastname() {
		return lastname;
	}
	protected void setLastname(String lastname) {
		this.lastname = lastname;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected String getCity() {
		return city;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	protected String getState() {
		return state;
	}
	protected void setState(String state) {
		this.state = state;
	}
	protected String getZip() {
		return zip;
	}
	protected void setZip(String zip) {
		this.zip = zip;
	}
	protected String getPhonenumber() {
		return phonenumber;
	}
	protected void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "contacts [fristname=" + fristname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber + ", email=" + email + "]";
	}
	

}

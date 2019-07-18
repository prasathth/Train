package virat.sample;

public class Address {
	private String street_name;
	private String city;
	
	Address(String street_name,String city)
	{
		this.street_name = street_name ;
		this.city = city;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

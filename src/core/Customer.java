/**
 * 
 */
package core;

/**
 * @author Daniel Eagy
 *
 */
public class Customer {
	private String name;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private int age;

	/**
	 * @param name the Customer name. 
	 * @param streetAddress the Customer's street address. 
	 * @param city the Customer's city.
	 * @param zip the Customer's Zip. 
	 * @param age the Customer's age. 
	 */
	public Customer(String name, String streetAddress, String city, String state, String zip, int age) {
		super();
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Returns the formatted address. 
	 * @return the formatted address. 
	 */
	public String displayAddress() {
		return streetAddress + ",\n" + city + ", " + state + " " + zip;
	}
	
	/**
	 * Returns the Customer's name with the formatted address. 
	 * @return the Customer's name with the formatted address. 
	 */
	public String displayAddressLabel() {
		return name + "\n" + displayAddress();
	}


}

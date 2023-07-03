package org.ailen.core.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_details")
public class UserEntity implements Serializable{
	
	
	@Id
	@GenericGenerator(name = "auto" ,strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="alt_key")
	private Long altKey;
	
	@Column(name = "name")
	private String name;

	@Column(name="email")
	private String email;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="city")
	private String city;
	
	@Column(name ="country")
	private String country;
	
	@Column(name="pin_code")
	private String pinCode;
	
	

	public Long getAltKey() {
		return altKey;
	}

	public void setAltKey(Long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "UserEntity [altKey=" + altKey + ", name=" + name + ", email=" + email + ", contactNumber="
				+ contactNumber + ", password=" + password + ", city=" + city + ", country=" + country + ", pinCode="
				+ pinCode + "]";
	}
	
	

}
/*
 * orm is use to persiste the data into the relational database without converting onj into vlaues
 * and vice verse
 * 
 * problems
 * 
 * ->problem of inheritance,
 * relation ,identity,grain,navigation
 * 
 * jpa:-javax.persistance 
 * jpa is set of standards and guide lines for the orm probelems 
 * @entity:-
 * this annotation is used at class level
 * this annotation defines a class can be map to a table inside the database
 * @table
 * this is a class level annotation 
 * this annotation allows to provide details of table that will be used to persiste the into the database
 * @Column
 * this anotation is used on top of the entity class properties
 * this annotation is used to map a entity class property to a column inside the a table
 * @id
 * this annotaion is used to specifi the primary key 
 * it is used on top of entity class property which is mapped to primary key  of column the table
 *  * 
 * */

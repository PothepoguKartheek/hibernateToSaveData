package org.ailen.core.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "flight_info")
public class Filght implements Serializable{
	
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "altKey")
	private long altKey;
	
	
	@Column(name = "flight_name")
	private String flightname;
	
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "filght_number")
	private String flightNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="air_hosters")
    private	List<AirHosters> airHosters;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public List<AirHosters> getAirHosters() {
		return airHosters;
	}

	public void setAirHosters(List<AirHosters> airHosters) {
		this.airHosters = airHosters;
	}
	
	

}

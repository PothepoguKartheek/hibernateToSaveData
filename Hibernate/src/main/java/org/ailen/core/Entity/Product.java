package org.ailen.core.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product_info")
public class Product implements Serializable{
	
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "alt_key")
	private int altKey;
	
	
	
	@Column(name = "product_name")
	private String productName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_product")
	private List<brand> brand;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<brand> getBrand() {
		return brand;
	}

	public void setBrand(List<brand> brand) {
		this.brand = brand;
	}

	
	
	

}

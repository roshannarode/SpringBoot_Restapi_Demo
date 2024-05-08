package Springboot_restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data // Getter and setter 
@Entity 
@Table (name="Course")

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Price")
	private Double price;

}

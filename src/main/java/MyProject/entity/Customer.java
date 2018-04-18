package MyProject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@Getter @Setter
public class Customer extends BaseEntity{
	
	@Column(name = "full_name")
	private String name;
	
	@Column(name = "phone")
	private int phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address", length = 500)
	private String address;
	
	@OneToMany(mappedBy = "customer")
	private List<Orders> orders = new ArrayList<>();
	
	
	

}

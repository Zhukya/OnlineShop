package MyProject.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "commodity")
@NoArgsConstructor
@Getter @Setter
public class Commodity extends BaseEntity {
	
	@Column(name = "name", length = 200)
	private String name;
	
	@Column(name = "description", length = 10000)
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "price", columnDefinition = "DECIMAL(8,2)")
	private double price;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "producer_id")
	private Producer producer;
	
	@ManyToMany
	@JoinTable(name = "commodity_order",
			joinColumns = @JoinColumn(name = "commodity_id"),
			inverseJoinColumns = @JoinColumn(name = "order_id"))
	private List<Orders> orders = new ArrayList<>();

	
	
	

}

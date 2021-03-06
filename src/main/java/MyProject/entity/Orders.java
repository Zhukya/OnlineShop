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
@Table(name = "orders")
@NoArgsConstructor
@Getter @Setter
public class Orders extends BaseEntity{
	
	
	@Column(name = "quantity")
	private int quantity;
	
	
	@Column(name = "product_price", columnDefinition = "DECIMAL(8,2)")
	private BigDecimal productPrice;
	
	@Column(name = "order_price", columnDefinition = "DECIMAL(8,2)")
	private BigDecimal orderPrice;
	
	@ManyToOne 
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@ManyToMany
	@JoinTable(name = "commodity_order",
			joinColumns = @JoinColumn(name = "order_id"),
			inverseJoinColumns = @JoinColumn(name = "commodity_id"))
	private List<Commodity> commodities = new ArrayList<>();

	

	

	

	
	

}

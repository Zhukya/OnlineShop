package MyProject.entity;

import java.math.BigDecimal;
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
@Table(name = "category")
@NoArgsConstructor
@Getter @Setter
public class Category extends BaseEntity{
	
	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "quantity", columnDefinition = "DECIMAL(8,2)")
	private BigDecimal quantity;
	
	@OneToMany(mappedBy = "category")
	List<Commodity> commodities = new ArrayList<>();

	

}

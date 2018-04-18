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
@Table(name = "producer")
@NoArgsConstructor
@Getter @Setter
public class Producer extends BaseEntity{
	
	@Column(name = "name", length = 200)
	private String name;
	
	@Column(name = "logo", length = 200)
	private String logo;
	
	@OneToMany(mappedBy = "producer")
	List<Commodity> commodities = new ArrayList<>();

	

}

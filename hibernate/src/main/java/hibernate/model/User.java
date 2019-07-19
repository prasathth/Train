package hibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data

@Entity
@Table(name = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable{
	
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @Column(name="name")
	private String name;
    
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="post_id")
	private List<Post> posts;
    
    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Address address;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", posts=" + posts + ", address=" + address + "]";
	}
	
    
	
}

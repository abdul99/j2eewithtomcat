package tutorial;

import javax.persistence.*;

@Entity
public class Role {
	  @Id // @Id indicates that this it a unique primary key
	   // @GeneratedValue(strategy = GenerationType.AUTO) // @GeneratedValue indicates that value is automatically generated by the server
	   
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="RoleC_id_seq")
	    @SequenceGenerator(name="RoleC_id_seq", sequenceName="RoleC_id_seq", allocationSize=1)
	    private Long id;

	    @Column(length = 32, unique = true)
	    // the optional @Column allows us makes sure that the name is limited to a suitable size and is unique
	    private String name;

	    public void setId(long id) {
	        this.id = id;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
}
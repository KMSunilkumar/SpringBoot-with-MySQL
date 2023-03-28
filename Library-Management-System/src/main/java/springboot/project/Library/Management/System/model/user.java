package springboot.project.Library.Management.System.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sunil_user")
public class user {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
     private int id;
	
	@column(name ="first_name", nullable= false)
     private String firstName;
	
	@column(name = "last_name")
     private String lastname;
	
	@column(name = "email")
     private String email;
	
}

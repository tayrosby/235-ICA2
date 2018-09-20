package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {
	@NotNull(message = "NO")
	@Size(min=3, max=15)
	String firstname = "";
	
	@NotNull(message = "NO")
	@Size(min=3, max=15)
	String lastname = "";
	
	public User() {
		
		firstname = "Tay";
		lastname = "Austin";
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}

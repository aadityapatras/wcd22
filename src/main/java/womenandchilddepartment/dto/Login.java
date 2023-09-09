package womenandchilddepartment.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Login {
	@Range(min=1, max=3, message="id must not be more than 4 digits")
	private int lid;

	@NotNull(message="username should not be null!!")
	@Size(max=50, message="username must not be more than 50 words")
	private String username;
	
	@NotNull(message="password should not be null!!")
	@Size(min=8, message="password must not be more than 10 words")
	private String password;

	public Login(@Range(min = 1, max = 3, message = "id must not be more than 4 digits") int lid,
			@NotNull(message = "username should not be null!!") @Size(max = 50, message = "username must not be more than 50 words") String username,
			@NotNull(message = "password should not be null!!") @Size(min = 8, message = "password must not be more than 10 words") String password) {
		super();
		this.lid = lid;
		this.username = username;
		this.password = password;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

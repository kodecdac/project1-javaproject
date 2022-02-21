package in.cdac;

import java.util.Objects;

public class User {

	private Long id;
	private String username;
	private String email;
	private String mobile;
	private String gender;

	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public User() {
		super();
	}
	
	

	public User(Long id, String username, String email, String mobile) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	@Override
	public int hashCode() {
		return Objects.hash(email, id, mobile, username);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(username, other.username);
	}

	
	
	
}

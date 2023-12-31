package womenandchilddepartment.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
@Entity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class User implements UserDetails{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String userConfId;
	private String tenthRollNumber;
	
	
	private String yearOfPassingTenth;
	private String name;
	//@Column(unique=true)
	
	private String email;
	
	private String password;
	
	private String father_Name;
	
	
	private String educatinal_Qualification;

	private Date dateOfBirth;
	
	private String category;
	
	private String address;
	
	private String gender;
	private String picture;
	
	private String mobileNo;
	private String technical_professionalQualification;
	
	 @Enumerated(EnumType.STRING)
	    private Role role;

	public String getUserConfId() {
		return userConfId;
	}

	public void setUserConfId(String userConfId) {
		this.userConfId = userConfId;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String userConfId, String tenthRollNumber, String yearOfPassingTenth, String name, String email, String password, String father_Name, String educatinal_Qualification, Date dateOfBirth, String category, String address, String gender, String picture, String mobileNo, String technical_professionalQualification, Role role) {
		this.uid = uid;
		this.userConfId = userConfId;
		this.tenthRollNumber = tenthRollNumber;
		this.yearOfPassingTenth = yearOfPassingTenth;
		this.name = name;
		this.email = email;
		this.password = password;
		this.father_Name = father_Name;
		this.educatinal_Qualification = educatinal_Qualification;
		this.dateOfBirth = dateOfBirth;
		this.category = category;
		this.address = address;
		this.gender = gender;
		this.picture = picture;
		this.mobileNo = mobileNo;
		this.technical_professionalQualification = technical_professionalQualification;
		this.role = role;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTenthRollNumber() {
		return tenthRollNumber;
	}

	public void setTenthRollNumber(String tenthRollNumber) {
		this.tenthRollNumber = tenthRollNumber;
	}

	public String getYearOfPassingTenth() {
		return yearOfPassingTenth;
	}

	public void setYearOfPassingTenth(String yearOfPassingTenth) {
		this.yearOfPassingTenth = yearOfPassingTenth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFather_Name() {
		return father_Name;
	}

	public void setFather_Name(String father_Name) {
		this.father_Name = father_Name;
	}

	public String getEducatinal_Qualification() {
		return educatinal_Qualification;
	}

	public void setEducatinal_Qualification(String educatinal_Qualification) {
		this.educatinal_Qualification = educatinal_Qualification;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo)






	{
		this.mobileNo = mobileNo;
	}

	public String getTechnical_professionalQualification() {
		return technical_professionalQualification;
	}

	public void setTechnical_professionalQualification(String technical_professionalQualification) {
		this.technical_professionalQualification = technical_professionalQualification;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
//				SimpleGrantedAuthority simpleGrantedAuthority=  new SimpleGrantedAuthority(role.toString());
	        String roleName = "ROLE_" + role.toString();
	        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(roleName);

	        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new java.util.ArrayList<>();
	        simpleGrantedAuthorities.add(simpleGrantedAuthority);
	        return simpleGrantedAuthorities;
//				return authorities;
	    }
	    @Override
	    public String getUsername() {
	        // TODO Auto-generated method stub
	        return email;
	    }
	    @Override
	    public boolean isAccountNonExpired() {
	        // TODO Auto-generated method stub
	        return true;
	    }
	    @Override
	    public boolean isAccountNonLocked() {
	        // TODO Auto-generated method stub
	        return true;
	    }
	    @Override
	    public boolean isCredentialsNonExpired() {
	        // TODO Auto-generated method stub
	        return true;
	    }
	    @Override
	    public boolean isEnabled() {
	        // TODO Auto-generated method stub
	        return true;
	    }
	    @Override
	    public String toString() {
	        return "User [id=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
	                + role + "]";
	    }

	 
}
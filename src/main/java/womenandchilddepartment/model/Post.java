package womenandchilddepartment.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="post")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postCode;
	private String postName;
	private String qualification;
	private int experienceRequired;
	private String ageCriteria;
	private Date openDate;
	private Date closeDate;
	
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Advertisement advertisement;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "ID")
    private Advertisement advertisement;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Post(int postCode, String postName, String qualification, int experienceRequired, String ageCriteria,
			Date openDate, Date closeDate, Advertisement advertisement) {
		super();
		this.postCode = postCode;
		this.postName = postName;
		this.qualification = qualification;
		this.experienceRequired = experienceRequired;
		this.ageCriteria = ageCriteria;
		this.openDate = openDate;
		this.closeDate = closeDate;
		this.advertisement = advertisement;
	}


	public int getPostCode() {
		return postCode;
	}


	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}


	public String getPostName() {
		return postName;
	}


	public void setPostName(String postName) {
		this.postName = postName;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public int getExperienceRequired() {
		return experienceRequired;
	}


	public void setExperienceRequired(int experienceRequired) {
		this.experienceRequired = experienceRequired;
	}


	public String getAgeCriteria() {
		return ageCriteria;
	}


	public void setAgeCriteria(String ageCriteria) {
		this.ageCriteria = ageCriteria;
	}


	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	public Date getCloseDate() {
		return closeDate;
	}


	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}


	public Advertisement getAdvertisement() {
		return advertisement;
	}


	public void setAdvertisement(Advertisement id) {
		this.advertisement = id;
	}
	
	
}

	

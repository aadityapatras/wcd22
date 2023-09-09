package womenandchilddepartment.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class AdvertisementDto {
	private int id;
	private int advertisementNo;

	public AdvertisementDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdvertisementDto(int advertisementNo) {
		super();
		this.advertisementNo = advertisementNo;
	}

	public int getAdvertisementNo() {
		return advertisementNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAdvertisementNo(int advertisementNo) {
		this.advertisementNo = advertisementNo;
	}
	
//	private List<PostDto> postDto;

}

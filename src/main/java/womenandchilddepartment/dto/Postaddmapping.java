package womenandchilddepartment.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import womenandchilddepartment.model.Advertisement;
import womenandchilddepartment.repo.AdvertisementRepo;

@Component
public class Postaddmapping {
	@Autowired
	private AdvertisementRepo  advertisementRepo;
	
	
  public PostDto checkCityDto(PostDto postDtoCheck)
{
	int count=postDtoCheck.getAdvertisement().getAdvertisementNo();

	List<Advertisement> findAll = advertisementRepo.findAll();
	for(Advertisement country:findAll)
	{
		int advertisementNo = country.getAdvertisementNo();
		if(count==advertisementNo)
		{
			postDtoCheck.setAdvertisement(country);
		break;
		}
	}
	return postDtoCheck;}
}


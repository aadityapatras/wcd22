package womenandchilddepartment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import womenandchilddepartment.dto.AdvertisementDto;
import womenandchilddepartment.dto.PostDto;


public interface AdvertisementService {
	AdvertisementDto createAdvertisementData(AdvertisementDto advertisementDto);
	List<AdvertisementDto> getAllAddv();
}

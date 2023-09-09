package womenandchilddepartment.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import womenandchilddepartment.dto.AdvertisementDto;
import womenandchilddepartment.dto.PostDto;
import womenandchilddepartment.model.Advertisement;
import womenandchilddepartment.model.Post;
import womenandchilddepartment.repo.AdvertisementRepo;
import womenandchilddepartment.service.AdvertisementService;

@Service
public class AdvertisementServiceImpl implements AdvertisementService{

	@Autowired
	private AdvertisementRepo advertisementRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public AdvertisementDto createAdvertisementData(AdvertisementDto advertisementDto) {
		Advertisement map = modelMapper.map(advertisementDto, Advertisement.class);
		Advertisement save = advertisementRepo.save(map);
		return modelMapper.map(save, AdvertisementDto.class);
	}
	@Override
	public List<AdvertisementDto> getAllAddv() {
			List<Advertisement> userst = advertisementRepo.findAll();
			List<AdvertisementDto> collect = userst.stream().map((advertisement)->modelMapper.map(advertisement, AdvertisementDto.class)).collect(Collectors.toList());
		return collect;
	}

}

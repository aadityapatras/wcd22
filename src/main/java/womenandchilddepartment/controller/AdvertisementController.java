package womenandchilddepartment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import womenandchilddepartment.dto.AdvertisementDto;
import womenandchilddepartment.dto.PostDto;
import womenandchilddepartment.service.AdvertisementService;

@RestController
@RequestMapping("/advertisements")
public class AdvertisementController {
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@PostMapping(value="/aaAdver")
	public AdvertisementDto createAdvertisementData(@RequestBody AdvertisementDto advertisementDto)
	{
		return advertisementService.createAdvertisementData(advertisementDto);
	}
	@GetMapping(value="/allAdver")
	public List<AdvertisementDto> getAllAddv()
	{
		return advertisementService.getAllAddv();
	}
}

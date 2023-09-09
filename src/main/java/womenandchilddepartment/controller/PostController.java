package womenandchilddepartment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import womenandchilddepartment.dto.PostDto;
import womenandchilddepartment.dto.Postaddmapping;
import womenandchilddepartment.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService postService;

	@Autowired
		private Postaddmapping postaddmapping;
	
	@PostMapping("/addPost")
	public PostDto createCityData(@RequestBody PostDto cityDto)
	{    postaddmapping.checkCityDto(cityDto);
		return postService.createPostData(cityDto);
	}
	@GetMapping(value="/allpost")
	public List<PostDto> getAllPost()
	{
		return postService.getAllPost();
	}
}

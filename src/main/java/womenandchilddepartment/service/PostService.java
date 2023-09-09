package womenandchilddepartment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import womenandchilddepartment.dto.PostDto;


public interface PostService {
	PostDto createPostData(PostDto postDto);
	PostDto updatePost(PostDto postDto, Integer postCode);
	PostDto getPostByPostName(Integer postCode);
	List<PostDto> getAllPost();
	void deletePostByCode(Integer postCode);
}

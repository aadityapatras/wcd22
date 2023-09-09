package womenandchilddepartment.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import womenandchilddepartment.dto.Login;
import womenandchilddepartment.dto.UserDto;
import womenandchilddepartment.service.FileService;
import womenandchilddepartment.service.UsersService;

@RestController
@RequestMapping("/user")

public class UserController {
@Autowired
private UsersService usersService;

//@Autowired
//private FileService fileService;
//
//@Value("${project.image}")
//private String path;

@PostMapping(value="/users/create")
public String createUserData(@Valid @RequestBody UserDto userDto) throws IOException
{
//	UsersDto usersDto= this.usersService.getUserById(userId);
//	String fileName=fileService.uploadImage(path, image);
//	
//	usersDto.setPicture(fileName);
//	UsersDto updateUser = usersService.updateUser(usersDto, userId);
//	return updateUser;
	return usersService.createUserData(userDto);
}
//@PostMapping("/login")
//public String login(@RequestBody Login login)
//{
//	String msg=this.usersService.login(login);
//	return msg;
//}
@PutMapping("/updateInfo/{userId}")
public UserDto updateUser(@RequestBody UserDto usersDto, @PathVariable Integer userId)
{
	return usersService.updateUser(usersDto, userId);
}
@GetMapping("/getInfo/{userId}")
public UserDto getUserById(@PathVariable Integer userId)
{
	return usersService.getUserById(userId);
}
@GetMapping("/getInfo/allUsers")
public 	List<UserDto> getAllUser()
{
	return usersService.getAllUser();
}
@DeleteMapping("/deleteUser/{userId}")
void deleteUserId(@PathVariable Integer userId)
{
	usersService.deleteUserId(userId);	
}


//@PostMapping("/image/{userId}")
//public UserDto uploadPicture(@RequestParam("image") MultipartFile image, @RequestParam("pdf") MultipartFile pdf, @PathVariable Integer userId) throws Exception
//{
//	UserDto usersDto= this.usersService.getUserById(userId);
//	String fileName=fileService.uploadImage(path, image);
//	String uploadImage = fileService.uploadImage(path, pdf);
//	usersDto.setPicture(fileName);
//	usersDto.setFather_Name(uploadImage);
//	UserDto updateUser = usersService.updateUser(usersDto, userId);
//	return updateUser;
//}
//
//@GetMapping(value="/post/image/{imageName}", produces=MediaType.IMAGE_JPEG_VALUE)
//public void downloadImage(@PathVariable("imageName")String imageName, HttpServletResponse response) throws Exception
//{
//	InputStream resource=fileService.getResource(imageName, path);
//	response.setContentType(MediaType.IMAGE_JPEG_VALUE);
//	StreamUtils.copy(resource, response.getOutputStream());
//}
}
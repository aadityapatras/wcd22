package womenandchilddepartment.service;

import java.util.List;

import womenandchilddepartment.dto.Login;
import womenandchilddepartment.dto.UserDto;


public interface UsersService {
	String createUserData(UserDto userDto);
   	String login(Login login);
	UserDto updateUser(UserDto usersDto, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUser();
	void deleteUserId(Integer userId);

}

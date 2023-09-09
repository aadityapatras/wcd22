package womenandchilddepartment.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import womenandchilddepartment.dto.Login;
import womenandchilddepartment.dto.UserDto;
import womenandchilddepartment.exception.ResourceNotFoundException;
import womenandchilddepartment.model.User;
import womenandchilddepartment.repo.UserRepo;
import womenandchilddepartment.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UserRepo usersRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String createUserData(UserDto userDto) {


		String encode = passwordEncoder.encode(userDto.getPassword());
		userDto.setPassword(encode);
		String userId1= userDto.getName()+userDto.getTenthRollNumber();

		User user=modelMapper.map(userDto, User.class);
		user.setUserConfId(userId1);
		User savedUser=usersRepo.save(user);
		 modelMapper.map(savedUser, UserDto.class);
//		String userId= user.getName()+user.getTenthRollNumber();
		 return userId1;
  	}

	@Override
	public UserDto updateUser(UserDto usersDto, Integer userId) {
		User users=usersRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "user", userId));
//				users.setEmail(usersDto.getEmailId())
users.setEmail(usersDto.getEmail());
users.setPassword(usersDto.getPassword());
users.setName(usersDto.getName());
users.setPicture(usersDto.getPicture());
users.setFather_Name(usersDto.getFather_Name());
		User updatedUser=usersRepo.save(users);
		UserDto usertech=modelMapper.map(updatedUser, UserDto.class);
		return usertech;
		}

	@Override
	public UserDto getUserById(Integer userId) {
			 
				User users=usersRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "user", userId));
				return modelMapper.map(users, UserDto.class);
	}
	
	@Override
	public List<UserDto> getAllUser() {
		List<User> userst = usersRepo.findAll();
		List<UserDto> collect = userst.stream().map((user)->modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
		return collect;
	}

	@Override
	public void deleteUserId(Integer userId) {
		User users = usersRepo.findById(userId).orElseThrow(()->(new ResourceNotFoundException("User", "user", userId)));
		usersRepo.delete(users);
		
	}
	

	@Override
	public String login(Login login)
	{
		User user=this.usersRepo.findOneByIgnoreCaseNameAndPassword(login.getUsername(), login.getPassword());
		
		if(user==null)
		{
			return "Not Logged in";
		}
		else
		{
			return "Logged in";
		}
	}



}

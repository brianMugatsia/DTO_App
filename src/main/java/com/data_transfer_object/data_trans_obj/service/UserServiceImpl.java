package com.data_transfer_object.data_trans_obj.service;

import org.modelmapper.ModelMapper;
import com.data_transfer_object.data_trans_obj.repository.UserRepository;
import com.data_transfer_object.data_trans_obj.entity.User;
import com.data_transfer_object.data_trans_obj.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User createUser(User user) {
        User userSavedToDB = this.userRepository.save(user);
        return userSavedToDB;
    }

    @Override
    public UserDto getUser(int userId) {
        User user = this.userRepository.findById(userId).get();
        UserDto userDto = this.modelMapper.map(user, UserDto.class);
        return userDto;
    }
}

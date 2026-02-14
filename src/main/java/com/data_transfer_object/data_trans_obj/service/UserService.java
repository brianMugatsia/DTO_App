package com.data_transfer_object.data_trans_obj.service;

import com.data_transfer_object.data_trans_obj.entity.User;
import com.data_transfer_object.data_trans_obj.dto.UserDto;

public interface UserService {
    public User createUser(User user);

    public UserDto getUser(int userId);
}

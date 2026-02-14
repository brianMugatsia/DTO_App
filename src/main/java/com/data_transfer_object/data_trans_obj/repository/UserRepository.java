package com.data_transfer_object.data_trans_obj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.data_transfer_object.data_trans_obj.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

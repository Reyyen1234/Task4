package com.reyyencuneyt.task4.Service;

import com.reyyencuneyt.task4.Entity.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface IUserService {

    public UserEntity AddUser(UserEntity  user);

    public ResponseEntity<UserEntity > getUserById(long userId);

    public ResponseEntity<UserEntity > updateUser(UserEntity  user);

    ResponseEntity<Map<String,Boolean>> deleteUser(long userId);

    public List<UserEntity > getAllUser();

}

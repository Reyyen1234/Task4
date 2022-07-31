package com.reyyencuneyt.task4.Service;

import com.reyyencuneyt.task4.Entity.UserEntity;
import com.reyyencuneyt.task4.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public UserEntity AddUser(UserEntity user) {
        if (!user.getEmail().contains("@")) {
            return null;
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public ResponseEntity<UserEntity> getUserById(long userId) {
        UserEntity user = (UserEntity) entityManager
                .createNamedQuery("User.findById")
                .setParameter("userId",userId)
                .getSingleResult();
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<UserEntity> updateUser(UserEntity user) {
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteUser(long userId) {
        userRepository.deleteById(userId);
        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @Override
    public List<UserEntity> getAllUser() {
        List<UserEntity> list= (List<UserEntity>) entityManager.createNamedQuery("User.findAll").getResultList();
        return list;
    }
}

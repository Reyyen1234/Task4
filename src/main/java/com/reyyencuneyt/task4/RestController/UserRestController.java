package com.reyyencuneyt.task4.RestController;

import com.reyyencuneyt.task4.Entity.UserEntity;
import com.reyyencuneyt.task4.Exception.ResourceNotFoundException;
import com.reyyencuneyt.task4.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin //projeler birbirile haberlesmesi icin kullaniyoruz
@RequestMapping("/api/v1")//v1: version one demek oluyor versionler ile yaziyoruz apileri
public class UserRestController {
    @Autowired
    IUserRepository repository;

    //SAVE
    //http://localhost:8080/api/v1/post
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<UserEntity> getPost(@RequestBody UserEntity userEntity){//karsi tarafta user entity gelecek
        repository.save(userEntity);
        return ResponseEntity.ok(userEntity);
    }

    //Update
    //http://localhost:8080/api/v1/put
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Void> getPut(@RequestBody UserEntity userEntity){
        repository.save(userEntity);
        return ResponseEntity.ok().build();
    }
    //Delete
    //http://localhost:8080/api/v1/delete
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> getDelete(@PathVariable(name="id") Long id){
        UserEntity userEntity=repository.findById(id).orElseThrow(()->new ResourceNotFoundException(id + "user id bulunmadi"));
        repository.delete(userEntity);
        return ResponseEntity.ok().build();
    }


    //FIND
    //http://localhost:8080/api/v1/get/4 //dort numarli bize getir
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> getUser(@PathVariable(name="id") Long id){
        UserEntity userEntity=repository.findById(id).orElseThrow(()->new ResourceNotFoundException(id + "user id bulunmadi"));
        //orElseThrow: java8 ile birabir gelen optional yapilar kullanmamiz sepebi eger burada bir hata var ise bana goster
        return ResponseEntity.ok(userEntity);
    }
    //LIST
    //http://localhost:8080/api/v1/list
    @GetMapping("/list")
    public ResponseEntity<List<UserEntity>> getList(){
        List<UserEntity> entityList=repository.findAll();
        return ResponseEntity.ok(entityList);
    }
}

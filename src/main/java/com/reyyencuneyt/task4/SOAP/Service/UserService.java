package com.reyyencuneyt.task4.SOAP.Service;

import com.reyyencuneyt.task4.SOAP.UserInXml;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static final Map<String, UserInXml> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        UserInXml user1 = new UserInXml();
        user1.setName("reyyen");
        user1.setEmail("1111");
        user1.setPassword("12000");
        users.put(user1.getName(), user1);

    }


    public UserInXml getUsers(String name) {
        return users.get(name);
    }
}

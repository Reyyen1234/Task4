package com.reyyencuneyt.task4.SpringBootSoap.EndPoint;

import com.reyyencuneyt.task4.SOAP.GetUserRequest;
import com.reyyencuneyt.task4.SOAP.GetUserResponse;
import com.reyyencuneyt.task4.SOAP.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

public class UserEndPoint {
    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = "http://com.reyyencuneyt.task4/SOAP",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}

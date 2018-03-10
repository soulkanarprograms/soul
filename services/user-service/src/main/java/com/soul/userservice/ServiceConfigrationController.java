package com.soul.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceConfigrationController {

    @Autowired
    private ServiceConfiguration userServiceConfiguration;

    @RequestMapping("/config")
    public String hi() {
        StringBuilder sb = new StringBuilder();

        sb.append("hi ");
        sb.append(userServiceConfiguration.getProjectName() + ".");
        sb.append(userServiceConfiguration.getServiceName() + " from ");
        sb.append(userServiceConfiguration.getEnvironment() + " property:");
        sb.append(userServiceConfiguration.getProperty());

        return sb.toString();
    }
}

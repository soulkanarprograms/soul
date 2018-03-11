package com.soul.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceConfigurationController {

    @Autowired
    private ServiceConfiguration serviceConfiguration;

    @RequestMapping("/config")
    public String hi() {
        StringBuilder sb = new StringBuilder();

        sb.append("hi ");
        sb.append(serviceConfiguration.getProjectName() + ".");
        sb.append(serviceConfiguration.getServiceName() + " from ");
        sb.append(serviceConfiguration.getEnvironment() + " property:");
        sb.append(serviceConfiguration.getProperty());

        return sb.toString();
    }
}

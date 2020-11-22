package org.cloudpractice.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    private static String APP_NAME = "ACCOUNTSERVICE";
    @Autowired
    private RestTemplate restTemplate; //first way, access through RestTemplate

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/getOrder")
    public String getOrder(){
        //2nd parameter means https or not
        InstanceInfo accountService = eurekaClient.getNextServerFromEureka(APP_NAME, false);
        String url = accountService.getHomePageUrl();

        //need to specific url to /getAccountName
        String accountName = restTemplate.getForObject(url + "/getAccountName", String.class);
        return "order created for " + accountName;
    }
}

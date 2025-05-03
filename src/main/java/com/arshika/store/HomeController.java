package com.arshika.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //how values are taken from the application.properties
    @Value("${spring.application.name}")
    private String appName;
    //method, now we want that method is called when root directory calls
   @RequestMapping("/")
    public String index() {
       System.out.println("appName" + appName);
        return "index.html";
    }



}

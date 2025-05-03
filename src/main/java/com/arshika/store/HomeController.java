package com.arshika.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //method, now we want that method is called when root directory calls
   @RequestMapping("/")
    public String index() {
        return "index.html";
    }

}

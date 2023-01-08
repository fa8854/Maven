package my.ovsyannicov.mavendo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String appStart(){
        return "Приложение запущенно";
    }

    @GetMapping
    public String appStart(""){
        return "Приложение запущенно";
    }
}

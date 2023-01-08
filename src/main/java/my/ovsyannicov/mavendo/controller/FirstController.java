package my.ovsyannicov.mavendo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String appStart(){
        return "Приложение запущенно";
    }

    @GetMapping("/info")
    public String appInfo(){
        return "Имя учиника : Денис " +
                " ,название вашего проекта : MavenDO " +
                " ,дата создания : 08.01.2023  " +
                " ,описание проекта в свободной форме : Домашнее задание по Maven";
    }
}

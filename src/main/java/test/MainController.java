package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Maksym_Hromyk on 08.08.2017.
 */
@RestController
public class MainController {

    @RequestMapping(value="/getPerson")
    public String getPerson(@RequestParam(value="name", defaultValue = "Maksym") String name){
        Person person = new Person(name);
        return person.toString();
    }



}

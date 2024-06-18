package mangosteen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello Controller
 */
@RestController
public class HelloController {
    /**
     * Say Hello API
     *
     * @param name
     * @param id
     * @return
     */
    //http://localhost:8080/v1.0/hello/s/1112
    @GetMapping("v1.0/hello/{name}/{id}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("id") Long id) {
        return String.format("Hello, %s,%d!", name, id);
    }

    //http://localhost:8080/v1.0/greet?name=shenxin&id=1111
    @GetMapping("v1.0/greet")
    public String sayHello2(@RequestParam("name") String name, @RequestParam("id") Long id) {
        return String.format("Hello, %s,%d!", name, id);
    }
}

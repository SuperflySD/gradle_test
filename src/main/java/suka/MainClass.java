package suka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        System.out.println("Smth");
        Logger logger = LoggerFactory.getLogger(MainClass.class);
        logger.info("Hello World");
        SpringApplication.run(MainClass.class, args);
    }


    @RequestMapping(value = {"/", "/main", "/result", "/compare"}, method = RequestMethod.GET)
    public String comtr() {
        return "bootApplication \n";
    }

}

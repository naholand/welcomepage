package iss.welcomepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class WelcomepageApplication {
    public static void main(String[] args) {
        SpringApplication.run(WelcomepageApplication.class, args);
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome()
    {
        return "Welcome";
    }

}

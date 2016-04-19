package ua.skarb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.ParseException;

@SpringBootApplication
public class WebUserCabinetApplication {

    public static void main(String[] args) throws ParseException {
        ApplicationContext ctx = SpringApplication.run(WebUserCabinetApplication.class, args);
    }
}

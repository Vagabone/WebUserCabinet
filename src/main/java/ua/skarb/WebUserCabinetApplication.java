package ua.skarb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class WebUserCabinetApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WebUserCabinetApplication.class, args);
    }
}

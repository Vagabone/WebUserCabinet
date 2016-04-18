package ua.skarb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import ua.skarb.domain.TecCallView;
import ua.skarb.domain.TecCallViewRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class WebUserCabinetApplication {

    @Autowired
    private TecCallViewRepository repo;

    public static void main(String[] args) throws ParseException {
        ApplicationContext ctx = SpringApplication.run(WebUserCabinetApplication.class, args);
    }
}

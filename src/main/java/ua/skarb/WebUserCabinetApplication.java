package ua.skarb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ua.skarb.domain.FirmRepository;

import java.text.ParseException;

@SpringBootApplication
public class WebUserCabinetApplication {

    public static void main(String[] args) throws ParseException {
        ApplicationContext ctx = SpringApplication.run(WebUserCabinetApplication.class, args);

/*        FirmRepository repository =(FirmRepository) ctx.getBean("firmRepository");
        System.out.println(repository.findOne(3077));*/
    }


}

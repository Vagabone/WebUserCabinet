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
/*        for(String bean:ctx.getBeanDefinitionNames()){
            System.out.println(bean);
        }*/
        TecCallViewRepository repo = (TecCallViewRepository) ctx.getBean("tecCallViewRepository");
        //System.out.println(repo.findOne(34921).toString());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        List<TecCallView> rez = repo.findByLicenceIdAndCallCreateDateBetween(2962, sdf.parse("01-01-2016"), sdf.parse("01-04-2016"));
        rez.forEach(System.out::println);
    }
}

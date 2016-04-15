package ua.skarb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import ua.skarb.domain.TecCallViewRepository;

import java.util.Arrays;

@SpringBootApplication
public class WebUserCabinetApplication {

    @Autowired
    private TecCallViewRepository repo;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WebUserCabinetApplication.class, args);
/*        for(String bean:ctx.getBeanDefinitionNames()){
            System.out.println(bean);
        }*/
        TecCallViewRepository repo = (TecCallViewRepository) ctx.getBean("tecCallViewRepository");
        System.out.println(repo.findOne(34921).toString());
    }
}

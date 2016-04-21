package ua.skarb.config;

import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;

import java.util.Arrays;
import java.util.TreeSet;


//@Configuration
public class ConfigBeans {

    //@Bean
    SpringTemplateEngine springTemplateEngine() {
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        SpringSecurityDialect springSecurityDialect = new SpringSecurityDialect();
        springTemplateEngine.setAdditionalDialects(new TreeSet<IDialect>(Arrays.asList(springSecurityDialect)));
        return springTemplateEngine;
    }

}

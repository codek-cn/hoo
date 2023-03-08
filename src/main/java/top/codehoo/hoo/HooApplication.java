package top.codehoo.hoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import top.codehoo.hoo.config.projectProperties.GlobalProperties;

@SpringBootApplication
@EnableConfigurationProperties(GlobalProperties.class)
public class HooApplication {

    public static void main(String[] args) {
        SpringApplication.run(HooApplication.class, args);
    }

}

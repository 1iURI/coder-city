package win.liuri.coder_center.common_service_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lemonsoft on 17/7/11.
 */
@EnableEurekaServer
@SpringBootApplication
public class App {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(App.class)
                .web(true).run(args);
    }

}

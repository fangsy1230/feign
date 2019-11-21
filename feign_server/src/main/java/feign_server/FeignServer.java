package feign_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages="feign_server")
public class FeignServer {
	public static void main( String[] args )
    {
    	System.out.println("I am feign server");
    	SpringApplication.run(FeignServer.class, args);
    }

}

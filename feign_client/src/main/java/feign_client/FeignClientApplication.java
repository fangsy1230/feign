package feign_client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages="feign_client")
@ComponentScan(basePackages="feign_client")
public class FeignClientApplication {
	
	public static void main( String[] args )
    {
    	System.out.println("I am feign client");
    	SpringApplication.run(FeignClientApplication.class, args);
    }


}

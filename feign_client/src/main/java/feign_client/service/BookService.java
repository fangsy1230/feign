package feign_client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//fallback是服务降级后的接口实现类。
@FeignClient(name = "feign-server",fallback=BookFallBack.class)
public interface BookService {
	
	@RequestMapping("/book")
	public String getBook();
	
	

}

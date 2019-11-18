package feign_client.service;

import org.springframework.stereotype.Component;

@Component
public class BookFallBack implements BookService{

	public String getBook() {
		return "get error";
	}

}

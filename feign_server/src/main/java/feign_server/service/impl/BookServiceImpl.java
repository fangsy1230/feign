package feign_server.service.impl;

import org.springframework.stereotype.Service;

import feign_server.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	public String getBook() {
		return "Hello!";
	}

}

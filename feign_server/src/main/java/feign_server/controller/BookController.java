package feign_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign_server.service.BookService;



@RestController
public class BookController {
	
	@Autowired
    BookService bookService;

    @RequestMapping("/book")
    public String book(){
        return bookService.getBook();
    }

}

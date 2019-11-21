package feign_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign_client.service.BookService;



@RestController
public class BookController {
	
	@Autowired
    BookService bookService;

    @RequestMapping("/selectbook")
    public String book(){
        return bookService.getBook();
    }

	

}

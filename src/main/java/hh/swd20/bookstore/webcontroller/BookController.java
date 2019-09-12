package hh.swd20.bookstore.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.swd20.bookstore.domain.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookrepository;
	
	@GetMapping("/index")
	public String showIndexPage() {
		return "index";
	}
	
	@GetMapping("/booklist")
	public String showBooklist(Model m) {
		m.addAttribute("books", bookrepository.findAll());
		return "booklist";
	}

}

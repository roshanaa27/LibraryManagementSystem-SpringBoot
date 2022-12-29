package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/updatelibbook/{bookId}")
public class updatelibrary {
 @Autowired repository rep;
 @PostMapping()
 public String updatevalue(@RequestBody Mainlibrary a,@PathVariable("bookId") int bookId)
 {
	 int bookid=a.getBookId();
	 int quantity=a.getQuantity();
	 String bookname=a.getBookName();
	 String genre=a.getGenre();
	 rep.updatevalue(bookid,quantity,bookname,genre,bookId);
	 return "Data Updated Successfully";
 }
}

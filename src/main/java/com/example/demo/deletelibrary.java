
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/delete/{bookid}")
public class deletelibrary {
@Autowired repository rep;
@PostMapping()
public String delete(@PathVariable("bookid")int bookid)
{
	rep.deleteAllByIdInBatch(bookid);
	return "Data deleted successfully";
}
}

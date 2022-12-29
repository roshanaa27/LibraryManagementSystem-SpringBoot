
package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Maincontroller {

@Autowired Mainservice mc;
@PostMapping("/save")
private void saves(@RequestBody Mainlibrary library)
{
	mc.savebook(library);
} 
@GetMapping("/getBooks")
private List<Mainlibrary> getAllBooks()
{
	return mc.getAllBooks();
}
}

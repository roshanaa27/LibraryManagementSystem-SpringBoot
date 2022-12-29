
package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mainservice {
@Autowired repository rep;
Mainlibrary a = new Mainlibrary();
public void savebook(Mainlibrary library)
{
rep.save(library);
}
public List<Mainlibrary> getAllBooks()
{
	List<Mainlibrary> books=new ArrayList<Mainlibrary>();
	rep.findAll().forEach(books1->books.add(books1));
	return books;
}
}

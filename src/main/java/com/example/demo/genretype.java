package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/genretyp/{genre}")
public class genretype {
@Autowired repository rep;
@GetMapping()
public List<Mainlibrary> genredata(@PathVariable("genre") String genre)
{
	return rep.findbygenre(genre);
}
}

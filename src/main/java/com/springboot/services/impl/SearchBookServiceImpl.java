package com.springboot.services.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.Book;
import com.springboot.repositories.BookRepository;
import com.springboot.services.SearchBookService;

@Service
public class SearchBookServiceImpl implements SearchBookService 
{
	@Autowired private BookRepository repo;

	public List<Book> getList(int bookid) 
	{
		return repo.findByBookid(bookid);
	}
	public List<Book> getListByAuthor(String author) 
	{
		return repo.findByAuthor(author);
	}
	public List<Book> getListByTitle(String title) 
	{
		return repo.findByTitle(title);
	}
	public List<Book> getListByCatgory(int catid) 
	{
		return repo.findByCatid(catid);
	}
	public List<Book> getListByPublisher(int pubid) 
	{
		return repo.findByPubid(pubid);
	}
}

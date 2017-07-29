package com.kk.rest;
 
import org.glassfish.jersey.server.JSONP;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

	@GET
	@Path("/b/{id}")
	@Consumes({"application/javascript","application/json"})
	@JSONP(queryParam="callback")
	public Book getBookById(@PathParam("id") Long id){
		Book book = new Book();
		book.setBookId(id);
		book.setBookName("Python源码剖析");
		book.setPublisher("电子工业出版社电子工业出版社电子工业出版社");
		return book;
	}

	@GET
	@Path("/a/{id}")
	@Consumes({"application/javascript","application/json"})
	@JSONP(queryParam="callback")
	public Book getBookById1(@PathParam("id") Long id){
		Book book = new Book();
		book.setBookId(id);
		book.setBookName("Pythoxxxxxxxxxx");
		book.setPublisher("xsdfoasjfoasjfdoajsfdoajsofddjsoifzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		return book;
	}

	@GET
	@Path("/c/{id}")
	@Consumes({"application/javascript","application/json"})
	public Book getBookById2(@PathParam("id") Long id){
		Book book = new Book();
		book.setBookId(id);
		book.setBookName("Pythoxxxxxxxxxx");
		book.setPublisher("xsdfoasjfoasjfdoajsfdoajsofddjsoifzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		return book;
	}

	//callback({"bookId":2,"bookName":"Python源码剖析","publisher":"电子工业出版社",
	// "isbn":"911122","publishTime":1500953117679,"hello":null})
	public static class Book{
		private Long bookId;
		String bookName;
		String publisher;

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public Long getBookId() {
			return bookId;
		}

		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
	}
 
}
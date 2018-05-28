package com.tcs.Demo.BDD.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Demo.BDD.Store;
import com.tcs.Demo.BDD.Model.Book;

import java.util.List;


@RestController
public class BookResource {

    @GetMapping("/books")
    public List<Book> getAllBooks(@RequestParam("count") int itemsCount) {
        return Store.getBooks(itemsCount);
    }

    @GetMapping("/search/books")
    public List<Book> getAllBooks(@RequestParam("name") String name) {
        return Store.searchBook(name);
    }


}

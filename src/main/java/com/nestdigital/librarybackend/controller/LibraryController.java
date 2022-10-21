package com.nestdigital.librarybackend.controller;

import com.nestdigital.librarybackend.dao.LibraryDao;
import com.nestdigital.librarybackend.model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addLibrary",consumes = "application/json",produces = "application/json")
    public String addLibrary(@RequestBody LibraryModel library){
        dao.save(library);
        return "{'status':'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewLibrary")
    public List<LibraryModel> viewFlight(){

        return (List<LibraryModel>) dao.findAll();
    }

    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteLibrary",consumes = "application/json",produces = "application/json")
    public String deleteLibrary(@RequestBody LibraryModel library){
        dao.deleteValue(library.getId());
        return "{'status':'success'}";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchLibrary")
    public List<LibraryModel> searchBook(@RequestBody LibraryModel library){
        return (List<LibraryModel>) dao.searchBook(library.getBook_name());
    }

}

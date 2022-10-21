package com.nestdigital.librarybackend.dao;

import com.nestdigital.librarybackend.model.LibraryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `books` WHERE `id` = :id",nativeQuery = true)
    void deleteValue(Integer id);

    @Query(value = "SELECT * FROM `books` WHERE `book_name` = :name",nativeQuery = true)
    List<LibraryModel> searchBook(String name);

}

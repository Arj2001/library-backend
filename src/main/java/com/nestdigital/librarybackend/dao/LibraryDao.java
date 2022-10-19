package com.nestdigital.librarybackend.dao;

import com.nestdigital.librarybackend.model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
}

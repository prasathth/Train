package com.springboot.dbdemo;

import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student, Integer> {

}

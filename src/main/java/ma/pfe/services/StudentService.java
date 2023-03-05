package ma.pfe.services;

import ma.pfe.dots.StudentDto;
import ma.pfe.entites.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentDto create(StudentDto dto);
    StudentDto update(StudentDto dto);
    boolean delete(long id);
    List<StudentDto> readAll();
}

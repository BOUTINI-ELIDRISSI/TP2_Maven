package ma.pfe.services;

import ma.pfe.dots.CleDto;
import ma.pfe.dots.StudentDto;
import ma.pfe.entites.StudentEntity;

import java.util.List;

public interface StudentService {
    Long create(StudentDto dto);
    Long update(StudentDto dto);
    boolean delete(CleDto cleDto);
    List<StudentDto> readAll();

    StudentDto findById(CleDto cledto);
}

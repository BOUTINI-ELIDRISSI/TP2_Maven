package ma.pfe.repositories;

import ma.pfe.entites.StudentEntity;

import java.util.List;

public interface StudentReposritory {
    StudentEntity create(StudentEntity e);
    StudentEntity update(StudentEntity e);
    boolean delete(long id);
    List<StudentEntity> readAll();
}

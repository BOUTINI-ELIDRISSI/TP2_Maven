package ma.pfe.services;

import ma.pfe.dots.StudentDto;
import ma.pfe.entites.StudentEntity;
import ma.pfe.mapper.StudentMapper;
import ma.pfe.repositories.StudentReposritory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService{

    private static final Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    public StudentReposritory studentReposritory;
    public StudentMapper studentMapper;

    public StudentServiceImpl(StudentReposritory studentReposritory, StudentMapper studentMapper) {
        this.studentReposritory = studentReposritory;
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentDto create(StudentDto dto) {
        LOG.debug("start methode create");
        StudentDto result=studentMapper.convertToDto(studentReposritory.create(studentMapper.convertToEntity(dto)));
        LOG.debug("end methode create");
        return result;
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOG.debug("start methode update");
        StudentDto result=studentMapper.convertToDto(studentReposritory.update(studentMapper.convertToEntity(dto)));;
        LOG.debug("end methode update");
        return result;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start methode delete");
        boolean result=studentReposritory.delete(id);
        LOG.debug("end methode delete");
        return result;
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start methode readAll");
        List<StudentDto> lst=studentMapper.convertToDots(studentReposritory.readAll());
        LOG.debug("end methode readAll");
        return lst;
    }
}

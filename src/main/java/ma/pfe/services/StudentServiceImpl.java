package ma.pfe.services;

import ma.pfe.dots.CleDto;
import ma.pfe.dots.StudentDto;
import ma.pfe.mapper.StudentMapper;
import ma.pfe.repositories.StudentReposritory;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")

public class StudentServiceImpl implements StudentService{

    private static final Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    public StudentReposritory studentReposritory;
    public StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    public StudentServiceImpl(@Qualifier("repo1") StudentReposritory studentReposritory) {
        this.studentReposritory = studentReposritory;
    }

    @Override
    public Long create(StudentDto dto) {
        LOG.debug("start method create dto : {} ",dto);
        StudentDto result=studentMapper.convertToDto(studentReposritory.save(studentMapper.convertToEntity(dto)));
        return result.getCle().getCle();
    }

    @Override
    public Long update(StudentDto dto) {
        LOG.debug("start method update dto : {} ",dto);
        StudentDto result=studentMapper.convertToDto(studentReposritory.save(studentMapper.convertToEntity(dto)));;
        return result.getCle().getCle();
    }

    @Override
    public boolean delete(CleDto cleDto) {
        LOG.debug("start method delete cleDto : {}",cleDto);
        studentReposritory.deleteById(studentMapper.cleDtoToCleEntity(cleDto));
        return true;
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start methode readAll");
        return studentMapper.convertToDots(studentReposritory.findAll());
    }

    @Override
    public StudentDto findById(CleDto cledto) {
        LOG.debug("start methode findById  cledto : {}",cledto);
         return studentMapper.convertToDto(studentReposritory.findById(studentMapper.cleDtoToCleEntity(cledto)).orElse(null));
    }
}

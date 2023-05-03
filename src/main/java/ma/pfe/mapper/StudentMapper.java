package ma.pfe.mapper;

import ma.pfe.dots.CleDto;
import ma.pfe.dots.StudentDto;
import ma.pfe.entites.CleEntity;
import ma.pfe.entites.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface StudentMapper {

     StudentDto convertToDto(StudentEntity entity);
     StudentEntity convertToEntity(StudentDto dto);
     List<StudentDto> convertToDots(List<StudentEntity> entities);
     CleEntity cleDtoToCleEntity(CleDto cleDto);
}

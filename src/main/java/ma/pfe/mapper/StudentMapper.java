package ma.pfe.mapper;

import ma.pfe.dots.StudentDto;
import ma.pfe.entites.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public StudentDto convertToDto(StudentEntity entity){
        StudentDto dto=new StudentDto();
        dto.setId(entity.getId());
        dto.setNom(entity.getNom());
        return dto;
    }
    public StudentEntity convertToEntity(StudentDto dto){
        StudentEntity entity=new StudentEntity();
        entity.setId(dto.getId());
        entity.setNom(dto.getNom());
        return entity;
    }
    public List<StudentDto> convertToDots(List<StudentEntity> entities){
        return entities.stream().map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }
    public List<StudentEntity> convertToEntities(List<StudentDto> dtos){
        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }
}

package ma.pfe.controllers;

import ma.pfe.dots.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger LOG=LoggerFactory.getLogger(StudentController.class);
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto dto){
        LOG.debug("start save dto : {}",dto);
        StudentDto result = service.create(dto);
        LOG.debug("end save");
        return  result;
    }
    @PutMapping("/update")
    public StudentDto update(@RequestBody StudentDto dto){
        LOG.debug("start update dto : {}",dto);
        StudentDto result=service.update(dto);
        LOG.debug("end  update");
        return result;
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOG.debug("start delete id : "+ id);
        boolean result = service.delete(id);
        LOG.debug("end  delete");
        return  result;
    }
    @GetMapping("/read")
    public List<StudentDto> selectAll(){
        LOG.debug("start  selectAll");
        List<StudentDto> lst=service.readAll();;
        LOG.debug("end methode selectAll");
        return lst;
    }
}

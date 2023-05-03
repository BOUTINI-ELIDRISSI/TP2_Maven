package ma.pfe.controllers;

import ma.pfe.dots.CleDto;
import ma.pfe.dots.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger LOG=LoggerFactory.getLogger(StudentController.class);
    private StudentService service;

    public StudentController(@Qualifier("service1") StudentService service) {
        this.service = service;
    }
    @PostMapping("/save")
    public Long save(@RequestBody StudentDto dto){
        LOG.debug("start save dto : {}",dto);
        Long result = service.create(dto);
        LOG.debug("end save");
        return  result;
    }
    @PutMapping("/update")
    public Long update(@RequestBody StudentDto dto){
        LOG.debug("start update dto : {}",dto);
        Long result=service.update(dto);
        LOG.debug("end  update");
        return result;
    }
    @DeleteMapping("/{id}/{code}")
    public boolean delete(@PathVariable("id") long id,@PathVariable("code") String code){
        LOG.debug("start delete id : {} , code : {} ", id,code);
        CleDto cle=new CleDto(id,code);
        boolean result = service.delete(cle);
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

    @GetMapping("/{id}/{code}")
    public StudentDto findById(@PathVariable("id") long id,@PathVariable("code") String code ){
        LOG.debug("start methode findById  id : {}, code : {}",id,code);
        CleDto cledto = new CleDto(id,code);
        return service.findById(cledto);
    }
}

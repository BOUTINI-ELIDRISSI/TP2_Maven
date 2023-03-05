package ma.pfe.repositories;

import ma.pfe.entites.StudentEntity;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentReposritory{

    private static final Logger LOG= LoggerFactory.getLogger(StudentRepositoryImpl.class);

    @Override
    public StudentEntity create(StudentEntity e) {
        LOG.debug("start methode create");
        LOG.debug("end methode create");
        return e;
    }

    @Override
    public StudentEntity update(StudentEntity e) {
        LOG.debug("start methode update");
        LOG.debug("end methode update");
        return new StudentEntity();
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start methode delete");
        LOG.debug("end methode delete");
        return true;
    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start methode readAll");

        LOG.debug("end methode readAll");
        return new ArrayList<StudentEntity>();
    }
}

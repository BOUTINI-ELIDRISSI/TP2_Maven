package ma.pfe.repositories;

import ma.pfe.entites.CleEntity;
import ma.pfe.entites.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repo1")
public interface StudentReposritory  extends JpaRepository<StudentEntity, CleEntity> {

}

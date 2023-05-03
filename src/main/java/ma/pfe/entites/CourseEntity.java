package ma.pfe.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcours;
    private String couseName;

    public long getIdcours() {
        return idcours;
    }

    public void setIdcours(long idcours) {
        this.idcours = idcours;
    }

    public String getCouseName() {
        return couseName;
    }

    public void setCouseName(String couseName) {
        this.couseName = couseName;
    }
}
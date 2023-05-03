package ma.pfe.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_Student")
public class StudentEntity {
    //@Id
    //private long id;
    @EmbeddedId
    private CleEntity cle;

    @Column(name = "name_student")
    private  String name;
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<CourseEntity> courses;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "rue", column = @Column(name = "rue_student")),
            @AttributeOverride(name = "avenue", column = @Column(name = "avenue_student"))
    })
    private AdresseEntity adresse;


    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    public AdresseEntity getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseEntity adresse) {
        this.adresse = adresse;
    }

    public CleEntity getCle() {
        return cle;
    }

    public void setCle(CleEntity cle) {
        this.cle = cle;
    }

    /*public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "cle=" + cle +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}

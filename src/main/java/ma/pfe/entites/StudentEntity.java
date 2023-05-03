package ma.pfe.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_Student")
public class StudentEntity {
    @EmbeddedId
    private CleEntity cle;

    @Column(name = "name_student")
    private  String name;
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<CourseEntity> courses;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private NiveauEntity niveau;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "rue", column = @Column(name = "rue_student")),
            @AttributeOverride(name = "avenue", column = @Column(name = "avenue_student"))
    })
    private AdresseEntity adresse;

    public NiveauEntity getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauEntity niveau) {
        this.niveau = niveau;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

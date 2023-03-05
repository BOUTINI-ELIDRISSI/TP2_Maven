package ma.pfe.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Student")
public class StudentEntity {
    @Id
    private long id;
    private  String nom;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}

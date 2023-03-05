package ma.pfe.dots;

public class StudentDto {
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

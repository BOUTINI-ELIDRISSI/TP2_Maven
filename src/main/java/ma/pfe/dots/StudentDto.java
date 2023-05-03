package ma.pfe.dots;

import java.util.List;

public class StudentDto {

    //private long id;
    private CleDto cle;

    private  String name;
    private List<CourseDto> courses;
    private NiveauDto niveau;
    private AdresseDto adresse;

    public NiveauDto getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauDto niveau) {
        this.niveau = niveau;
    }

    public CleDto getCle() {
        return cle;
    }

    public void setCle(CleDto cle) {
        this.cle = cle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
    }

    public AdresseDto getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseDto adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "cle=" + cle +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", niveau=" + niveau +
                ", adresse=" + adresse +
                '}';
    }
}

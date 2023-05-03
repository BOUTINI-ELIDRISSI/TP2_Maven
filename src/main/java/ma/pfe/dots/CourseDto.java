package ma.pfe.dots;


public class CourseDto {
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

    @Override
    public String toString() {
        return "CourseDto{" +
                "idcours=" + idcours +
                ", couseName='" + couseName + '\'' +
                '}';
    }
}

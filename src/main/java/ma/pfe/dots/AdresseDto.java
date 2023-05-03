package ma.pfe.dots;

public class AdresseDto {
    private String rue;
    private String avenue;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    @Override
    public String toString() {
        return "AdresseDto{" +
                "rue='" + rue + '\'' +
                ", avenue='" + avenue + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

package ma.pfe.dots;

public class CleDto {
    private long cle;
    private String code;

    public CleDto(long cle, String code) {
        this.cle = cle;
        this.code = code;
    }
    public CleDto() {
    }
    public long getCle() {
        return cle;
    }

    public void setCle(long cle) {
        this.cle = cle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CleDto{" +
                "cle=" + cle +
                ", code='" + code + '\'' +
                '}';
    }
}

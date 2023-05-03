package ma.pfe.entites;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CleEntity implements Serializable {
    private long cle;
    private String code;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CleEntity cleEntity = (CleEntity) o;
        return cle == cleEntity.cle && Objects.equals(code, cleEntity.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cle, code);
    }

    @Override
    public String toString() {
        return "CleEntity{" +
                "cle=" + cle +
                ", code='" + code + '\'' +
                '}';
    }
}

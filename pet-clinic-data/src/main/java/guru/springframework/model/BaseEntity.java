package guru.springframework.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id; //we use Long and not long because it's an hibernate recommendation

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

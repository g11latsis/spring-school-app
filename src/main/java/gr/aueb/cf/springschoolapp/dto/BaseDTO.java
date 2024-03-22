package gr.aueb.cf.springschoolapp.dto;

import org.antlr.v4.runtime.misc.NotNull;

public abstract class BaseDTO {
    @NotNull
    private Long id;

    public BaseDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

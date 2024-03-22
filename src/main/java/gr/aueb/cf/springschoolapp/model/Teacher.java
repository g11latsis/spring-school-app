package gr.aueb.cf.springschoolapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.archive.scan.internal.ScanResultImpl;

@Entity
@Data
@NoArgsConstructor
@Table(name = "teachers")
public class Teacher extends AbstractEntity {

    @Column(name = "FIRSTNAME", length = 512, nullable = false)
    private String firstname;

    @Column(name = "LASTNAME", length = 512, nullable = false)
    private String lastname;

    public Teacher(Long id, String firstname, String lastname){
        this.setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }

}

package lr1.lr1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;
    @Setter
    private String type;
    @Setter
    private boolean status;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

}
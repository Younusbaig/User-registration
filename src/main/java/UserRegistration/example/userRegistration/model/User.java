package UserRegistration.example.userRegistration.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user_reg_data")
public class User {

    private String name;
    @Id
    @GeneratedValue
    private int id;
    private int experience;
    private String domain;
    private String email;


}

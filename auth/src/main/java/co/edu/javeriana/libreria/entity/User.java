package co.edu.javeriana.libreria.entity;

    import javax.persistence.*;
    import javax.validation.constraints.NotBlank;
    import java.time.LocalDate;

@Entity
@Table(name = "users")
// Class
public class User {

    @Id
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String role;
    @NotBlank
    private String activated;

    private LocalDate fecha_nacimiento;

    private String name;

    private String lastname;

    public String getName() { return this.name;}
    public void setName(String name) {this.name = name;}

    public String getLastname() {return this.lastname;}
    public void setLastname( String lastname) {this.lastname = lastname;}

    public LocalDate getFecha_nacimiento() {return this.fecha_nacimiento;}
    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {this.fecha_nacimiento = fecha_nacimiento;}

    public String getUsername() {return this.username;}
    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return this.password;}
    public void setPassword(String password) {this.password = password;}

    public String getRole() {return this.role;}
    public void setRole(String role) {this.role = role;}

    public String getActivated() { return this.activated;}
    public void setActivated(String activated) {this.activated = activated;}
}

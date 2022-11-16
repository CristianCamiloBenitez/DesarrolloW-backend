package co.edu.javeriana.libreria.entity;

    import javax.persistence.*;
    import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "editorial")
// Class
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String web_site;

    public Integer getId() {return this.id;}
    public void setId(Integer id) {this.id = id;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getWeb_site() {return this.web_site;}
    public void setWeb_site(String web_site) {this.web_site = web_site;}
}

package co.edu.javeriana.libreria.entity;

    import javax.persistence.*;
    import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "book")
// Class
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private String image_url;

    private Integer cantidad;
    @NotBlank
    private String author;

    private Integer editorial_id;

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public Integer getId() {return this.id;}
    public void setId(Integer id) {this.id = id;}

    public Integer getEditorial_id() {return  this.editorial_id;}
    public void setEditorial_id(Integer editorial_id) {this.editorial_id = editorial_id;}

    public String getDescription() {return this.description;}
    public void setDescription(String description) {this.description = description;}

    public String getImage_url() {return this.image_url;}
    public void setImage_url(String image_url) {this.image_url = image_url;}
    public String getAuthor() { return this.author;}
    public void setAuthor(String author) { this.author = author;}

    public Integer getCantidad() {return this.cantidad;}
    public void setCantidad(Integer cantidad) {this.cantidad = cantidad;}
}


package dto;

public class UsuarioDTO {
    private Long id;
    private String nombreCompleto;
    private String email;

    public UsuarioDTO(Long id, String nombreCompleto, String email) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", nombreCompleto=" + nombreCompleto + ", email=" + email + '}';
    }
    
    
}

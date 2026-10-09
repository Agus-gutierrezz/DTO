
package dto;

public class Usuario {
    private Long id;
    private String nombreCompleto;
    private String email;
    private String password;
    private String rolSeguridad;

    public Usuario(Long id, String nombreCompleto, String email, String password, String rolSeguridad) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
        this.rolSeguridad = rolSeguridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRolSeguridad() {
        return rolSeguridad;
    }

    public void setRolSeguridad(String rolSeguridad) {
        this.rolSeguridad = rolSeguridad;
    }
    
    
}

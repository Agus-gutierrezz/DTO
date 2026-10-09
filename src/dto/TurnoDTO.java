
package dto;

public class TurnoDTO {
    private Long id;
    private UsuarioDTO usuario;

    public TurnoDTO(Long id, UsuarioDTO usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "TurnoDTO{" + "id=" + id + ", usuario=" + usuario + '}';
    }
}

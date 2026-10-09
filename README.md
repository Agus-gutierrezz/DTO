# Trabajo Practico DTO (Usuario y Turno)

## Main
```java
package dto;


public class Dto {

    public static UsuarioDTO convertirADto(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNombreCompleto(),
                usuario.getEmail()
        );
    }
    public static TurnoDTO convertirADto (Turno turno){
        return new TurnoDTO(turno.getId(),turno.getUsuario());
    }
    
    public static void main(String[] args) {
       // 1. Simular la entidad que recuperamos de la base de datos
        Usuario usuarioBD = new Usuario(
                1L,
                "Juan Perez",
                "juancito.perez@email.com",
                "P@ssw0rd123!", //Contraseña sensible
                "ROLE_ADMIN"    //Rol interno
        );
        UsuarioDTO Usuariodto = convertirADto(usuarioBD);
        RespuestaDTO <UsuarioDTO> respuesta = new RespuestaDTO<> (true, "Encontrado", Usuariodto);

        System.out.println("=== DATOS ENVIADOS AL FRONTEND ===");
        System.out.println(Usuariodto);
        System.out.println("----------");
        System.out.println(respuesta.getDatos());
        
        Turno turnoBD = new Turno(1L, Usuariodto, "12-12-2026", "19:00");
        TurnoDTO dtoTurno = convertirADto(turnoBD);
        RespuestaDTO <TurnoDTO> respuesta2 = new RespuestaDTO<> (true, "hola mundo", dtoTurno);
        System.out.println("=== DATOS ENVIADOS AL FRONTEND ===");
        System.out.println(dtoTurno);
        System.out.println("----");
        System.out.println(respuesta2.getMensaje());
        
    }
    
}
```

## Clase Usuario

```java

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
```

## Clase UsuarioDTO

```java

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
```

## Clase Turno

```java


package dto;


public class Turno {
    private Long id;
    private UsuarioDTO usuario;
    private String fecha;
    private String hora;

    public Turno(Long id, UsuarioDTO usuario, String fecha, String hora) {
        this.id = id;
        this.usuario = usuario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
}
```

## Clase TurnoDTO 

```java


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
```

## Clase RespuestaDTO

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author agust
 */
public class RespuestaDTO <T> {
    private boolean exito;
    private String mensaje;
    private T datos;

    public RespuestaDTO(boolean exito, String mensaje, T datos) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDatos() {
        return datos;
    }
    
    
}
``
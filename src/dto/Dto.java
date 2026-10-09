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
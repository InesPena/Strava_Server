package server.data.dto;

import server.data.domain.Usuario;

public class UsuarioAssembler {
	
	private static UsuarioAssembler instance;
	
	private UsuarioAssembler() { }
	
	public static UsuarioAssembler getInstance()  {
		if (instance == null) {
			instance = new UsuarioAssembler();
		}
		return instance;
	}
	
	public UsuarioDTO usuarioDTO(Usuario u) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setEmail(u.getEmail());
		dto.setNombre(u.getNombre());
		return dto;
	}

}

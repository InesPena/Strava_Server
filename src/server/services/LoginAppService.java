package server.services;

import server.data.domain.Usuario;

public class LoginAppService {
	
	public Usuario login(String email, String contrasenya) {
		Usuario u = new Usuario();
		u.setEmail("inespena@opendeusto.es");
		u.setNombre("Ines");
		u.setContrasenya("elk87oiq2");
		
		if (u.getEmail().equals(email) && u.checkContrasenya(contrasenya)) {
			return u;
		} else {
			return null;
		}
	}

}

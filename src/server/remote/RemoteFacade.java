package server.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import server.data.domain.Usuario;
import server.services.LoginAppService;


public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade{

	private static final long serialVersionUID = 1L;
	
	private Map<Long, Usuario> serverState = new HashMap<>();
	
	private LoginAppService loginService = new LoginAppService();
	
	
	protected RemoteFacade() throws RemoteException {
		super();
	}

	@Override
	public synchronized long login(String email, String contrasenya) throws RemoteException {
		System.out.println(" * RemoteFacade login(): " + email + " / " + contrasenya);
		
		Usuario u = loginService.login(email, contrasenya);
		if (u != null) {
			if (!this.serverState.values().contains(u)) {
				Long token = Calendar.getInstance().getTimeInMillis();
				this.serverState.put(token, u);
				return token;
			} else {
				throw new RemoteException("User is already logged in!");
			}
		} else {
			throw new RemoteException("Login fails!");
		}
	}

	@Override
	public void logout(long token) throws RemoteException {
		System.out.println(" * RemoteFacade logout(): " + token);
		
		if (this.serverState.containsKey(token)) {
			this.serverState.remove(token);
		} else {
			throw new RemoteException("User is not logged in!");
		}
	}

	@Override
	public boolean crearSesion(long token, String titulo, String deporte, String fechainciio, String horaInicio,
			int duracion) throws RemoteException {
		if (this.serverState.containsKey(token)) {	
			
		} else {
			
		}
		return false;
	}

	
	
	
	
	
		
}

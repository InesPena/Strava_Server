package server.remote;

import java.rmi.RemoteException;

public interface IRemoteFacade {
	
	public long login(String email, String contrasenya) throws RemoteException;
	
	public void logout(long token) throws RemoteException;
	
	public boolean crearSesion(long token, String titulo, String deporte, String fechainciio, String horaInicio, int duracion) throws RemoteException;

	//public boolean crearReto();
}

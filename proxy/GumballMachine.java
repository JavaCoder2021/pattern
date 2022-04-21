package by.epam.pattern.proxy;

import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

	private static final long serialVersionUID = 2L;
	String location;
	State state;
	int count = 0;

	// Переменные

	public GumballMachine(String location, int numberGumballs) throws RemoteException {
		// Код
	}

	public int getCount() {
		return count;
	}

	public State getState() {
		return state;
	}

	public String getLocation() {
		return location;
	}

	// Другие методы
	
}
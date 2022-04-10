package by.epam.pattern.command;

public class Main {

	public static void main(String[] args) {

		RemoteControl remote = new RemoteControl();

		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();

		remote.setCommand(0, light::on, light::off);
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		//remote.undoButtonWasPushed();
		
		remote.setCommand(1, garageDoor::up, garageDoor::down);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		
	}

}
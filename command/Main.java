package by.epam.pattern.command;

public class Main {

	public static void main(String[] args) {

		RemoteControl remote = new RemoteControl();

		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand lightOnHome = new LightOnCommand(light);
		LightOffCommand lightOffHome = new LightOffCommand(light);
		
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garageDoor);

		remote.setCommand(0, lightOnHome, lightOffHome);
		remote.onButtonWasPushed(0);
		remote.undoButtonWasPushed();
		
		remote.setCommand(1, garageOpen, garageDown);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		
	}

}

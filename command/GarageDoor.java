package by.epam.pattern.command;

public class GarageDoor {

	public void up() {
		System.out.println("Garage Door is Open");
	}

	public void down() {
		System.out.println("Garage Door is Close");
	}

	public void stop() {
		System.out.println("Stop");
	}

	public void lightOn() {
		System.out.println("LightOn");
	}

	public void lightOff() {
		System.out.println("LightOff");
	}

}
package by.epam.pattern.command;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		if (onCommands[slot] != null) {
			onCommands[slot].execute();
			undoCommand = onCommands[slot];
		}
	}

	public void offButtonWasPushed(int slot) {
		if (onCommands[slot] != null) {
			offCommands[slot].execute();
			undoCommand = offCommands[slot];
		}
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "    "
					+ offCommands[i].getClass().getSimpleName() + "\n");
		}
		return stringBuff.toString();
	}

}
package com.shardul.patterns.command;

public class Person {

	public static void main(String[] args) {

		Television television = new Television();

		RemoteControl remoteControl = new RemoteControl();

		// on
		OnCommand onCommand = new OnCommand(television);
		remoteControl.setCommand(onCommand);
		remoteControl.pressButton();

		// off
		OffCommand offCommand = new OffCommand(television);
		remoteControl.setCommand(offCommand);
		remoteControl.pressButton();

	}

}

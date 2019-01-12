package com.hh.main;

import com.hh.command.Command;

public class TraditionController implements Controller {

	private Command[] commandOn;
	private Command[] commandOff;

	public TraditionController() {
		commandOn = new Command[5];
		commandOff = new Command[5];
	}

	public void setCommand(int slot,Command onCommand,Command offCommand) {
		commandOn[slot] = onCommand;
		commandOff[slot] = offCommand;
	}
	
	@Override
	public void onButton(int slot) {
		commandOn[slot].exceute();
	}

	@Override
	public void offButton(int slot) {
		commandOff[slot].exceute();
	}

}

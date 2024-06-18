package com.formationkilo;

public class CommandC implements Command{
   private ReceiverImpl2 receiver2;
   
	public CommandC(ReceiverImpl2 receiver2) {
	  this.receiver2 = receiver2;
    }

	@Override
	public void execute() {
		receiver2.action3();
		
	}

}

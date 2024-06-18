package com.formationkilo;

public class CommandA implements Command{
   private ReceiverImpl1 receiver1;
   
	public CommandA(ReceiverImpl1 receiver1) {
	  this.receiver1 = receiver1;
    }

	@Override
	public void execute() {
		receiver1.action1();
		
	}

}

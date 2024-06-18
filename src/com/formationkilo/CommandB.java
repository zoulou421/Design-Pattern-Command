package com.formationkilo;

public class CommandB implements Command{
   private ReceiverImpl1 receiver1;
   
	public CommandB(ReceiverImpl1 receiver1) {
	  this.receiver1 = receiver1;
    }

	@Override
	public void execute() {
		receiver1.action1();
		
	}

}

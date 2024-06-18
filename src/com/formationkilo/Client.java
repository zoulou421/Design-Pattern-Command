package com.formationkilo;

public class Client {

	public static void main(String[] args) {
		ReceiverImpl1 rec1=new ReceiverImpl1();
		ReceiverImpl2 rec2=new ReceiverImpl2();
		
		Command cmd1=new CommandA(rec1);
		Command cmd2=new CommandB(rec1);
		Command cmd3=new CommandC(rec2);
		
		Invoker telecommand=new Invoker();
		telecommand.addNewCommand("A", cmd1);
		telecommand.addNewCommand("B", cmd2);
		telecommand.addNewCommand("C", cmd3);
		
		telecommand.invoke("A");
		telecommand.invoke("B");
		telecommand.invoke("C");
		telecommand.invoke("D");		
	}

}

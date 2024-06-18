package com.formationkilo;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
 private Map<String,Command>commands=new HashMap<String,Command>();
 public void addNewCommand(String ref,Command cmd) {
	 commands.put(ref, cmd);
 }
 public void invoke(String ref) {
	 Command cmd=commands.get(ref);
	 if(cmd!=null) cmd.execute();
 }
}

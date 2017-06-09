package net.leejjon.gradle;

public class LeejjonPluginExtension {
	 private String message = "Default";

	 public String getMessage () {
		  return message;
	 }

	 public void setMessage (String message) {
		  this.message = message;
	 }
}

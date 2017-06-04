package net.leejjon.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class LeejjonTask extends DefaultTask {
	 @TaskAction
	 public void greet() {
		  LeejjonPluginExtension extension = getProject().getExtensions().findByType(LeejjonPluginExtension.class);
		  if (extension == null) {
				extension = new LeejjonPluginExtension();
		  }

		  String message = extension.getMessage();
		  System.out.println(message);
	 }
}

package net.leejjon.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class LeejjonPlugin implements Plugin<Project> {

	 @Override
	 public void apply (Project project) {
		  project.getExtensions().create("leejjonSetting", LeejjonPluginExtension.class);
		  project.getTasks().create("leejjonTask", LeejjonTask.class);
	 }
}

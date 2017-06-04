import net.leejjon.gradle.LeejjonTask
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.*

class LeejjonPluginTest {
    @Test
    public void demo_plugin_should_add_task_to_project() {
        Project project = ProjectBuilder.builder().build()
        project.getPlugins().apply 'net.leejjon.gradle.plugin'

        assertTrue(project.tasks.leejjonTask instanceof LeejjonTask)
    }
}

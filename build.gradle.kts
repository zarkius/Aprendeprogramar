// Top-level build file where you can add configuration options common to all sub-projects/modules.

abstract class SomeTask : DefaultTask() {
    @TaskAction
    fun action() {
        project.copy {
            from("source")
            into("destination")
        }
    }
}

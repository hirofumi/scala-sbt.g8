import sbt._

object Plugins extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn( g8plugin )
  lazy val g8plugin = ProjectRef(uri("git://github.com/hirofumi/giter8#fix-oom"), "giter8-plugin")
}

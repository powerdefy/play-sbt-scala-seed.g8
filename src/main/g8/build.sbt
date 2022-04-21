name := """$name$"""
organization := "$organization$"

version := "1.0-SNAPSHOT"

// disable default Play layout to enable SBT layout
lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayLayoutPlugin)

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "$scalatestplusplay_version$" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "$package$.$name;format="word"$.controllers._"

// Adds additional packages into resources/routes
// play.sbt.routes.RoutesKeys.routesImport += "$package$.$name;format="word"$.binders._"


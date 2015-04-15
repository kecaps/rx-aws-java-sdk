import sbt._

object Dependencies {
  object Versions {
    val aws        = "1.9.16"
    val awsMapper  = aws + ".2"
    val guice      = "4.0-beta5"
    val karyon     = "2.2.0-rc.1"
    val ribbon     = "2.0.0"
    val rxj        = "1.0.8"
    val rxnetty    = "0.4.8.1"
    val scala      = "2.11.6"
    val slf4j      = "1.7.10"
    val spectator  = "0.20.0"
  }

  import Versions._

  val awsObjectMapper = "com.netflix.awsobjectmapper" % "awsobjectmapper" % awsMapper
  val awsCore         = "com.amazonaws" % "aws-java-sdk-core" % aws
  val awsDynamoDB     = "com.amazonaws" % "aws-java-sdk-dynamodb" % aws
  val awsEc2          = "com.amazonaws" % "aws-java-sdk-ec2" % aws
  val equalsVerifier  = "nl.jqno.equalsverifier" % "equalsverifier" % "1.5.1"
  val eureka          = "com.netflix.eureka" % "eureka-client" % "1.1.150"
  val governator      = "com.netflix.governator" % "governator" % "1.3.3"
  val guava           = "com.google.guava" % "gauva" % "73.0"
  val guiceAssist     = "com.google.inject.extensions" % "guice-assistedinject" % guice
  val guiceCore       = "com.google.inject" % "guice" % guice
  val guiceGrapher    = "com.google.inject.extensions" % "guice-grapher" % guice
  val guiceMulti      = "com.google.inject.extensions" % "guice-multibindings" % guice
  val guiceServlet    = "com.google.inject.extensions" % "guice-servlet" % guice
  val inject          = "javax.inject" % "javax.inject" % "1"
  val jodaTime        = "joda-time" % "joda-time" % "2.5"
  val karyonAdmin     = "com.netflix.karyon" % "karyon2-admin-web" % karyon
  val karyonCore      = "com.netflix.karyon" % "karyon2-core" % karyon
  val junit           = "junit" % "junit" % "4.10"
  val junitInterface  = "com.novocode" % "junit-interface" % "0.11"
  val jzlib           = "com.jcraft" % "jzlib" % "1.1.3"
  val ribbonCore      = "com.netflix.ribbon" % "ribbon-core" % ribbon
  val ribbonEureka    = "com.netflix.ribbon" % "ribbon-eureka" % ribbon
  val ribbonHttp      = "com.netflix.ribbon" % "ribbon-httpclient" % ribbon
  val ribbonLb        = "com.netflix.ribbon" % "ribbon-loadbalancer" % ribbon
  val rxjava          = "io.reactivex" % "rxjava" % rxj
  val rxnettyCore     = "com.netflix.iep-shadow" % "iepshadow-rxnetty" % rxnetty
  val rxnettyCtxts    = "com.netflix.iep-shadow" % "iepshadow-rxnetty-contexts" % rxnetty
  val rxnettySpectator= "com.netflix.iep-shadow" % "iepshadow-rxnetty-spectator" % rxnetty
  val scalaLibrary    = "org.scala-lang" % "scala-library" % scala
  val scalaLibraryAll = "org.scala-lang" % "scala-library-all" % scala
  val scalaLogging    = "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0"
  val scalaParsec     = "org.scala-lang.modules" % "scala-parser-combinators_2.11" % "1.0.2"
  val scalaReflect    = "org.scala-lang" % "scala-reflect" % scala
  val scalatest       = "org.scalatest" % "scalatest_2.11" % "2.2.1"
  val slf4jApi        = "org.slf4j" % "slf4j-api" % slf4j
  val spectatorApi    = "com.netflix.spectator" % "spectator-api" % spectator
  val spectatorSandbox= "com.netflix.spectator" % "spectator-ext-sandbox" % spectator
}

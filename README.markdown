## Scalatra [![Build Status](http://jenkins.backchat.io/job/scalatra-2.2.x_2.10/badge/icon)](http://jenkins.backchat.io/job/scalatra-2.2.x_2.10/)

Scalatra is a tiny, [Sinatra](http://www.sinatrarb.com/)-like web framework for
[Scala](http://www.scala-lang.org/).

## Example

```scala
import org.scalatra._

class ScalatraExample extends ScalatraServlet {
  get("/") {
    <h1>Hello, world!</h1>
  }
}
```

## Documentation

If you're just starting out, see the [installation](http://www.scalatra.org/2.2/getting-started/installation.html) and [first project](http://www.scalatra.org/2.2/getting-started/first-project.html) sections of our website. 

Once you've done that, take a look at the [Scalatra Guides](http://www.scalatra.org/guides/) for documentation on all aspects of the framework, code examples, and more. We also have an extensive selection of [Example Applications](https://github.com/scalatra/scalatra-website-examples) which accompany the tutorials in the Scalatra Guides.

## Latest version

The latest version of Scalatra is `2.2.2`, and is published to [Maven Central](http://repo1.maven.org/maven2/org/scalatra).

```scala
libraryDependencies += "org.scalatra" %% "scalatra" % "2.2.2"
```

### Development version

The develop branch is published as `2.3.0-SNAPSHOT` to [OSSRH](http://oss.sonatype.org/content/repositories/snapshots/org/scalatra). 

```scala
resolvers += "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "org.scalatra" %% "scalatra" % "2.3.0-SNAPSHOT"
```

## Community

* Mailing list: [scalatra-user](http://groups.google.com/group/scalatra-user)
* IRC: #scalatra on irc.freenode.org

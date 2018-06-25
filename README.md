# fails to compile

## sbt

sbt fails to compipe and error is 

```
sbt compile
[error] Caused by: java.lang.ClassNotFoundException: scala.runtime.LazyRef
```

## gradle

fails to compile and error is:

```
./gradlew compileScala
ould not find implicit value for parameter reader: pureconfig.ConfigReader[Foo.XXX]
  pureconfig.ConfigReader[XXX]
```
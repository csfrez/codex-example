# demo-jdk-17

JDK 17 相比 JDK 8 的常用新特性示例项目。

## 编译

```bash
mvn compile
```

## 运行示例

```bash
mvn exec:java -Dexec.mainClass=com.example.VarExample
mvn exec:java -Dexec.mainClass=com.example.SwitchExpressionExample
mvn exec:java -Dexec.mainClass=com.example.TextBlockExample
mvn exec:java -Dexec.mainClass=com.example.RecordExample
mvn exec:java -Dexec.mainClass=com.example.SealedClassExample
mvn exec:java -Dexec.mainClass=com.example.InstanceofPatternExample
mvn exec:java -Dexec.mainClass=com.example.InterfacePrivateMethodExample
mvn exec:java -Dexec.mainClass=com.example.CollectionFactoryExample
mvn exec:java -Dexec.mainClass=com.example.StreamEnhancementExample
mvn exec:java -Dexec.mainClass=com.example.OptionalEnhancementExample
mvn exec:java -Dexec.mainClass=com.example.HttpClientExample
mvn exec:java -Dexec.mainClass=com.example.StringEnhancementExample
```

## jshell 示例

```bash
jshell
```

```java
jshell> var name = "Tom"
name ==> "Tom"

jshell> name.toUpperCase()
$2 ==> "TOM"

jshell> java.util.List.of(1, 2, 3)
$3 ==> [1, 2, 3]
```

## jlink 示例

```bash
mvn compile
jlink --module-path "%JAVA_HOME%\jmods;target\classes" --add-modules demo.app --output demo-runtime
demo-runtime\bin\java -m demo.app/com.example.Main
```

## jpackage 示例

```bash
mvn package
jpackage --name DemoApp --input target --main-jar demo-jdk-17-1.0.0.jar --main-class com.example.Main
```

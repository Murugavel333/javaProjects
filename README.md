# Java Cricket Player Examples

A collection of small, standalone Java programs for practicing object-oriented programming, input handling, exceptions, and multithreading. The examples use cricket-player data to demonstrate each concept.

## Requirements

- A Java Development Kit (JDK) with `java` and `javac` available on your `PATH`
- A terminal such as PowerShell, Command Prompt, or the VS Code integrated terminal

Check that Java is installed:

```powershell
java -version
javac -version
```

## Examples

| Folder | Main source file | Concepts |
| --- | --- | --- |
| `java project1` | `CricketPlayerInfo.java` | Classes and objects, default and parameterized constructors |
| `java project1` | `SingleInheritanceDemo.java` | Single inheritance |
| `java project2` | `CricketPlayerInfo.java` | Method overloading and static members |
| `java project3` | `CricketPlayerInfo.java` | Reading player details with `Scanner` |
| `java project3` | `SingleInheritanceDemo.java` | Single inheritance |
| `java project4` | `SingleInheritanceDemo.java` | Single inheritance |
| `java project4` | `MultilevelInheritanceDemo.java` | Multilevel inheritance |
| `java project5` | `MethodOverridingDemo.java` | Method overriding and runtime behavior |
| `javaproject6` | `AbstractCricketDemo.java` | Abstract classes and methods |
| `javaproject6B` | `InterfaceMultipleInheritance.java` | Implementing multiple interfaces |
| `javaproject7` | `CricketPlayerApp.java` | Custom exceptions and validation |
| `javaproject8a` | `CricketPlayerApp.java` | Creating a thread by extending `Thread` |
| `javaproject8b` | `CricketPlayerApp.java` | Creating a thread with `Runnable` |
| `javaproject9` | `CricketPlayerApp.java` | Thread synchronization with `wait()` and `notify()` |
| `javaproject10` | `CricketDeadlockPrevention.java` | Synchronized methods and shared-object access |

## Compile and run an example

Each source file can be compiled and run independently. In PowerShell, change to the example's folder, compile its source file, and run the public class whose name matches the file:

```powershell
Set-Location "java project1"
javac CricketPlayerInfo.java
java CricketPlayerInfo
```

For an interactive example, enter the requested player details when prompted. For another example, substitute its folder, source filename, and public class name from the table. For example:

```powershell
Set-Location ..\javaproject6B
javac InterfaceMultipleInheritance.java
java InterfaceMultipleInheritance
```

Run one example at a time and compile it from its own folder. Several folders contain classes with the same names, so compiling multiple folders together can cause class-name conflicts.

## Repository layout

Each numbered folder contains an independent exercise. The source files are the canonical examples; `.class` files, where present, are compiled output and can be regenerated with `javac`.

package com.example.Principle_Dependency_inversion;

//  Higher level modules: Higher-level modules are modules or classes that contain complex logic and depend on the abstractions provided by lower-level modules.
// In summary, higher-level modules contain complex logic and depend on the abstractions provided by lower-level modules, which encapsulate simpler or foundational logic. 
// This organization promotes modularity, reusability, and maintainability in object-oriented systems.

interface ILogger {
  public void logInformational(String loginfo);
}

class Logger implements ILogger {
  public void logInformational(String loginfo) {
    System.out.println(loginfo);
  }
}

// By creating a interface, LogginToFile class is not dependent on Logger class.
class LogginToFile {
  private ILogger logger;

  public LogginToFile(ILogger l) {
    this.logger = l;
  }

  public void logging() {
    logger.logInformational("Printing logs to the filesystem");
  }
}

// now if we want to log to database instead of a file. WE can simple create a new class.
// We din't have to change anything in the LogginToFile class because it is not dependent in logger class. 
class LogginToDatabase {
  private ILogger logger;

  public LogginToDatabase(ILogger l) {
    this.logger = l;
  }

  public void logging() {
    logger.logInformational("Printing logs to the database");
  }
}




public class loggerrrrrr {
  public static void main(String[] args) {
    LogginToFile fileLogger = new LogginToFile(new Logger());
    fileLogger.logging();
  }
}

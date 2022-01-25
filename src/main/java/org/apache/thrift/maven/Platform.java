package org.apache.thrift.maven;

public class Platform {

  public static PlatformType os() {
    String platformUpper = System.getProperty("os.name").toUpperCase();
    if (platformUpper.startsWith("WINDOWS")) {
      return PlatformType.WINDOWS;
    } else if (platformUpper.startsWith("MAC")) {
      return PlatformType.MACOS;
    } else if (platformUpper.startsWith("LINUX")) {
      return PlatformType.LINUX;
    }
    return PlatformType.UNKNOWN;
  }

  enum PlatformType {
    WINDOWS, MACOS, LINUX, UNKNOWN
  }

}

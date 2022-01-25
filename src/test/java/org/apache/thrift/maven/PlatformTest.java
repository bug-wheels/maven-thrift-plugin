package org.apache.thrift.maven;

import org.junit.jupiter.api.Test;

public class PlatformTest {

  @Test
  public void testOsName() {
    System.out.println(Platform.os());
  }
}
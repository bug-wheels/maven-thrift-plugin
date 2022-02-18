# Thrift Maven Plugin

Maven Thrift Plugin that executes the thrift code generator

**注意：** 插件基于原版 Thrift Maven Plugin 进行修改，原版地址 https://github.com/dtrott/maven-thrift-plugin

在使用方式上主要增加了对不同平台的配置, 在 configuration 中可以通过设置

- macThriftExecutable  MacOS 下 Thrift 可执行文件的路径
- winThriftExecutable  Windows 下 Thrift 可执行文件的路径
- linuxThriftExecutable Linux 下 Thrift 可执行文件的路径
- thriftExecutable  兜底的 Thrift 可执行文件的路径

> 以上配置至少有一个

```xml
<plugin>
  <groupId>com.github.zyndev</groupId>
  <artifactId>thrift-maven-plugin</artifactId>
  <version>0.1.15</version>
  <configuration>
      <thriftExecutable>/usr/local/bin/thrift</thriftExecutable>
      <!--MacOS环境下用次配置-->
      <macThriftExecutable>/usr/local/bin/thrift</macThriftExecutable>
      <!--Windows环境下用此配置-->
      <winThriftExecutable>./thrift-0.9.3.exe</winThriftExecutable>
      <thriftSourceRoot>./src/main/thrift</thriftSourceRoot>
  </configuration>
  <executions>
      <execution>
          <id>thrift-sources</id>
          <phase>generate-sources</phase>
          <goals>
              <goal>compile</goal>
          </goals>
      </execution>
      <execution>
          <id>thrift-test-sources</id>
          <phase>generate-test-sources</phase>
          <goals>
              <goal>testCompile</goal>
          </goals>
      </execution>
  </executions>
</plugin>
```
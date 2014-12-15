TextKernelClient
================

Java client for the textkernel.com CV parser


Usage
-----

The client is built and distributed with Maven
### Maven dependencies
Add our Maven Snapshot repository to your pom file
```
<repository>
<id>youcruit-cloudbees-snapshot</id>
<name>youcruit-cloudbees-snapshot</name>
<url>http://repository-youcruit.forge.cloudbees.com/snapshot/</url>
<releases>
<enabled>false</enabled>
</releases>
<snapshots>
<enabled>true</enabled>
</snapshots>
</repository>
```

Also add the dependency to your pom
```
<dependency>
<groupId>com.youcruit.textkernel.client</groupId>
<artifactId>TextKernelClient</artifactId>
<version>0.1.6-SNAPSHOT</version>
</dependency>
```

### Simple usage:

```java
String textKernelUrl = "https://home.textkernel.nl/sourcebox/processAtomicPost.do";
String username = "username";
String account = "account";
String password = "password";
String pathToFile = "example.pdf";
TextKernelClient tkclient = new TextKernelClient(textKernelUrl, username, account, password);
Profile p = tkclient.getProfile(new File(pathToFile));
System.out.println(p.getRawHtml());
´´´

Building
--------

mvn clean install
TextKernelClient
================

Java client for the textkernel.com CV parser


Usage
-----

The client is built and distributed with Maven
### Maven dependencies
Add the dependency to your pom
```xml
<dependency>
 <groupId>com.youcruit.textkernel.client</groupId>
 <artifactId>TextKernelClient</artifactId>
 <version>0.3.16</version>
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
```

Building
--------

mvn clean install

## Java Client for DimensionData Cloud API 2.1.0

### API Documentation
https://community.opsourcecloud.net/Browse.jsp?id=e5b1a66815188ad439f76183b401f026

### Requirements

Java 8

### Maven Configuration
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	<dependency>
        <groupId>com.github.DimensionDataIreland</groupId>
    	<artifactId>dimensiondata-cloud-api</artifactId>
    	<version>2.1.0</version>
    </dependency>
```

### Java Example
```java
UserSession.set(new User("my-org-id", "username", "password"));

Cloud cloud = new CloudImpl(DimensionDataPublicCaas.EU);

Datacenters datacenters = cloud.datacenter().listDatacenters(10, 1, OrderBy.EMPTY);

NetworkDomains networkDomains = cloud.networkDomain().listNetworkDomains(10, 1, OrderBy.EMPTY, new Filter(
    new Param("datacenterId", "EU7")
));
```

### Javascript Example
Using Oracle Nashorn, a Javascript interpreter included in Java 8, is easy to create executable scripts
to configure the DimensionData Cloud. Nashorn has also a shell that can be used to execute the
same commands on the fly.

The following is an example of a script that prints all the datacenters and then the
network domains of a specific datacenter:
```javascript
#!/usr/bin/env jjs -scripting -J-Djava.class.path=dimensiondata-cloud-api-2.1.1-SNAPSHOT-jar-with-dependencies.jar

var DimensionData = new JavaImporter(
  com.dimensiondata.cloud.client,
  com.dimensiondata.cloud.client.http,
  com.dimensiondata.cloud.client.model
);

with (DimensionData) {
  UserSession.set(new User("my-org-id", "username", "password"));

  var cloud = new CloudImpl(DimensionDataPublicCaas.EU);

  var datacenters = cloud.datacenter().listDatacenters(10, 1, OrderBy.EMPTY).getDatacenter();
  datacenters.forEach(function(i) { print("Datacenter: " + i.getId()); });

  var networkDomains = cloud.networkDomain().listNetworkDomains(10, 1, OrderBy.EMPTY, new Filter(
    new Param("datacenterId", "EU7"))).getNetworkDomain();
  networkDomains.forEach(function(i) { print("NetworkDomain: " + i.getName()); });
}
```
To execute a script on the command line (jjs executable is included in Java 8):
```bash
jjs -J-Djava.class.path=dimensiondata-cloud-api-2.1.0-jar-with-dependencies.jar my-script.js
```
The Jar that include all the dependencies can be downloaded from the Release Page:
https://github.com/DimensionDataIreland/dimensiondata-cloud-api/releases/download/2.1.0/dimensiondata-cloud-api-2.1.0-jar-with-dependencies.jar

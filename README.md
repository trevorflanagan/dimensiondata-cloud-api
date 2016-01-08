## Java Client for DimensionData Cloud API 2.1.0

### API Documentation
https://community.opsourcecloud.net/Browse.jsp?id=e5b1a66815188ad439f76183b401f026

### Maven configuration
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

### Example
```java
UserSession.set(new User("my-org-id", "username", "password"));

Cloud cloud = new CloudImpl(DimensionDataPublicCaas.EU);

Datacenters datacenters = cloud.datacenter().listDatacenters(10, 1, OrderBy.EMPTY);

NetworkDomains networkDomains = cloud.networkDomain().listNetworkDomains(10, 1, OrderBy.EMPTY, new Filter(
    new Param("id", "EU7")
));
```
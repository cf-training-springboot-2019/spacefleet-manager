# spacefleet-manager
[![License](https://img.shields.io/github/license/cf-training-springboot-2019/spacefleet-manager)](https://github.com/cf-training-springboot-2019/y/blob/master/LICENSE)

A small Spring microservice aimed towards both governance, management and operational tasks applied towards for the various space fleet resources within the Spaceover platform.
The application uses Spring Boot parent bom version 2.4.5 as its foundation.

## Terminology
| Name | Description |
|:----------:|:-------------|
| SpaceFleet | A service managed model entity that retains various information associated with a space fleet. Each space fleet is constituted by various spaceships |


## Operations
| Name | Description |
|:----------:|:-------------|
| getSpaceFleets | Synchronous operation that allows the retrieval of multiples persisted space fleet resource entries. |
| getSpaceFleet |  Synchronous operation that allows the retrieval of a single persisted space fleet resource entry. |
| createSpaceFleet |  Synchronous operation that allows the persistence of a single space fleet resource entry. |
| updateSpaceFleet| Synchronous operation that allows the update of a single space fleet persisted resource entry. |
| deleteSpaceFleet | Synchronous operation that allows the removal of a single space fleet persisted resource entry. |

## Getting Started 

To quickly run the application simply execute spring-boot mvn plugin's **run** goal. This action most be performed from the project's root directory by using the following command in a terminal of your choosing.
```
mvn spring-boot:run
```

An alternative method would be through the creation of an OCI image by executing the plugin's build-image goal.
This image can then be used to run a standalone docker container by using the following command sequence 
```
mvn spring-boot:build-image
docker run -d --name [container-name] -p 8080:8080 ${docker.registry}/${project.artifactId}:v${project.version}
```

## Structure
Here are the services beans and relationship:

```mermaid
graph LR
A[SpaceFleetController] --> B1(SpaceFleetService)
A --> B2(SpaceShipClientService)
B1 --> C1(SpaceFleetRepository)
```

# Microservices

## Technologies
Java 8, Spring Netflix Eureka, Zuul, Ribbon

## Setup
Clone all 3 projects.  <br/>

Step 1: Start Eureka server<br/>
Step 2: Start Zuul <br/>
Step 3: Start countries service  <br/>
Step 4: Modify countries-service change port and start new instance (2 instances will be registered with Eureka) <br/>


Eureka Server url <br/>
http://localhost:8761/  <br/>

Zuul Server url <br/>
http://localhost:9000/ <br/>
http://localhost:9000/actuator <br/>
http://localhost:9000/actuator/info  <br/>
http://localhost:9000/actuator/health <br/>

## How to test
Hit Country Service url using Zuul  <br/>
http://localhost:9000/countries-service  <br/> 

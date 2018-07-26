# Microservices using Spring Cloud and Dockers
*************************************************

Follow below instructions to create docker images and containers.

<B>Windows:-</B><Br>
	1.Download and install docker from https://docs.docker.com/toolbox/toolbox_install_windows/.
		Create new folders in Users directory as shown below.
		
			C:\Users\{username}\eureka\
			C:\Users\{username}\zuul-api\
			C:\Users\{username}\order\
			C:\Users\{username}\customer\
			C:\Users\{username}\composer\
	
# Eureka Naming Service:-
	Build "netflix-eureka-naming-service" service using ---> gradlew clean build
	copy jar file from build/libs to  C:\Users\{username}\eureka\
	copy Docker file from root directory of application to C:\Users\{username}\eureka\
	Run "Docker Quickstart Terminal" shortcut is available on Desktop. 
	Navigate to C:\Users\{username}\eureka\
	Run below commands.
		docker build -t netflix-eureka-naming-server-image .
		docker run -d -p 8085:8085 netflix-eureka-naming-server-image eureka-naming
	URL --> http://192.168.99.100:8085/ 

# Netflix Zuul Service:-
	Build "netflix-zuul-api-gateway-server" service using ---> gradlew clean build  
	copy jar file from build/libs to  C:\Users\{username}\zuul-api\
	copy Docker file from root directory of application to C:\Users\{username}\zuul-api\
	Run "Docker Quickstart Terminal" shortcut is available on Desktop. 
	Navigate to C:\Users\{username}\zuul-api\
	Run below commands.
		docker build -t netflix-zuul-api-gateway-server-image .
		docker run -d -p 8086:8086 netflix-zuul-api-gateway-server-image zuul-api
	URL --> http://192.168.99.100:8086/

# Order service:-
	Build "order-service" service using ---> gradlew clean build
	copy jar file from build/libs to  C:\Users\{username}\order\
	copy Docker file from root directory of application to C:\Users\{username}\order\
	Run "Docker Quickstart Terminal" shortcut is available on Desktop. 
	Navigate to C:\Users\{username}\order\
	Run below commands.
		docker build -t order-service-image .
		docker run -d -p 8083:8083 order-service-image order-service
	URL --> http://192.168.99.100:8083/orders 

# Customer service:- 
	Build "customer-service" service using ---> gradlew clean build
	copy jar file from build/libs to  C:\Users\{username}\customer\
	copy Docker file from root directory of application to C:\Users\{username}\customer\
	Run "Docker Quickstart Terminal" shortcut is available on Desktop. 
	Navigate to C:\Users\{username}\customer\
	Run below commands.
		docker build -t customer-service-image .
		docker run -d -p 8080:8080 customer-service-image customer-service
	URL --> http://192.168.99.100:8080/customers 

Invoke order and customer services directly using below URLs. 
	http://192.168.99.100:8083/orders 
	http://192.168.99.100:8080/customers 
	

Invoke order and customer services Via API Gateway 
	http://192.168.99.100:8086/customer-service/customers
	http://192.168.99.100:8086/order-service/orders
	
# DockerComposer
Above instructions to run docker images to run individually. We can run all docker images together using docker-compose. In order to do that we have to stop and remove the containers.

   1. copy DockerComposer\docker-compose.yml to C:\Users\{username}\composer</br>
   2. Run "Docker Quickstart Terminal" shortcut is available on Desktop</br>
   3. docker stop $(docker ps -a -q)</br>
   4. docker rm $(docker ps -a -q)</br>
   5. Navigate to C:\Users\{username}\composer\</br>
   6. docker-compose -f  docker-compose.yml  up -d</br>

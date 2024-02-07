
## Key Features

**Microservice Architecture:**

* **Two Main Microservices:**
    * **Quiz:** Manages quiz operations (creation, modification, retrieval, etc.).
    *  **Question:** Handles question-related actions (adding, editing, fetching, etc.).
* **Independent Deployment:** Each microservice is individually deployable and scalable, promoting agility and resilience.
* **Interconnected Communication:** Services interact seamlessly via **Open Feign** for robust message exchange.

**Service Discovery and Registry:**

* **Eureka Client and Server:**
    * Microservices register themselves with a central Eureka server.
    * Clients locate other services dynamically, simplifying service discovery.
* **Flexible and Dynamic:** Eureka ensures microservices can find each other even if their locations change.

**API Gateway:**

* **Spring Cloud Gateway:**
    * Acts as a single entry point for client requests.
    * Routes requests to appropriate microservices based on paths or other criteria.
    * **Enhanced Security:** Implements security and access control mechanisms to protect your services.
* **Streamlined Client Interaction:** Clients only need to interact with the gateway, simplifying communication and reducing complexity.


## Overall Architecture
![image](https://github.com/Sagar-Chowdhury/Microservices/assets/76145064/8d6cbb8f-5223-4f72-a19a-6467e8bf1495)




## Eureka Server and Client Architecture
![image](https://github.com/Sagar-Chowdhury/Microservices/assets/76145064/c3d654ff-4009-47e9-a72c-fb1e102fc027)

## Api Gateway in action
![image](https://github.com/Sagar-Chowdhury/Microservices/assets/76145064/01fbf72b-7b72-4f74-8353-404da29a8d45)



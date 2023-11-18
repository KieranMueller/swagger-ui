# How to run
- Clone the project, build with Maven
- There are two controllers, cats and dogs
- To hit these controllers, the URIs are
    - http://localhost:8081/cats
    - http://localhost:8081/dogs
- The point of this application is to demonstrate automated API documentation using OpenAPI
- Navigate to http://localhost:8081/swagger-ui/index.html#/ to view the generated documentation
- Navigate to http://localhost:8081/v3/api-docs for the raw JSON documentation

# How to replicate
- Simply add the dependency (check for newer version)
  - groupId: org.springdoc
  - artifactId: springdoc-openapi-starter-webmvc-ui
  - version: 2.2.0
- Create your REST API and visit the provided endpoints
    - /swagger-ui/index.html
    - /v3/api-docs
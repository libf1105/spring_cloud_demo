r# micro-service-demo
Shared a mico-service demo for firends.

last updated by 8/25/2017 

This demo includes features as below:
1. a eureka server which can register or discover micro-services dynamically.
2. a distribted config server holds all the configuration of other micro-services.
3. a zuul server which can be the proxy supports dynamic routes.
4. a feignclient call sample with test case.
5. hystrix enaled and provides status monitoring of circuit breakers.
6. a hystrix dashboard demo.
7. intergrated spring security with zuul proxy.
8. intergrated zipkin embed with sleuth supports micro-service call tracing.
9. a zipkin dashboard demo.
10. other functions in constructing...

demo project start up orders:
1. eureka-server (must wait for completed startup)
2. config-server (must wait for completed startup)
3. other services (can startup synchronously)

when all projects startup successfuly, simple visit url address as below:

http://localhost:8080/

the username and password is user/user

enjoy!

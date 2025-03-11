# Java Persistence API

To run the project: 

```shell
mvn clean spring-boot:run 
```

After you've made changes, you must restart the project. If you use IntelliJ, simply rebuilding the project 
(Build -> Build Project) will trigger an automatic reload. 

# Exercise 1 - List the longest movies

If you visit http://localhost:8080/movies you should see a list of every Star Wars movie. This list is generated
by the `MovieController` class, which in turn uses `MovieRepository` to query the database. 

:pencil2: Add a method to `MovieRepository` that lists the 10 movies with the longest runtime. 


# Exercise 2 - Show the director


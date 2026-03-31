# Exercise 8 - Directors

In this exercise, we'll navigate JPA relationships in the opposite direction and write a more advanced native SQL query with joins.

You will learn to:

- Navigate entity relationships to extract specific data
- Write native SQL queries with `JOIN` in a Spring Data repository

## 8.1 Show a list of movies a person has directed

:book: You can navigate the `casts` relationship the other way, too. In `Person` there is a method called `getMoviesDirected()`.

:pencil2: Implement the `Person.getMoviesDirected()` method by iterating through the person's `casts` list and returning a list of movies where the person was the director. Then, display the list of movies on the director's detail page.

## 8.2 Show a list of directors

:book: You've tried iterating through a list of casts to find directors, but in order to find all directors in this manner, you would have to iterate through all people (or all movies) and look at all their casts. This is a task better left to the database.

In the `PersonRepository`, there is a method called `findAllDirectors()` which has a SQL query.

:pencil2: Modify this query so that it joins the `people`, `casts` and `jobs` tables and returns only the people who have directed at least one movie.

> :exclamation: This is a long list, so be sure to add `LIMIT 100` to avoid fetching a lot of rows!

### [:arrow_left: Back to exercise list](../README.md)

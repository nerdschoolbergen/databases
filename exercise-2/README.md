# Exercise 2 - Basic SQL Queries

In this exercise, we'll learn the fundamentals of querying data with SQL using `SELECT`, `FROM`, and `WHERE`.

You will learn to:

- Retrieve all rows and columns from a table
- Select specific columns
- Filter rows using `WHERE`

## 2.1 Your first query

:book: In SQL, basic queries follow this form:

```postgresql
SELECT [columns]
FROM [table]
WHERE [condition];
```

The `SELECT` part is a comma separated list of columns from the table you want to retrieve. To get all columns, you can use `*` instead of the column names. The `FROM` part specifies which table you want to get data from. Lastly, `WHERE` is used to filter which rows you want to retrieve. To get all rows, simply omit the `WHERE` part.

:pencil2: Write a query that returns all rows and columns in the `movies` table. Browse the results and familiarize yourself with the contents of the table.

<details>
<summary>Hint</summary>

To get all columns, use `*` in the `SELECT` part. You don't need a `WHERE` clause if you want all rows.

</details>

<details>
<summary>Solution</summary>

```postgresql
SELECT *
FROM movies;
```

</details>

## 2.2 Selecting specific columns

:book: Tables typically contain a lot of columns. If you only want to display a few of them in your app, it is wasteful to select all the columns. It also adds to the time it takes to transfer the data from the database server to your app.

:pencil2: Write a query that retrieves the `name`, `date` and `kind` of movies. Browse through the results and look at the different kinds.

<details>
<summary>Hint</summary>

Instead of `*`, list the column names you want separated by commas: `SELECT column1, column2, column3 FROM ...`

</details>

<details>
<summary>Solution</summary>

```postgresql
SELECT name, date, kind
FROM movies;
```

</details>

## 2.3 Filtering results with `WHERE`

:book: It turns out the `movies` table contains not only movies, but also the names of series and their seasons, episodes of those series and even series of movies like "Home alone" 1, 2 and 3.

:pencil2: Write a query that retrieves all series. 

:bulb: [Tutorial: The WHERE statement](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/)

<details>
<summary>Hint</summary>

Use `WHERE kind = '...'` to filter by the `kind` column. Look at the results from exercise 2.2 to find the correct value for series.

</details>

<details>
<summary>Solution</summary>

```postgresql
SELECT *
FROM movies
WHERE kind = 'series';
```

</details>

### [Go to exercise 3 :arrow_right:](../exercise-3/README.md)

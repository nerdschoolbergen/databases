# Exercise 4 - Pattern Matching and Sorting

In this exercise, we'll learn how to search for partial text matches using `LIKE` and how to control the order of results with `ORDER BY`.

You will learn to:

- Use `LIKE` with wildcards for substring matching
- Handle case-insensitive searches
- Sort query results in ascending and descending order

## 4.1 Substring matching with `LIKE`

:book: There seems to be a lot of different Star Trek series, with different names such as 'Star Trek: The Next Generation' and 'Star Trek: Deep Space Nine'. To find all series that have the words 'Star Trek' in them, you can use the `LIKE` operator instead of the equals sign. This allows you to use wildcards in your queries. To match any sequence of characters, use the `%` sign:

```postgresql
SELECT *
FROM foo
WHERE bar LIKE '%baz%';
```

> :exclamation: `LIKE` is case sensitive. If you want to match text case insensitively, first convert the column to lower case:

```postgresql
SELECT *
FROM foo
WHERE lower(bar) LIKE '%baz%';
```

The conversion is done during query execution, and does not affect the stored data in the table.

:pencil2: Find all the different Star Trek series.

:book: Wildcards (`%`) can also be used in between words in your filter, to let you find values that start and end with given values:

```postgresql
SELECT *
FROM foo
WHERE bar LIKE 'baz%zoo';
```

:pencil2: Find how many people have John as their first name, and Scott as their last name.

:bulb: [Tutorial: The LIKE operator](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-like/)

## 4.2 Sorting data with `ORDER BY`

:book: You may have noticed that the rows are returned in a seemingly random order. This is because we haven't specified which order we want them in, and Postgres simply returns them as it stumbles upon them. If you want the data in a particular order, you must use the `ORDER BY` statement:

```postgresql
SELECT *
FROM foo
ORDER BY bar ASC;
```

The `ASC` part tells Postgres that we want the results ordered by the value of the `bar` column in ascending order, which by the way is the default. If we want them in descending order instead, use `DESC`.

:pencil2: Sort the Star Trek series by date, first in ascending then in descending order.

### [Go to exercise 5 :arrow_right:](../exercise-5/README.md)

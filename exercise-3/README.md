# Exercise 3 - Modifying Data

In this exercise, we'll learn how to add, change, and remove data in the database using `INSERT`, `UPDATE`, and `DELETE`.

You will learn to:

- Insert new rows into a table
- Update existing rows
- Delete rows from a table

## 3.1 Inserting data with `INSERT`

:book: Retrieving data is fine, but how do you get the data into the database in the first place? That's where the `INSERT` statement comes into play:

```postgresql
INSERT INTO car(license_plate, model)
VALUES('AB 12345', 'Toyota Avensis');
```

:pencil2: Insert your name into the `people` table. Make sure you select an `id` that's not already taken.

<details>
<summary>Hint</summary>

The `people` table has the required columns `id` and `name`. You need to specify both of them in the `INSERT` statement.

</details>

<details>
<summary>Solution</summary>

```postgresql
INSERT INTO people(id, name)
VALUES(9999999, 'Your Name');
```

</details>

## 3.2 Updating data with `UPDATE`

:book: If you want to change a row that's already in the database, you need to use the `UPDATE` statement:

```postgresql
UPDATE car
    SET model = 'Nissan Leaf'
WHERE license_plate = 'AB 12345';
```

> :exclamation: The `WHERE` part is very important. If you leave it out, the database will happily change every single row in the table.

:pencil2: Change your name in the `people` table using the `id` you provided in the `WHERE` part.

<details>
<summary>Hint</summary>

Use `SET name = '...'` and make sure to include `WHERE id = ...` with the id you used in 3.1.

</details>

<details>
<summary>Solution</summary>

```postgresql
UPDATE people
    SET name = 'New Name'
WHERE id = 9999999;
```

</details>

## 3.3 Deleting rows with `DELETE`

:book: To remove data from the database, you use the `DELETE` statement:

```postgresql
DELETE FROM car
WHERE license_plate = 'AB 12345';
```

:pencil2: Delete yourself from the `people` table.

<details>
<summary>Hint</summary>

Use `DELETE FROM people WHERE id = ...` with the id you used when inserting.

</details>

<details>
<summary>Solution</summary>

```postgresql
DELETE FROM people
WHERE id = 9999999;
```

</details>

### [Go to exercise 4 :arrow_right:](../exercise-4/README.md)

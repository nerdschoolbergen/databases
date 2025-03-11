<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>

<table class="table table-striped">
    <thead>

    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Runtime</th>
        <th>Release date</th>
        <th>Director</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="movie" items="${movies}">

        <tr>
            <td>${movie.id}</td>
            <td>${movie.name}</td>
            <td>${movie.runtime}</td>
            <td>${movie.date}</td>
            <td>
                <a href="/person/${movie.director.id}">
                        ${movie.director.name}
                </a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>

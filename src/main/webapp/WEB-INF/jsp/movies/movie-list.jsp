<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tags:layout>

    <h1>Movies</h1>

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
                <td><a href="/movies/${movie.id}">${movie.id}</a></td>
                <td><a href="/movies/${movie.id}">${movie.name}</a></td>
                <td>${movie.homepage}</td>
                <td>${movie.runtime}</td>
                <td>${movie.date}</td>
                <td>
                    <a href="/directors/${movie.director.id}">
                            ${movie.director.name}
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</tags:layout>


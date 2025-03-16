<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:layout>

    <h1>${movie.name}</h1>

    <h2>Cast</h2>
    <table class="table table-striped">
        <thead>

        <tr>
            <th>Name</th>
            <th>Role</th>
            <th>Job</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="cast" items="${movie.casts}">

            <tr>
                <td>${cast.person.name}</td>
                <td>${cast.role}</td>
                <td>${cast.job.name}</td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
</tags:layout>


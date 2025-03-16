<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="no.nerdschool.database.utils.WikidataClient"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:layout>
    <h1>${director.name}</h1>

    <div>
        <img src='${director.image}' class="shadow"/>
    </div>

    Birthday: ${director.birthday}


    <h2 class="mt-3">Movies directed</h2>

    <table class="table table-striped">
        <thead>

        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Runtime</th>
            <th>Release date</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="movie" items="${director.moviesDirected}">

            <tr>
                <td><a href="/movies/${movie.id}">${movie.id}</a></td>
                <td><a href="/movies/${movie.id}">${movie.name}</a></td>
                <td>${movie.runtime}</td>
                <td>${movie.date}</td>
            </tr>

        </c:forEach>
        </tbody>
    </table>


</tags:layout>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:layout>

    <h1>Directors</h1>

    <table class="table table-striped">
        <thead>

        <tr>
            <th>Id</th>
            <th>Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="director" items="${directors}">
            <tr>
                <td>${director.id}</td>
                <td>
                    <a href="/directors/${director.id}">${director.name}</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</tags:layout>


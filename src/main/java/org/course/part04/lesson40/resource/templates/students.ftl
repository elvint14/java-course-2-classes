<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h1>Hello, ${username}</h1>

<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>SURNAME</td>
        <td>AGE</td>
        <td>GROUP</td>
    </tr>
    </thead>
    <tbody>
    <#list students as student>
        <tr>
            <td>${student.getId()}</td>
            <td>${student.getName()}</td>
            <td>${student.getSurname()}</td>
            <td>${student.getAge()}</td>
            <td>${student.getGroup()}</td>
        </tr>
    </#list>
    </tbody>
</table>

</body>
</html>
<%@ page language="java" %>

<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
</head>
<body> <!-- ✅ Corrected placement -->

    <h2>Welcome User</h2>

    <form action="addUser" method="get"> <!-- Optional: specify method explicitly -->
        <label for="aid">Enter ID:</label>
        <input type="text" id="aid" name="aid"><br>

        <label for="aName">Enter Name:</label>
        <input type="text" id="aName" name="aName"><br>

        <label for="courseName">Enter Course:</label>
        <input type="text" id="courseName" name="courseName"><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>

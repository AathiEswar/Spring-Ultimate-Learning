<%@ page isELIgnored="false" %>
<html>
    <head>
        <title> THis is from JSP</title>
    </head>
    <body>
      <form method="post">
        User Login Page :
        Name : <input type="text" name="name" />
        Password : <input type="password" name="password" />
        <button type="submit" > Submit </button>
      </form>
          <pre> ${error} </pre>
    </body>
</html>

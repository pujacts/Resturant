<%@ page contentType="text/html; charset = UTF-8" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<html>
   <head>
      <title>File Upload Example</title>
   </head>
    <h2>Error while uploading please try again</h2>
   <body>
   <form:form method="POST" action="fileUploadPage" enctype="multipart/form-data" modelAttribute="fileUploadModel">
        File to Upload: <input type="file" name="file"></br> </br>
        <input type="submit" value="Upload" /></br>
        <form:errors path="file" style="color:red;"/>
 </form:form>
   </body>
</html>
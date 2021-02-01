<%--
  Created by IntelliJ IDEA.
  User: Dat Bong
  Date: 2/1/2021
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Product Calculator</h1>
  <form method="post" action="/display-discount">
    <label>Product Description</label><br/>
    <input type="text" placeholder="Description"><br/>
    <label>List Price</label><br/>
    <input type="text" name="price" placeholder="Price"><br/>
    <label>Discount Percent</label><br/>
    <input type="text" name="percent" placeholder="Percent"><br/>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>

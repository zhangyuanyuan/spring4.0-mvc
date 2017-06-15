<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>convert page</title>
</head>
<body>
<div id="resp"></div>
<input type="button" onclick="req();" value="请求"/>
<script src="/assets/js/jquery.min.js" ></script>
<script>
    function req() {
        $.ajax({
            url: "convert",
            data: "1-haha",
            type: "post",
            contentType: "application/x-wisely",
            success: function(data) {
                $("#resp").html(data);
            }
        });
    }
</script>
</body>
</html>
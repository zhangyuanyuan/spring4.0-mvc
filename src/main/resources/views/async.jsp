<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>sse demo</title>
</head>
<body>
<script src="/assets/js/jquery.min.js" ></script>
<script>
    deferred();

    function deferred() {
        $.get('defer', function(data){
            console.log(data);
            deferred();
        })
    }
</script>
</body>
</html>
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
<div id="msgFromPush"></div>
<script src="/assets/js/jquery.min.js" ></script>
<script>
    //EventSource   sse方式的客户端
    if (!!window.EventSource) {
        var source = new EventSource('push');
        var s = '';
        source.addEventListener("message", function(e) {
            s += e.data + "<br/>"
            $("#msgFromPush").html(s);
        });

        source.addEventListener("open", function(e) {
            console.log("链接打开~~");
        }, false);

        source.addEventListener("error", function(e) {
            if (e.readyState == EventSource.ClOSED) {
                console.log("链接关闭~~");
            } else {
                console.log(e.readyState);
            }
        }, false);
    } else {
        console.log("您的浏览器不支持sse")
    }
</script>
</body>
</html>
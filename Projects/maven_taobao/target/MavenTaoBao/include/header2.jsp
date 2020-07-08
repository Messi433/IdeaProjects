<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/6/4
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script src="js/jquery/2.0.0/jquery.min.js"></script>
<script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
<link href="css/fore/style.css" rel="stylesheet">
<link href="css/style2.css" rel="stylesheet">
<script>

    function checkEmpty(id, name){
        var value = $("#"+id).val();
        if(value.length==0){

            $("#"+id)[0].focus();
            return false;
        }
        return true;
    }


    $(function(){


        $("a.productDetailTopReviewLink").click(function(){
            $("div.productReviewDiv").show();
            $("div.productDetailDiv").hide();
        });
        $("a.productReviewTopPartSelectedLink").click(function(){
            $("div.productReviewDiv").hide();
            $("div.productDetailDiv").show();
        });

        $("span.leaveMessageTextareaSpan").hide();
        $("img.leaveMessageImg").click(function(){

            $(this).hide();
            $("span.leaveMessageTextareaSpan").show();
            $("div.orderItemSumDiv").css("height","100px");
        });

        $("div#footer a[href$=#nowhere]").click(function(){
            alert("模仿天猫的连接，并没有跳转到实际的页面");
        });


        $("a.wangwanglink").click(function(){
            alert("模仿旺旺的图标，并不会打开旺旺");
        });
        $("a.notImplementLink").click(function(){
            alert("这个功能没做，蛤蛤~");
        });


    });

</script>




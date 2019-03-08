<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>hello</title>
</head>
<body>
<center>
    <div id="lotteryDiv" status="off" align="center" style="font-size:50px;line-height:200px;background-color: honeydew;width:200px;height:200px;border-radius:50%;border:solid rgb(100,100,100) 1px;"></div>
    <br>
    <div id="options">
        <input type="text" class="option" value="白胖子" >&nbsp;&nbsp;&nbsp;
        <input type="text" class="option" value="黑胖子" >&nbsp;&nbsp;&nbsp;
        <input type="text" class="option" value="红胖子" >&nbsp;&nbsp;&nbsp;
        <input type="text" class="option" value="黄胖子" >&nbsp;&nbsp;&nbsp;
        <input type="text" class="option" value="紫胖子" >&nbsp;&nbsp;&nbsp;
        <input type="text" class="option" value="蓝胖子" >&nbsp;&nbsp;&nbsp;
        <input type="text" class="option" value="彩胖子" >&nbsp;&nbsp;&nbsp;
    </div>
    <br>
    <button id="startLottery">开始</button>
    <button id="addItem" onclick="appendOption()">增加</button>
</center>
    <script>
        $(function(){
            $ ('#startLottery').click (function (){
                if ($ ('#lotteryDiv').attr ("status") == "off"){
                    $ ('#lotteryDiv').attr ('status', 'on');
                    $ ('#startLottery').html("结束");
                    pushArray();
                    startLottery();
                }else if ($ ('#lotteryDiv').attr ("status") == "on"){
                    $ ('#lotteryDiv').attr ('status', 'off');
                    $ ('#startLottery').html("开始");
                    finishLottery();
                }
            });
        });
        var t;
        var oriIndex = 0;
        var value = [];
        function startLottery() {
            var r = rnd( 0 , value.length - 1);
            if( r != oriIndex ){
                $("#lotteryDiv").html(value[r]);
                oriIndex = r;
                t = setTimeout("startLottery()",100);
            } else {
                startLottery();
            }
        }
        function finishLottery() {
            clearTimeout(t);
            alert( "恭喜" + $("#lotteryDiv").html() + "中奖！" )
        }
        function rnd(n, m){
            var random = Math.floor(Math.random()*(m-n+1)+n);
            return random;
        }
        function appendOption() {
           $("#options").append('<input style="type="text" class="option" value="" >&nbsp;&nbsp;&nbsp;');
        }
        function pushArray(){
           $(".option").each(function(){
               if($(this).val() != null && $(this).val() != "" && $(this).val() != undefined ){
                   value.push($(this).val());
               }
           })
        }
    </script>
</body>
</html>
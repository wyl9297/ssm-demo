<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/11
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    .upload_button {
        width: 55px;
        height: 25px;
        display: inline;
        position: absolute;
        overflow: hidden;
    }
</style>
<head>
    <title>ajaxUpload</title>
</head>
<body>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/ajaxfileupload.js"></script>
    <form id="importPurchasingGoodsForm">
        <p><input type="file" id="excelFile" name="excelFile" /></p>
        <input type="button" id="uploadBtn" value="上传" />
    </form>
    <script type="text/javascript">
        $(function(){
            $("#uploadBtn").click(function(){
                $.ajaxFileUpload({
                        url: "importExcel.htm",
                        type: 'post',
                        secureuri: false,
                        data: {},
                        //
                        fileElementId: 'excelFile',
                        // 上传文件的id、name属性名
                        dataType: 'json',
                        success:function (data, status) {
                        },
                        error:function (data,status,e) {
                           console.log(e);
                        }
                    }
                )
            });
        })
    </script>
</body>
</html>

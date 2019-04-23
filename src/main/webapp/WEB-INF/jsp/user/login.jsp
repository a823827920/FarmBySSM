<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/15
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/register.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/login.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/layui/layui.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script>
        $(document).ready(function() {
            $("#submit").click(function(){
                $("#sub").click();
            });
            layui.use(['layer','form'], function() {
                var layer = layui.layer;
                var form=layui.form;
                var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                //parent.layer.iframeAuto(index) ;//高度自适应,经测试并他么没什么用
                $("#other_login2").click(function() {
                    parent.layer.iframeSrc(index, '${pageContext.request.contextPath}/user/login_email');//记得要加parent

                })
                $("#toregister").click(function() {
                    parent.layer.style(index,{width:'570px',height: '300px'});
                    parent.layer.iframeSrc(index, '${pageContext.request.contextPath}/user/register');//记得要加parent

                })
                form.on('submit(formDemo)', function(data) {
                    //layer.msg(JSON.stringify(data.field));
                    var info=$("#checkCode").html();
                    $.ajax({
                        url:"${pageContext.request.contextPath}/user/loginTel",
                        type:"post",
                        data: JSON.stringify(data.field),
                        contentType: 'application/json',
                        success:function (data) {
                            if(data>=1&&info==""){
                                var index = parent.layer.getFrameIndex(window.name);
                                parent.layer.close(index);
                                parent.location.href="${pageContext.request.contextPath}/index";
                            }
                        }
                    })
                    return false;
                });
            });
        });
    </script>
</head>
<body>
<div class="container">
    <div class="title">
        <span>登录云种田</span>
        <span>还没有账号？<label id="toregister">注册</label></span>
    </div>
    <div class="email_register" id="other_login2"><img src="${pageContext.request.contextPath}/statics/image/email.png" />邮箱登录</div>
    <br>
    <hr>
    <br>
    <form id="form" action="" class="layui-form">
        <input required="required" type="tel" id="tel" name="userTel" placeholder="手机号" />
        <div>
            <input required="required" id="code" type="text" placeholder="验证码" />
            <p id="checkCode" style="top:303px"></p>
            <div class="btn" id="send">发送验证码</div>
            <input type="submit" id="sub" lay-submit lay-filter='formDemo' style="display:none;" />
        </div>
    </form>
    <div class="tel_register" id="submit"><img src="${pageContext.request.contextPath}/statics/image/tel.png" />登录</div>
</div>
<script>
    $("#send").click(function () {
        var tel=$("#tel").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/user/sendMessage",
            type: "get",
            data:{
                tel:tel
            },
            success:function () {
                $("#send").html("发送成功");
            }
        })
    })
    $("#code").keyup(function () {
        var code=this.value;
        $.ajax({
            url:"${pageContext.request.contextPath}/user/submit",
            type:"get",
            data:{
                code:code
            },
            success:function (data) {
                if(data==0){
                    $("#checkCode").html("验证码有误");
                }else{
                    $("#checkCode").html("");
                }
            }
        })
    })
</script>
</body>
</html>

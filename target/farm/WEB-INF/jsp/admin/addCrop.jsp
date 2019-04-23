<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/17
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css"  media="all">
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js" charset="utf-8"></script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title ">
    <legend><li id="icon" class="layui-icon layui-icon-face-smile layui-anim layui-anim-rotate " style="font-size: 30px; color: #1E9FFF;" data-anim="layui-anim-rotate"></li> <span style="font-size: 8px">我在等风，也在等你</span></legend>
    <br>
    <div class="layui-field-box" style="width: 97%">
        <form class="layui-form" action="" method="get">
            <div class="layui-form-item">
                <label class="layui-form-label">土地ID  :</label>
                <div class="layui-input-block">
                    <input type="text" id="fieldId" lay-verify="number"  autocomplete="off"  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">植物ID  :</label>
                <div class="layui-input-block">
                    <input type="text" id="plantId" name="plantId"  disabled="disabled"  autocomplete="off"  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">作物名称  :</label>
                <div class="layui-input-block">
                    <input type="text" id="plantName" disabled="disabled"  autocomplete="off"  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">用户ID  :</label>
                <div class="layui-input-block">
                    <input type="text" id="userId" name="userId" disabled="disabled"  autocomplete="off"  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">用户名  :</label>
                <div class="layui-input-block">
                    <input type="text" id="userName" disabled="disabled"  autocomplete="off"  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">作物重量（kg）:</label>
                <div class="layui-input-block">
                    <input type="text" name="cropWeight" lay-verify="number" autocomplete="off"  class="layui-input">
                </div>
            </div>
            <br><br>
            <div class="layui-form-item">
                <div class="layui-input-block" >
                    <button class="layui-btn" lay-submit="" lay-filter="formDemo">立即提交</button>
                </div>
            </div>
        </form>
    </div>

</fieldset>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>

    layui.use(['form'], function(){
        var form = layui.form;
        //注意：parent 是 JS 自带的全局对象，可用于操作父页面
        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
        //监听提交
        form.on('submit(formDemo)', function(data){
            var $=layui.$;
            $.ajax({
                url: '${pageContext.request.contextPath}/admin/crop',
                type: 'post',
                async:false,
                contentType:'application/json',
                data: JSON.stringify(data.field),
                success: function(result){
                    if(result=='1'){
                        layer.msg('操作成功....', {icon: 6});
                        setTimeout(function(){
                            parent.layer.close(index);
                            parent.layui.table.reload('demo');
                        }, 1000);
                    }else{
                        layer.msg('操作失败', {icon: 5});
                    }
                } ,
                error: function(){
                    alert("请填写正确的土地ID！");
                },complete: function () {
                    layer.closeAll('loading');
                }
            });
            return false;
        });
        $("#fieldId").keyup(function(){
            var fieldId=$("#fieldId").val();
            $.ajax({
                url:"${pageContext.request.contextPath}/admin/roomitem",
                type:"get",
                data:{
                  fieldId:fieldId
                },
                success:function(data)
                {
                    $("#plantId").val(data.plantId);
                    $("#plantName").val(data.plantName);
                    $("#userId").val(data.userId);
                    $("#userName").val(data.userName);
                }
            })
        })
    });
</script>

</body>
</html>
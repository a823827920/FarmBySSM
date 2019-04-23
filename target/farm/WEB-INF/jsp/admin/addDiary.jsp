<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/15
  Time: 20:35
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
                    <input type="text" name="fieldId" lay-verify="required"  autocomplete="off"  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">植株高度：</label>
                <div class="layui-input-block">
                    <input type="text" name="plantHeight" lay-verify="required" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">土壤情况 ：</label>
                <div class="layui-input-block">
                    <input type="text" name="fieldState" lay-verify="required"  autocomplete="off" class="layui-input">
                </div>

            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">虫害情况 ：</label>
                <div class="layui-input-block">
                    <input type="text" name="insectState" lay-verify="required"  autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">草害情况 ：</label>
                <div class="layui-input-block">
                    <input type="text" name="grassState"  lay-verify="required" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">图片名 ：</label>
                <div class="layui-input-block">
                    <input type="text" name="diaryImg1" id="img1" disabled="disabled"  autocomplete="off" class="layui-input">
                    <input type="text" name="diaryImg2" id="img2" disabled="disabled"  autocomplete="off" class="layui-input">
                    <input type="text" name="diaryImg3" id="img3" disabled="disabled"  autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-upload">
                <button type="button" class="layui-btn" id="test2" style="margin-left:108px;">上传照片</button>
                <blockquote class="layui-elem-quote layui-quote-nm" style="margin-top: 10px;">
                    请上传三张图片：
                    <div class="layui-upload-list" id="demo2"></div>
                </blockquote>
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

    layui.use(['form', 'upload'], function(){
        var form = layui.form
            ,layer = layui.layer;
        //注意：parent 是 JS 自带的全局对象，可用于操作父页面
        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
        //监听提交
        form.on('submit(formDemo)', function(data){
            var $=layui.$;
            $.ajax({
                url: '${pageContext.request.contextPath}/admin/diary',
                type: 'post',
                contentType:'application/json',
                data: JSON.stringify(data.field),
                dataType: 'json',
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
                    alert("网络忙，请稍后重试！");
                },complete: function () {
                    layer.closeAll('loading');
                }
            });
            return false;
        });
        var $ = layui.jquery
            ,upload = layui.upload;

        var i=0;
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test2'
            ,url: '${pageContext.request.contextPath}/file/upload'
            ,multiple: true
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    $('#demo2').append('<img style="width:120px;height:120px;margin-left:10px;" src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img">')
                });
            }
            ,done: function(res){
                if(i==0){$("[id=img1]").val(res.data);i++;}
                else if(i==1){$("[id=img2]").val(res.data);i++;}
                else if(i==2){$("[id=img3]").val(res.data);i=0;}
                //如果上传失败
                if(res.code > 0){
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            ,error: function(){
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function(){
                    uploadInst.upload();
                });
            }
        });
    });
</script>

</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/10
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>城市方寸田-后台管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/admin.css">
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">城市方寸田-后台管理</div>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">种子管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/admin/plants" target="viewDiv">查看种子</a></dd>
                        <dd><a id="add" style="cursor:pointer">新增种子</a></dd>
                        <dd><a id="addCate" style="cursor:pointer">新增类别</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">查看种植请求</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/admin/roomitems" target="viewDiv">查看所有请求</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">植物空间管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/admin/operations" target="viewDiv">查看用户操作</a></dd>
                        <dd><a id="addDiary" style="cursor:pointer">上传种植日记</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/users" target="viewDiv">用户管理</a></li>
                <li class="layui-nav-item"><a id="addCrop" style="cursor:pointer">上传成熟作物</a></li>
                <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/admin/deliverys" target="viewDiv">查看配送请求</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <iframe name="viewDiv" id="viewDiv"  style="width:100%;height:99%;" src="${pageContext.request.contextPath}/admin/plants">
        </iframe>
    </div>


</div>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
    layui.use('layer', function(){
        var $ = layui.jquery
            ,layer = layui.layer //弹层

        $(document).on('click','#add',function(){
            layer.open({ //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type: 2,
                title:"新增种子",
                area: ['470px', '600px'],//类型：String/Array，默认：'auto'  只有在宽高都定义的时候才不会自适应
                fix: false, //不固定
                maxmin: true,//开启最大化最小化按钮
                shadeClose: true,//点击阴影处可关闭
                shade:0.4,//背景灰度
                skin: 'layui-layer-rim', //加上边框
                content: '${pageContext.request.contextPath}/admin/plant',
                // resize:false
            });
        });
        $(document).on('click','#addCate',function(){
            layer.open({ //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type: 2,
                title:"新增类别",
                area: ['470px', '400px'],//类型：String/Array，默认：'auto'  只有在宽高都定义的时候才不会自适应
                fix: false, //不固定
                maxmin: true,//开启最大化最小化按钮
                shadeClose: true,//点击阴影处可关闭
                shade:0.4,//背景灰度
                skin: 'layui-layer-rim', //加上边框
                content: '${pageContext.request.contextPath}/admin/cate/',
                // resize:false
            });
        });
        $(document).on('click','#addDiary',function(){
            layer.open({ //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type: 2,
                title:"上传日记",
                area: ['470px', '600px'],//类型：String/Array，默认：'auto'  只有在宽高都定义的时候才不会自适应
                fix: false, //不固定
                maxmin: true,//开启最大化最小化按钮
                shadeClose: true,//点击阴影处可关闭
                shade:0.4,//背景灰度
                skin: 'layui-layer-rim', //加上边框
                content: '${pageContext.request.contextPath}/admin/diary',
                // resize:false
            });
        });
        $(document).on('click','#addCrop',function(){
            layer.open({ //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type: 2,
                title:"上传成熟作物",
                area: ['470px', '600px'],//类型：String/Array，默认：'auto'  只有在宽高都定义的时候才不会自适应
                fix: false, //不固定
                maxmin: true,//开启最大化最小化按钮
                shadeClose: true,//点击阴影处可关闭
                shade:0.4,//背景灰度
                skin: 'layui-layer-rim', //加上边框
                content: '${pageContext.request.contextPath}/admin/crop',
                // resize:false
            });
        });
    });
</script>
</body>
</html>

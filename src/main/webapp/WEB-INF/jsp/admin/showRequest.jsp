<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/15
  Time: 15:21
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
    <style type="text/css">
        .layui-table-cell{
            height: 100%;
        }
    </style>
</head>
<body>
<table id="demo" lay-filter="demo"></table>
<script type="text/html" id="barDemo">
    {{#  if(d.itemFlag ==1){ }}
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="dealed">已处理</a>
    {{#  } else { }}
    <a class="layui-btn layui-btn-xs layui-btn-warm" lay-event="toDeal">处理</a>
    {{#  } }}
</script>
<script type="text/html" id="flagTpl">
    {{#  if(d.itemFlag ==1){ }}
    <span>已完成</span>
    {{#  } else { }}
    <span>未完成</span>
    {{#  } }}
</script>
<script type="text/html" id="FieldTpl">
    {{#  if(d.fieldId <=0){ }}
    <span>未分配</span>
    {{#  }else{ }}
    <span>{{d.fieldId}}</span>
    {{#  } }}
</script>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 600
            ,limit:10
            ,limits:[10,20,30,40]
            ,url: '${pageContext.request.contextPath}/admin/queryRoomitemsByPage' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'itemId', title: 'ID', width:80, sort: true}
                ,{field: 'plantName', title: '植物名称', width:130,sort:true}
                ,{field: 'fieldId', title: '土地编码', width:80,sort:true,templet: '#FieldTpl'}
                ,{field: 'fieldLoc', title: '土地位置', width:130}
                ,{field: 'itemLoc', title: '用户选择位置', width:130}
                ,{field: 'userId', title: '用户ID', width:80}
                ,{field: 'userName', title: '用户名', width:130}
                ,{field: 'itemDate', title: '最新操作时间'}
                ,{field: 'itemStart', title: '种植时间'}
                ,{field: 'itemFlag', title: '状态', sort:true,width: 80,templet:'#flagTpl'}
                ,{width:180, align:'center', toolbar: '#barDemo'}
            ]]

        });
        //监听工具条
        table.on('tool(demo)', function(obj){
            var data = obj.data;
            var index = layer.getFrameIndex(window.name); //获取窗口索引
            if(obj.event === 'toDeal'){
                var $=layui.$;
                $.ajax({
                    url: '${pageContext.request.contextPath}/admin/roomitem',
                    type: 'post',
                    async:false,
                    contentType: 'application/json',
                    data: JSON.stringify(data),
                    success: function(result){
                        if(result==1){
                            layer.msg('操作成功....', {icon: 6});
                            setTimeout(function(){
                                layer.close(index);
                                layui.table.reload('demo');
                            }, 1000);
                        }else{
                            layer.msg('操作失败', {icon: 5});
                        }
                    } ,
                });
            } else if(obj.event === 'dealed'){
                layer.msg('该订单已处理', {icon: 6});
            }
        });

    });
</script>

</body>
</html>

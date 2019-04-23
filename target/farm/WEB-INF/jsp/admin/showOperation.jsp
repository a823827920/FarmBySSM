<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/15
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css"  media="all">
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
</head>
<body>
<table id="demo" lay-filter="demo"></table>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">处理</a>
</script>
<script type="text/html" id="flagTpl">
    {{#  if(d.operationType ==1){ }}
    <span>修剪</span>
    {{#  } else if(d.operationType==2) { }}
    <span>浇水</span>
    {{#  }else if(d.operationType==3){ }}
    <span>除虫</span>
    {{#  }else if(d.operationType==4){ }}
    <span>除草</span>
    {{#  }else if(d.operationType==5){ }}
    <span>施肥</span>
    {{#  } }}
</script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 600
            ,limit:10
            ,limits:[10,15,20,25,30]
            ,url: '${pageContext.request.contextPath}/admin/operationsPage' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'operationId', title: 'ID', width:80, sort: true}
                ,{field: 'userId', title: '用户ID', width:80}
                ,{field: 'operationType', title: '操作类型', width:180,templet:'#flagTpl'}
                ,{field: 'fieldId', title: '土地ID', width:80,sort:true}
                ,{field: 'operationDate', title: '下达时间',width:180}
                ,{width:180, align:'center', toolbar: '#barDemo'}
            ]]

        });
        //监听工具条
        table.on('tool(demo)', function(obj){
            var data = obj.data;
            var index = layer.getFrameIndex(window.name); //获取窗口索引
            if(obj.event === 'edit'){
                //layer.alert('编辑行：<br>'+ JSON.stringify(data))
                layer.open({
                    type: 2,
                    title: '' +
                        '<li id="icon" class="layui-icon layui-icon-release layui-anim layui-anim-scaleSpring" ' +
                        'style="font-size: 30px; color: #009688;" data-anim="layui-anim-scaleSpring"></li>请上传日记 ',
                    shadeClose: true,
                    shade: false,
                    maxmin: true, //开启最大化最小化按钮
                    area: ['470px', '600px'],//area: [window.screen.width / 2 + 'px', window.screen.height / 2 + 'px'], //宽高
                    content: "${pageContext.request.contextPath}/admin/newDiary",
                    success: function(layero, index){
                        var body = layer.getChildFrame('body',index);//建立父子联系
                        // 获取子页面的iframe
                        var iframe = window['layui-layer-iframe' + index];
                        var inputList = body.find('input');
                        var json=JSON.parse(JSON.stringify(data));
                        for(let d in json){
                            body.find('input[name="'+d+'"][type="text"],[type="hidden"]').val(json[d])
                        }
                    }
                });
            }
        });

    });
</script>

</body>
</html>

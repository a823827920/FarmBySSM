<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/10
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/admin.css"  media="all">
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
</head>
<body>
<table id="demo" lay-filter="demo"></table>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    {{#  if(d.plantFlag ==1){ }}
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">下架</a>
    {{#  } else { }}
    <a class="layui-btn layui-btn-xs layui-btn-warm" lay-event="add">上架</a>
    {{#  } }}
</script>
<script type="text/html" id="cateTpl">
    <span>{{d.cate.cateName}}</span>
</script>
<script type="text/html" id="flagTpl">
    {{#  if(d.plantFlag ==1){ }}
    <span>上架</span>
    {{#  } else { }}
    <span>下架</span>
    {{#  } }}
</script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#demo'
            ,height: 'full'
            ,limit:5
            ,limits:[5,10,15,20,25]
            ,url: '${pageContext.request.contextPath}/admin/plantsPage' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'plantId', title: 'ID', sort: true}
                ,{field: 'plantName', title: '植物名'}
                ,{field: 'plantStock', title: '库存', sort: true}
                ,{field: 'plantSaleprice', title: '售价',sort:true}
                ,{field: 'plantDes', title: '描述',width:200}
                ,{field: 'plantOrderprice', title: '进价', sort: true}
                ,{field: 'cateName', title: '类别', sort:true}
                ,{field: 'plantImg', title: '图片(点击查看大图)',style:'height:100px', templet:function(d){
                        return "<div class='layer-photos-demo' style='cursor:pointer;'><img src='/file/"+d.plantImg+"'></div>";
                    }}
                ,{field: 'plantFlag', title: '状态', sort:true,templet:'#flagTpl'}
                ,{ align:'center', toolbar: '#barDemo'}
            ]]
            ,done: function(res, curr, count) { //表格数据加载完后的事件
                layer.photos({//点击图片弹出
                    photos: '.layer-photos-demo'
                    ,anim: 0 //0-6的选择，指定弹出图片动画类型，默认随机（请注意，3.0之前的版本用shift参数）
                });
            }
        });
        //监听工具条
        table.on('tool(demo)', function(obj){
            var data = obj.data;
            var index = layer.getFrameIndex(window.name); //获取窗口索引
            if(obj.event === 'add'){
                var $=layui.$;
                $.ajax({
                    url: '${pageContext.request.contextPath}/admin/plant/',
                    type: 'post',
                    data: {
                        _method:"put",
                        plantId: data.plantId,
                        plantFlag:1
                    } ,
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
            } else if(obj.event === 'del'){
                layer.confirm('真要下架吗？', function(index){
                    var $=layui.$;
                    $.ajax({
                        url: '${pageContext.request.contextPath}/admin/plant/',
                        type: 'post',
                        data: {
                            _method:"put",
                            plantId: data.plantId,
                            plantFlag:0,
                        } ,
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
                        }
                    });
                    return false;
                });
                layer.close(index);
            } else if(obj.event === 'edit'){
                layer.open({
                    type: 2,
                    title: '' +
                        '<li id="icon" class="layui-icon layui-icon-release layui-anim layui-anim-scaleSpring" ' +
                        'style="font-size: 30px; color: #009688;" data-anim="layui-anim-scaleSpring"></li> 编辑 ',
                    shadeClose: true,
                    shade: false,
                    maxmin: true, //开启最大化最小化按钮
                    area: ['470px', '600px'],
                    content: "${pageContext.request.contextPath}/admin/plant/",
                    success: function(layero, index){
                        var body = layer.getChildFrame('body',index);//建立父子联系
                        var iframe = window['layui-layer-iframe' + index];
                        var inputList = body.find('input');
                        var json=JSON.parse(JSON.stringify(data));
                        for(let d in json){
                            body.find('input[name="'+d+'"]').val(json[d])
                        }
                        body.find('img').attr('src','/file/'+json['plantImg'])
                    }
                });
            }
        });

    });
</script>
</body>

</html>

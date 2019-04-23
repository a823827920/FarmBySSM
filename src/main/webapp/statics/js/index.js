$(document).ready(function(){
			var flag=1;
			$(".cy_img label").toggle(
			function(){
					$(this).attr("style","background-image: url(image/praise2.png);");
					$('#praise'+$(this).attr("id")).html($('#praise'+$(this).attr("id")).html()*1+1);
					},
			function(){	
					$(this).attr("style","background-image: url(image/praise1.png);");
					$('#praise'+$(this).attr("id")).html($('#praise'+$(this).attr("id")).html()*1-1);
			});
			$("#cl").click(function(){
				if(flag==1){
					$(".hover_back").show();
					$(".hover_menu").slideDown("mid");
					$(this).attr("style","transform: rotate(180deg);position:fixed;");
					$(".space").attr("style","height:0;overflow-y:hidden;");
					$(".search_box").attr("style","position:fixed;z-index:1002;box-shadow: 1px 1px 4px 0px #00000059;");
					flag=0;
				}
				else{
					$(this).attr("style","transform: rotate(0deg);");
					$(".space").attr("style","overflow-y:normal;");
					$(".search_box").attr("style","position:absolute;z-index:1002;box-shadow: none;");
					$(".hover_menu").slideUp("mid",function(){
						$(".hover_back").hide();
					})
					flag=1;
				}
				
			});
			$(".tx").toggle(function(){
				$(".tx_downmenu").show();
			},
			function(){
				$(".tx_downmenu").hide();
			});
		
		layui.use(['layer','element'], function(){
		var layer = layui.layer;
		var element=layui.element;
			 $("#register").click(function(){
				
					layer.open({
				 	type: 2, 
				 	title:false,
				 	skin: 'layui-layer-molv',
				 	area:['570px','300px'],
				 	offset:'auto',
				 	closeBtn: 2,
				 	id: 'layerDemo',
				 	anim: 5,
				 	content:'../user/register',
				 	})
			 })
			 $("#login").click(function(){
			 				 layer.open({
			 				 	type: 2, 
			 				 	title:false,
			 				 	skin: 'layui-layer-molv',
			 				 	area:['565px','500px'],
			 				 	offset:'auto',
			 				 	closeBtn: 2,
			 				 	id: 'layerDemo',
			 				 	anim: 5,
			 				 	content:'../user/login'
			 				 	})
			 })
			
		
		});
		
		
		
		});
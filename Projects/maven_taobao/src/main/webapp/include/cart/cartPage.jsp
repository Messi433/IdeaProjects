<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>


<script>
var deleteOrderItem = false;
var deleteOrderItemid = 0;
$(function(){

    //订单项垃圾箱点击
	$("a.deleteOrderItem").click(function(){
		deleteOrderItem = false;//删除状态设置为false
		var oiid = $(this).attr("oiid");//添加属性oiid
		deleteOrderItemid = oiid;//删除的订单项id
		$("#deleteConfirmModal").modal('show');//删除模态框显示
	});
	//删除模态框 确认删除按钮点击
	$("button.deleteConfirmButton").click(function(){
		deleteOrderItem = true;//删除状态设置为true
		$("#deleteConfirmModal").modal('hide');//模态框隐藏
	});

	$('#deleteConfirmModal').on('hidden.bs.modal', function (e) {
	    //如果是删除状态
		if(deleteOrderItem){
		    //通过Ajax访问/forechangeOrderItem路径，导致ForeServlet.deleteOrderItem()方法被调用
			var page="foredeleteOrderItem";
			//ajax传值交互操作 ？不会
			$.post(
				    page,
				    {
				        "oiid":deleteOrderItemid
					},
				    function(result){
						if("success"==result){
							$("tr.cartProductItemTR[oiid="+deleteOrderItemid+"]").hide();
						}
						else{
							location.href="login.jsp";
						}
				    }
				);

		}
	})
	//订单项单项选择点击
	$("img.cartProductItemIfSelected").click(function(){
		var selectit = $(this).attr("selectit")//获得单项选择的属性值
		//如果单项选择的属性值是selectit字符串
		if("selectit"==selectit){
			$(this).attr("src","img/site/cartNotSelected.png");//未选中图标显示
			$(this).attr("selectit","false")//更改属性为未选中
			$(this).parents("tr.cartProductItemTR").css("background-color","#fff");//该行背景为白色
		}
		else{
			$(this).attr("src","img/site/cartSelected.png");//选中图标显示
			$(this).attr("selectit","selectit")//更改属性为选中
			$(this).parents("tr.cartProductItemTR").css("background-color","#FFF8E1");//背景高亮
		}
		syncSelect();
		syncCreateOrderButton();
		calcCartSumPriceAndNumber();
	});
	$("img.selectAllItem").click(function(){
		var selectit = $(this).attr("selectit")
		if("selectit"==selectit){
			$("img.selectAllItem").attr("src","img/site/cartNotSelected.png");
			$("img.selectAllItem").attr("selectit","false")
			$(".cartProductItemIfSelected").each(function(){
				$(this).attr("src","img/site/cartNotSelected.png");
				$(this).attr("selectit","false");
				$(this).parents("tr.cartProductItemTR").css("background-color","#fff");
			});
		}
		else{
			$("img.selectAllItem").attr("src","img/site/cartSelected.png");
			$("img.selectAllItem").attr("selectit","selectit")
			$(".cartProductItemIfSelected").each(function(){
				$(this).attr("src","img/site/cartSelected.png");
				$(this).attr("selectit","selectit");
				$(this).parents("tr.cartProductItemTR").css("background-color","#FFF8E1");
			});
		}
		syncCreateOrderButton();
		calcCartSumPriceAndNumber();


	});
	$(".orderItemNumberSetting").keyup(function(){
		var pid=$(this).attr("pid");
		var stock= $("span.orderItemStock[pid="+pid+"]").text();
		var price= $("span.orderItemPromotePrice[pid="+pid+"]").text();

		var num= $(".orderItemNumberSetting[pid="+pid+"]").val();
		num = parseInt(num);
		if(isNaN(num))
			num= 1;
		if(num<=0)
			num = 1;
		if(num>stock)
			num = stock;

		syncPrice(pid,num,price);
	});

	$(".numberPlus").click(function(){

		var pid=$(this).attr("pid");
		var stock= $("span.orderItemStock[pid="+pid+"]").text();
		var price= $("span.orderItemPromotePrice[pid="+pid+"]").text();
		var num= $(".orderItemNumberSetting[pid="+pid+"]").val();

		num++;
		if(num>stock)
			num = stock;
		syncPrice(pid,num,price);
	});
	$(".numberMinus").click(function(){
		var pid=$(this).attr("pid");
		var stock= $("span.orderItemStock[pid="+pid+"]").text();
		var price= $("span.orderItemPromotePrice[pid="+pid+"]").text();

		var num= $(".orderItemNumberSetting[pid="+pid+"]").val();
		--num;
		if(num<=0)
			num=1;
		syncPrice(pid,num,price);
	});

	$("button.createOrderButton").click(function(){
		var params = "";
		$(".cartProductItemIfSelected").each(function(){
			if("selectit"==$(this).attr("selectit")){
				var oiid = $(this).attr("oiid");
				params += "&oiid="+oiid;
			}
		});
		params = params.substring(1);
		location.href="forebuy?"+params;
	});



})

function syncCreateOrderButton(){
	var selectAny = false;
	$(".cartProductItemIfSelected").each(function(){
		if("selectit"==$(this).attr("selectit")){
			selectAny = true;
		}
	});

	if(selectAny){
		$("button.createOrderButton").css("background-color","#C40000");
		$("button.createOrderButton").removeAttr("disabled");
	}
	else{
		$("button.createOrderButton").css("background-color","#AAAAAA");
		$("button.createOrderButton").attr("disabled","disabled");
	}

}
function syncSelect(){
	var selectAll = true; //全选状态
	$(".cartProductItemIfSelected").each(function(){//遍历每个订单项
	    //如果有没选中的订单项
		if("false"==$(this).attr("selectit")){
			selectAll = false;//全选状态false
		}
	});

	if(selectAll)
		$("img.selectAllItem").attr("src","img/site/cartSelected.png");//所有的订单项设置选中图标
	else
		$("img.selectAllItem").attr("src","img/site/cartNotSelected.png");//繁殖



}
function calcCartSumPriceAndNumber(){
	var sum = 0;
	var totalNumber = 0;
	$("img.cartProductItemIfSelected[selectit='selectit']").each(function(){
		var oiid = $(this).attr("oiid");
		var price =$(".cartProductItemSmallSumPrice[oiid="+oiid+"]").text();
		price = price.replace(/,/g, "");
		price = price.replace(/￥/g, "");
		sum += new Number(price);

		var num =$(".orderItemNumberSetting[oiid="+oiid+"]").val();
		totalNumber += new Number(num);

	});

	$("span.cartSumPrice").html("￥"+formatMoney(sum));
	$("span.cartTitlePrice").html("￥"+formatMoney(sum));
	$("span.cartSumNumber").html(totalNumber);
}
function syncPrice(pid,num,price){
	$(".orderItemNumberSetting[pid="+pid+"]").val(num);
	var cartProductItemSmallSumPrice = formatMoney(num*price);
	$(".cartProductItemSmallSumPrice[pid="+pid+"]").html("￥"+cartProductItemSmallSumPrice);
	calcCartSumPriceAndNumber();

	var page = "forechangeOrderItem";
	$.post(
		    page,
		    {"pid":pid,"number":num},
		    function(result){
				if("success"!=result){
					location.href="login.jsp";
				}
		    }
		);

}
</script>

<title>购物车</title>
<div class="cartDiv">
	<div class="cartTitle pull-right">
		<span>已选商品  (不含运费)</span>
		<span class="cartTitlePrice">￥0.00</span>
		<button class="createOrderButton" disabled="disabled" style="background-color: #FF003A">结 算</button>
	</div>
	
	
	<div class="cartProductList">
		<table class="cartProductTable">
			<thead>
				<tr>
					<th class="selectAndImage">
							<img selectit="false" class="selectAllItem" src="img/site/cartNotSelected.png">				
					全选
					
					</th>
					<th>商品信息</th>
					<th>单价</th>
					<th>数量</th>
					<th width="120px">金额</th>
					<th class="operation">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ois }" var="oi">
					<tr oiid="${oi.id}" class="cartProductItemTR">
						<td>
							<img selectit="false" oiid="${oi.id}" class="cartProductItemIfSelected" src="img/site/cartNotSelected.png">
							<a style="display:none" href="#nowhere"><img src="img/site/cartSelected.png"></a>
							<img class="cartProductImg"  src="img/productSingle_middle/${oi.product.firstProductImage.id}.jpg">
						</td>
						<td>
							<div class="cartProductLinkOutDiv">
								<a href="foreproduct?pid=${oi.product.id}" class="cartProductLink">${oi.product.name}</a>
								<div class="cartProductLinkInnerDiv">
									<img src="img/site/creditcard.png" title="支持信用卡支付">
									<img src="img/site/7day.png" title="消费者保障服务,承诺7天退货">
									<img src="img/site/promise.png" title="消费者保障服务,承诺如实描述">
								</div>
							</div>
							
						</td>
						<td>
							<span class="cartProductItemOringalPrice">￥${oi.product.orignalPrice}</span>
							<span  class="cartProductItemPromotionPrice">￥${oi.product.promotePrice}</span>
							
						</td>
						<td>
						
							<div class="cartProductChangeNumberDiv">
								<span class="hidden orderItemStock " pid="${oi.product.id}">${oi.product.stock}</span>
								<span class="hidden orderItemPromotePrice " pid="${oi.product.id}">${oi.product.promotePrice}</span>
								<a  pid="${oi.product.id}" class="numberMinus" href="#nowhere">-</a>
								<input pid="${oi.product.id}" oiid="${oi.id}" class="orderItemNumberSetting" autocomplete="off" value="${oi.number}">
								<a  stock="${oi.product.stock}" pid="${oi.product.id}" class="numberPlus" href="#nowhere">+</a>
							</div>					
						
						 </td>
						<td >
							<span class="cartProductItemSmallSumPrice" oiid="${oi.id}" pid="${oi.product.id}" >
							￥<fmt:formatNumber type="number" value="${oi.product.promotePrice*oi.number}" minFractionDigits="2"/>
							</span>
						
						</td>
						<td>
							<a class="deleteOrderItem" oiid="${oi.id}"  href="#nowhere">删除</a>
						</td>
					</tr>
				</c:forEach>				
			</tbody>
		
		</table>
	</div>
	
	<div class="cartFoot">
		<img selectit="false" class="selectAllItem" src="img/site/cartNotSelected.png">
		<span>全选</span>
<!-- 		<a href="#">删除</a> -->
		
		<div class="pull-right">
			<span>已选商品 <span class="cartSumNumber" >0</span> 件</span>
			
			<span>合计 (不含运费): </span> 
			<span class="cartSumPrice" >￥0.00</span>
			<button class="createOrderButton" disabled="disabled" >结  算</button>
		</div>
		
	</div>
	
</div>
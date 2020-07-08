/*类型选择*/
$(function() {
	var typeNodes = document.getElementsByClassName("type");
	var queryButton = document.getElementById("queryButton");
	$(typeNodes[0]).css({
		"background-color": "rgba(255,255,255,1)"
	});
	$(typeNodes[0]).css({
		"border-top-left-radius": "0.1rem"
	});
	$(typeNodes[0]).css({
		"border-top-right-radius": "0.1rem"
	});
	typeNodes[1].style.color = 'white';
	typeNodes[2].style.color = 'white';
	$(typeNodes[1]).css({
		"background-color": "rgba(0,0,0,0.2)"
	});
	$(typeNodes[2]).css({
		"background-color": "rgba(0,0,0,0.2)"
	});
	$(".type").click(function name() {
		for(var i = 0; i < typeNodes.length; i++) {
			if($(this).text() == typeNodes[i].textContent) {
				$(this).css({
					"background-color": "rgba(255,255,255,1)"
				});
				$(typeNodes[i]).css({
					"border-top-left-radius": "0.1rem"
				});
				$(typeNodes[i]).css({
					"border-top-right-radius": "0.1rem"
				});
				typeNodes[i].style.color = 'black';
				if(i == 0) {
					$(queryButton).css({
						"background":"-webkit-linear-gradient(left, #F0E68C, #FF8C00)",
						"background":"-o-linear-gradient(right, #F0E68C, #FF8C00)",
						"background":"-moz-linear-gradient(right, #F0E68C, #FF8C00)",
						"background":"linear-gradient(to right, #F0E68C, #FF8C00)"
					});
				}
				if(i == 1) {
					$(queryButton).css({
						"background":"-webkit-linear-gradient(left, #87CEFA, #00008B)",
						"background":"-o-linear-gradient(right, #87CEFA, #00008B)",
						"background":"-moz-linear-gradient(right, #87CEFA, #00008B)",
						"background":"linear-gradient(to right, #87CEFA, #00008B)"
					});
				}
				if(i == 2) {
					$(queryButton).css({
						"background":"-webkit-linear-gradient(left, #FFB6C1, #FF1493)",
						"background":"-o-linear-gradient(right, #FFB6C1, #FF1493)",
						"background":"-moz-linear-gradient(right, #FFB6C1, #FF1493)",
						"background":"linear-gradient(to right, #FFB6C1, #FF1493)"
					});
				}
			} else {
				typeNodes[i].style.color = 'white';
				$(typeNodes[i]).css({
					"background-color": "rgba(0,0,0,0.2)"
				});
				$(typeNodes[i]).css({
					"border-top-left-radius": "0rem"
				});
				$(typeNodes[i]).css({
					"border-top-right-radius": "0rem"
				});
			}
		}
	});
});
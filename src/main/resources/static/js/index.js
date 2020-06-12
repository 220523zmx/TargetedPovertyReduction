$(function() {
	console.log("hello")
	getrenshubi()
	getconditionbytime()
	getresultbyarea()
})
$(".submit").on("click", function() {
	postcondiction()

})
function postcondiction() {
	var education = $(".se_education").val()
	var health = $(".se_health").val()
	var labor = $(".se_labor").val()
	var rural = $(".se_rural").val()
	console.log(education, health, labor, rural)

}
function getrenshubi() {
	$.ajax({
		url : "./survey/getrenshubi",
		type : 'GET',
		success : function(data) {
			console.log("成功", data);
			main1(data)
		},
		error : function(data) {
			console.log("失败", data);
		}
	});

}

function main1(data) {
	var poor = data.countpoor
	var rich = data.countrich

	var myChart = echarts.init(document.getElementById('main1'));
	option = {
		tooltip : {
			trigger : 'item',
			formatter : '{a} <br/>{b}: {c} ({d}%)'
		},
		legend : {
			orient : 'vertical',
			left : 10,
			data : [ '未脱贫', '已脱贫' ]
		},
		series : [ {
			name : '脱贫困户所占比例',
			type : 'pie',
			radius : [ '50%', '80%' ],
			avoidLabelOverlap : false,
			label : {
				show : false,
				position : 'center'
			},
			emphasis : {
				label : {
					show : true,
					fontSize : '30',
					fontWeight : 'bold'
				}
			},
			labelLine : {
				show : false
			},
			data : [ {
				value : poor,
				name : '未脱贫'
			}, {
				value : rich,
				name : '已脱贫'
			},

			]
		} ]
	};
	myChart.setOption(option);

}

function getresultbyarea() {
	$.ajax({
		url : "./survey/getresultbyarea",
		type : 'GET',
		success : function(data) {
			console.log("成功", data);
			main2_1(data)
			main2_2(data)
			main2_3(data)
		},
		error : function(data) {
			console.log("失败", data);
		}
	});
}
function main2_1(data) {
	var list = data.num1
	console.log(list)
	var myChart = echarts.init(document.getElementById('main2_1'));
	option = {
		legend : {},
		tooltip : {},
		dataset : {
			source : list
		},
		xAxis : {
			type : 'category'
		},
		yAxis : {},
		series : [ {
			type : 'bar'
		}, {
			type : 'bar'
		} ]

	};
	myChart.setOption(option);
}
function main2_2(data) {
	var list = data.num2
	console.log(list)
	var myChart = echarts.init(document.getElementById('main2_2'));
	option = {
		legend : {},
		tooltip : {},
		dataset : {
			source : list
		},
		xAxis : {
			type : 'category'
		},
		yAxis : {},
		series : [ {
			type : 'bar'
		}, {
			type : 'bar'
		} ]

	};
	myChart.setOption(option);
}
function main2_3(data) {
	var list = data.num3
	console.log(list)
	var myChart = echarts.init(document.getElementById('main2_3'));
	option = {
		legend : {},
		tooltip : {},
		dataset : {
			source : list
		},
		xAxis : {
			type : 'category'
		},
		yAxis : {},
		series : [ {
			type : 'bar'
		}, {
			type : 'bar'
		} ]

	};
	myChart.setOption(option);
}
function getconditionbytime() {
	$.ajax({
		url : "./survey/getconditionbytime",
		type : 'GET',
		success : function(data) {
			console.log("成功", data);
			console.log(data.level_of_education_0, data.level_of_education_1,
					data.rural_cooperative_0, data.rural_cooperative_1)
			main3_1(data)
			main3_2(data)
			main3_3(data)
			main3_4(data)
		},
		error : function(data) {
			console.log("失败", data);
		}
	});

}

function main3_1(data) {
	var myChart = echarts.init(document.getElementById('main3_1'));
	option = {
		title : {
			text : '身体状况',
			subtext : '数据来自网络'
		},
		tooltip : {
			trigger : 'axis',
			axisPointer : {
				type : 'shadow'
			}
		},
		legend : {
			data : [ '健康', '慢性病', '残疾', '瘫痪' ]
		},
		grid : {
			left : '3%',
			right : '4%',
			bottom : '3%',
			containLabel : true
		},
		xAxis : {
			type : 'value',
			boundaryGap : [ 0, 0.01 ]
		},
		yAxis : {
			type : 'category',
			data : data.timelist
		},
		series : [ {
			name : '健康',
			type : 'bar',
			data : data.health_0
		}, {
			name : '慢性病',
			type : 'bar',
			data : data.health_1
		}, {
			name : '残疾',
			type : 'bar',
			data : data.health_2
		}, {
			name : '瘫痪',
			type : 'bar',
			data : data.health_3
		} ]
	};
	myChart.setOption(option);
}
function main3_2(data) {
	var myChart = echarts.init(document.getElementById('main3_2'));
	option = {
		title : {
			text : '劳动力水平',
			subtext : '数据来自网络'
		},
		tooltip : {
			trigger : 'axis',
			axisPointer : {
				type : 'shadow'
			}
		},
		legend : {
			data : [ '无劳动力', '普通劳动力', '丧失劳动力' ]
		},
		grid : {
			left : '3%',
			right : '4%',
			bottom : '3%',
			containLabel : true
		},
		xAxis : {
			type : 'value',
			boundaryGap : [ 0, 0.01 ]
		},
		yAxis : {
			type : 'category',
			data : data.timelist
		},
		series : [ {
			name : '无劳动力',
			type : 'bar',
			data : data.labor_skills_0
		}, {
			name : '普通劳动力',
			type : 'bar',
			data : data.labor_skills_1
		}, {
			name : '丧失劳动力',
			type : 'bar',
			data : data.labor_skills_2
		} ]
	};
	myChart.setOption(option);
}
function main3_3(data) {
	var myChart = echarts.init(document.getElementById('main3_3'));
	option = {
		title : {
			text : '文化水平',
			subtext : '数据来自网络'
		},
		tooltip : {
			trigger : 'axis',
			axisPointer : {
				type : 'shadow'
			}
		},
		legend : {
			data : [ '小学及以上', '文盲或半文盲' ]
		},
		grid : {
			left : '3%',
			right : '4%',
			bottom : '3%',
			containLabel : true
		},
		xAxis : {
			type : 'value',
			boundaryGap : [ 0, 0.01 ]
		},
		yAxis : {
			type : 'category',
			data : data.timelist
		},
		series : [ {
			name : '小学及以上',
			type : 'bar',
			data : data.level_of_education_0
		}, {
			name : '文盲或半文盲',
			type : 'bar',
			data : data.level_of_education_1
		} ]
	};
	myChart.setOption(option);
}
function main3_4(data) {
	var myChart = echarts.init(document.getElementById('main3_4'));
	option = {
		title : {
			text : '参加农合情况',
			subtext : '数据来自网络'
		},
		tooltip : {
			trigger : 'axis',
			axisPointer : {
				type : 'shadow'
			}
		},
		legend : {
			data : [ '未参', '参' ]
		},
		grid : {
			left : '3%',
			right : '4%',
			bottom : '3%',
			containLabel : true
		},
		xAxis : {
			type : 'value',
			boundaryGap : [ 0, 0.01 ]
		},
		yAxis : {
			type : 'category',
			data : data.timelist
		},
		series : [ {
			name : '未参',
			type : 'bar',
			data : data.rural_cooperative_0
		}, {
			name : '参',
			type : 'bar',
			data : data.rural_cooperative_1
		} ]
	};
	myChart.setOption(option);
}

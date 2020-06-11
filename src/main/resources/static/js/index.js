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
	//var poor = data.countpoor
	//var rich = data.countrich
	//var txt = "";
	//txt = `${poor}${rich}`
	//$(".ProportionOfPoor").append(txt);
}
function getconditionbytime() {
	$.ajax({
		url : "./survey/getconditionbytime",
		type : 'GET',
		success : function(data) {
			console.log("成功", data);
			//main3(data)
		},
		error : function(data) {
			console.log("失败", data);
		}
	});

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
			source :list
		},
		 xAxis: {type: 'category'},
		    yAxis: {},
		    // Declare several bar series, each will be mapped
		    // to a column of dataset.source by default.
		    series: [
		        {type: 'bar'},
		        {type: 'bar'}
		    ]
		
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
			source :list
		},
		 xAxis: {type: 'category'},
		    yAxis: {},
		    // Declare several bar series, each will be mapped
		    // to a column of dataset.source by default.
		    series: [
		        {type: 'bar'},
		        {type: 'bar'}
		    ]
		
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
			source :list
		},
		 xAxis: {type: 'category'},
		    yAxis: {},
		    // Declare several bar series, each will be mapped
		    // to a column of dataset.source by default.
		    series: [
		        {type: 'bar'},
		        {type: 'bar'}
		    ]
		
	};
	myChart.setOption(option);
}
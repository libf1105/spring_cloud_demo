	function showMask() {
		$("#result").text("");
		$(".mask").css("height", $(document).height());
		$(".mask").css("width", $(document).width());
		$(".mask").show();
	}
	function hideMask() {
		$(".mask").hide();
	}
	$(document).ready(function() {
		$("#hystrix").click(function() {
			window.open("/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8010%2Fhystrix.stream");
		})
		$("#zipkin").click(function() {
			window.open("http://localhost:8070/");
		})		
		$("#eureka").click(function() {
			window.open("http://localhost:8761/");
		})
		$("#testConfig").click(function() {
			showMask();
			$.get("showEnvironment", function(result) {
				hideMask();
				$("#result").text(result);
			})
		})
		$("#testFeign").click(function() {
			showMask();
			$.get("showTime", function(result) {
				hideMask();
				$("#result").text(result);
			})
		})
		$("#testRefreshConfig").click(function() {
			showMask();
			$.post("refresh", {}, function(result) {
				hideMask();
				$("#result").text(JSON.stringify(result));
			})
		})
	})

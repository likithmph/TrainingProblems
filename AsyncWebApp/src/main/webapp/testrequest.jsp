<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XMLHttp&amp;JS</title>
</head>
<body>
	<h1>ASYNC XMLHTTP REQUEST</h1>
	<p id="mla"></p>
	<script type="text/javascript">
		
		function mlaDate(input) {
			document.getElementById("mla").innerHTML = input;
			
		}	
		let mlaPromise = new Promise(function(resolve, reject) { 
			let input = 0 ;
			if(input == 0){
				resolve("Success........");
			}
			else{
				reject("Failure / Rejected / Deny etc");
			}
		});
		mlaPromise.then (
			function (value){
				mlaDate(value);
			},		
			function(error){
				mlaDate(error);
			}
		)
		
	
	</script>
</body>
</html>
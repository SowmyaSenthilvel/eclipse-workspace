<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajax Sample Page</title>
</head>
<body>
<script type="text/javascript">
	function addMe() {
		//alert("Hii");
		var a = document.form1.value1.value;
		var b = document.form1.value2.value;
		var url = "addition?a=" + a + "&b=" + b;
		const request = new XMLHttpRequest();
		try {
			request.open("POST", url, false);
			request.send();
			var val = JSON.parse(request.responseText);
			document.getElementById('result').innerHTML = val.value;
		} catch (e) {
			alert("Unable to Process" + e)
		}
	}
</script>
<form name=form1>
<input type="text" name=value1>
<input type="text" name=value2>
<input type="button" value="Submit" onclick=addMe()>
</form><br>
Adding Two Value is:
<span id="result"></span>
</body>
</html>
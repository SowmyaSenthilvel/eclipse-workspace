<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time zone for Countries</title>
</head>
<body>
<div align="center">
<h1>Time Zone For Various Countries</h1>
<form action="CountryTimezone" method=post>
<fieldset>
<label>Choose the Country/Timezone</label>
<select name="country">
<option value=GMT>Greenwich Mean Time (London)</option> 
<option value=America/Los_Angeles>America (LA)</option>
<option value=America/Sao_Paulo>South America (Brazil)</option>
<option value=Asia/Jakarta>Indonesia</option>
<option value=Europe/Madrid>Spain</option>
<option value=IST>India</option>
<option value=Australia/Melbourne>Australia</option>
<option value=JST>Japan</option>
<option value=America/Toronto>Canada (Toronto)</option>
<option value=America/Santiago>Chile</option>
<option value=Africa/Cairo>Egypt</option>
<option value=Europe/Paris>France</option>
<option value=Europe/Berlin>Germany</option>
</select><br><br>
<br><input type="submit">
</fieldset>
</form>
</div>

</body>
</html>
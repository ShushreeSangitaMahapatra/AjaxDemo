<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
</head>
<body>
	<form>
	
	<div>
		<label>Country Name</label>
	<select onChange="country_state()">
	
		<option>-select-</option>
		<c:forEach items="${countryList }" var="country">
		<option value="${country.countryId }">"${country.name}"</option>
		</c:forEach>
	
	</select>
	
	</div>
	
	<div>
		<label>State Name</label>
	<select onChange="state_city()" id="stateId">
		<option>-select-</option>
	
	
	</select>
	
	</div>
	
	<div>
		<label>City Name</label>
	<select id="cityId">
		<option>-select-</option>
	
	
	</select>
	
	</div>
	
	
	</form>

</body>


<script type="text/javascript">

	function country_state(){

		var country=$("#countryId").val();
			alert(country);
			$.ajax({
				type:"GET",
				url:"./getStatesByCountryId",
				data:"cId"="+country,
				success: function(response){
					alert(response);
					}	
				

			});

		} 

	function state_city(){

		var state=$("#stateId").val();
			alert(state);
			$.ajax({
				type:"GET",
				url:"./getCitiesByStateId",
				data:"sId"="+state,
				success: function(response){
					$("#cityId").html(response);
					}	
				

			});

		} 
	

</script>
</html>
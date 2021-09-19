<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Ticket</title>
</head>
<body>
<h2>Movie Ticket Booking :</h2><br>
	<form action="createTicket" method="post">
		<!-- Movie Name : <input type="text" name="movie" /> 
		Screen : <input type="text" name="screen" /> 
		Seat No. : <input type="text" name="seat" />  -->
		
		Movie Name : <input type="text" name="movieName" /> 
		Screen : <input type="text" name="screenNo" /> 
		Seat No. : <input type="text" name="seatNo" /> 
		
		<input type="submit" value="purchase" />
	</form>
	<br/>
	-${msg}-

</body>
</html>
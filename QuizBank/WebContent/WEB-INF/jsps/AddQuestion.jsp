<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new Question</title>
</head>
<body>
	<h3>Fortune Quiz Bank Maintainence</h3>
	<h1>Add Question</h1>
	<a href="home.do">Home</a>
	<form action="insert.do">
		<table>
			<tr>
				<td><label>Select Topic</label></td>
				<td><select name="subtopic">
						<option value="">--SELECT--</option>
						<option value="MATHS">MATHS</option>
						<option value="HISTORY">HISTORY</option>
						<option value="SCIENCE">SCIENCE</option>
				</select></td>
			</tr>

			<tr>
				<td><label>Question Category</label></td>
				<td><input type="radio" name="category" value="C" required>Complex
					<input type="radio" name="category" value="S" required>Simple</td>
			</tr>

			<tr>
				<td><label>Question</label></td>
				<td><input type="text" name="question" required></td>
			</tr>

			<tr>
				<td><label>Option1</label></td>
				<td><input type="text" name="option1" required></td>
			</tr>

			<tr>
				<td><label>Option2</label></td>
				<td><input type="text" name="option2" required></td>
			</tr>

			<tr>
				<td><label>Option3</label></td>
				<td><input type="text" name="option3" required></td>
			</tr>


			<tr>
				<td><label>Option4</label></td>
				<td><input type="text" name="option4" required></td>
			</tr>
			
				<tr>
				<td>
					<label>Answer</label>
				</td>
				<td>
					<input type="number" name="answer" required>
				</td>
			</tr>
			
				<tr>
				<td>
					<label>No of Reviews</label>
				</td>
				<td>
					<input type="number" name="reviewCnt" value="0" >
				</td>
			</tr>
			
				<tr>
				
				<td>
					<input type="submit" value="Add Question" >
				</td>
			</tr>




		</table>
	</form>
	<div style="color:red">${msg}</div>


</body>
</html>
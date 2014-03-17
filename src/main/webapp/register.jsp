<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE  html>
<html lang="en_AU">
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>
</head>
<body>
	<div id="wrapper">
		<div id="content" style="padding-top: 5cm">
			<div id="main">
				<div class="box">
					<div class="middle" id="register">
						<div class="post">
							<p>
								<span>Registration Form</span>
							</p>
							<p>Please enter your details.</p>
						</div>

						<s:form action="customeraction" labelposition="left">
							<table>
								<tbody>
									<tr>
										<td>First Name:</td>
										<td><s:textfield name="customer.firstName" maxlength="255" /></td>
									</tr>
									<tr>
										<td>Last Name:</td>
										<td><s:textfield name="customer.lastName" maxlength="255" /></td>
									</tr>
									<tr>
										<td>Email:</td>
										<td><s:textfield name="customer.emailAddress" maxlength="255" /></td>
									</tr>
									<tr>
										<td colspan="2">
											<s:submit label="Submit" /> 
											<s:reset label="Reset" />
										</td>
									</tr>

								</tbody>
							</table>
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
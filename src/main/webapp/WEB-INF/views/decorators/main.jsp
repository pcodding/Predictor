<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="application.title"/></title>
<decorator:head />
<%@ include file="/WEB-INF/views/includes/style.jsp"%>
<%@ include file="/WEB-INF/views/includes/scripts.jsp"%>
</head>
<body class="claro">
	<div id="main" class="container_12">
		<%@ include file="/WEB-INF/views/includes/header.jsp"%>
    <decorator:body />
		<%@ include file="/WEB-INF/views/includes/footer.jsp"%>
	</div>
</body>
</html>
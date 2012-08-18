<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script type="text/javascript">
	require([ "dojo/parser", "dijit/registry", "dijit/form/Form",
			"dijit/form/Button", "dijit/form/ValidationTextBox",
			"dijit/form/DateTextBox" ]);
	require(
			[ "dojo/ready", "dijit/Tooltip" ],
			function(ready, Tooltip) {
				ready(function() {
					new Tooltip(
							{
								connectId : [ "species" ],
								label : '<spring:message code="input.species.context"/>'
							});
					new Tooltip({
						connectId : [ "dbh" ],
						label : '<spring:message code="input.dbh.context"/>'
					});
					new Tooltip(
							{
								connectId : [ "boulevardSize" ],
								label : '<spring:message code="input.boulevardSize.context"/>'
							});
					new Tooltip(
							{
								connectId : [ "checkFeasibility" ],
								label : '<spring:message code="input.checkFeasibility.context"/>'
							});
				});
			});
	
	function toggleImage(component) {
		var speciesName = component.options[component.selectedIndex].value;		
		var speciesImageTag = "<img height='347' width='450' src='" + imageUrls[speciesName] + "'></image>";
		//document.getElementById("treeImage").innerHTML = speciesImageTag; 
	}
	
	var imageUrls = new Object();
	<c:forEach var="specie" items="${species}" varStatus="rowCounter">
	   imageUrls['<c:out value="${specie.name}"/>'] = '<c:out value="${specie.imageUrl}"/>';
	</c:forEach>
</script>
<div class="grid_5">
	<h3>
		<spring:message code="input.heading" />
	</h3>
	<p class="inputDescription">
		<spring:message code="input.description" />
	</p>
	<fieldset>
		<legend>
			<spring:message code="input.fieldset.label" />
		</legend>
		<form id="collisionCalculationInput"
			action="<c:url value="/calculateCollision"/>" method="post">
			<table id="inputParametersTable" class="list">
				<tr>
					<td><spring:message code="input.species" />
					</td>
					<td><select id="species" name="species" onclick="javascript:toggleImage(this)">
						<option selected="selected">
							<spring:message code="input.species.pick"/>
						</option>
						<c:forEach var="specie" items="${species}" varStatus="rowCounter">
							<option>
								<c:out value="${specie.name}" />
							</option>
						</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td><spring:message code="input.dbh" />
					</td>
					<td><input type="text" id="dbh" name="dbh" />
					</td>
				</tr>
				<tr>
					<td><spring:message code="input.boulevardSize" /></td>
					<td><input type="text" id="boulevardSize" name="boulevardSize" />
					</td>
				</tr>
				<tr>
					<td colspan="2" class="button"><button id="checkFeasibility"
							type="submit" name="submitButton">
							<spring:message code="input.checkFeasibility" />
						</button>
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</div>
<div class="grid_7">
	<c:if test="${crownWidth.valueInInches > 0}">
		<h3><spring:message code="results.heading"/></h3>
		<p class="resultsDescription">
			<spring:message code="results.description" />
		</p>
		<div class="resultsContext"><c:out value="${resultsContext}" /></div>
		<c:if test="${collisionMessage != null }">
			<div class="collisionMessage">
				<img src="<c:url value="resources/images/warning.png"/>" />
				<c:out value="${collisionMessage}" />
			</div>
		</c:if>
		<table id="resultsTable" class="list">
			<tr>
				<th><spring:message code="results.crownWidth" /> (<spring:message
						code="measurement.feet" />)</th>
				<th><spring:message code="results.rootFlare" /> (<spring:message
						code="measurement.inches" />)</th>
			</tr>
			<tr>
				<td><c:out value="${crownWidth.valueInFeet}" />&nbsp;<c:out value="${specie.crownWidthError}"/></td>
				<td><c:out value="${rootFlare.valueInInches}" />&nbsp;<c:out value="${specie.rootFlareError}"/></td>
			</tr>
		</table>
	</c:if>
</div>
<div class="clear"></div>
<div class="grid_12"><div id="treeImage"></div></div>
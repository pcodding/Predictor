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
</script>
<div class="grid_7">
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
					<td><spring:message code="input.species" /></td>
					<td><select id="species" name="species">
							<c:forEach var="specie" items="${species}" varStatus="rowCounter">
								<option>
									<c:out value="${specie.name}" />
								</option>
							</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td><spring:message code="input.dbh" /></td>
					<td><input type="text" id="dbh" name="dbh" /></td>
				</tr>
				<tr>
					<td><spring:message code="input.boulevardSize" />
					</td>
					<td><input type="text" id="boulevardSize" name="boulevardSize" />
					</td>
				</tr>
				<tr>
					<td colspan="2"><button id="checkFeasibility" type="submit"
							name="submitButton">
							<spring:message code="input.checkFeasibility" />
						</button></td>
				</tr>
			</table>
		</form>
	</fieldset>
</div>
<div class="grid_5">
	<c:if test="${crownWidth.valueInFeet > 0}">
		<h3>Results</h3>
		<p class="resultsDescription">
			<spring:message code="results.description" />
		</p>
		<c:if test="${collisionMessage == null }">
			<div class="collisionMessage">
				<c:out value="${collisionMessage}" />
			</div>
		</c:if>
		<table id="resultsTable" class="list">
			<tr>
				<th><spring:message code="results.crownWidth" /> (<spring:message
						code="measurement.feet" />)
				</th>
				<th><spring:message code="results.rootFlare" /> (<spring:message
						code="measurement.inches" />)
				</th>
			</tr>
			<tr>
				<td><c:out value="${crownWidth.valueInFeet}" />
				</td>
				<td><c:out value="${rootFlare.valueInFeet}" />
				</td>
			</tr>
		</table>
	</c:if>
</div>
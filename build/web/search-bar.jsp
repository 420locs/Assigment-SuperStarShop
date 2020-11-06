
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Start Top Search -->
<div class="top-search">
	<div class="container">
		<div class="input-group">
			<span class="input-group-addon"><i class="fa fa-search"></i></span>
			<input type="text" id="search" class="form-control" placeholder="Search" value="${param.q}">
			<span class="input-group-addon close-search"><i class="fa fa-times"></i></span>
		</div>
	</div>
</div>
<script>
	document.getElementById("search").addEventListener("keyup", function (event) {
		if (event.key === "Enter") {
			location.href = 'search?q=' + document.getElementById("search").value;
		}
	});
</script>
<!-- End Top Search -->
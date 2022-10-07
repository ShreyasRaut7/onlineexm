<html>
<head>
<script>
	function fun1(listitem) {
		alert(listitem.innerHTML);
	}
</script>
<style>
ul {
	line-height: 30px;
	border: 1px solid grey;
	width: 50px;
}
</style>
</head>
<body>


	<ul>
		<li onclick="fun1(this)">1</li>
		<hr>
		<li onclick="fun1(this)">2</li>
		<hr>
		<li onclick="fun1(this)">3</li>
		<hr>

	</ul>

</body>
</html>
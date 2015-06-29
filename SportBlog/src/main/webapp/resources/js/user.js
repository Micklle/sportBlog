$('#show-user').click(show);

function show() {
		$.ajax({
		url : "users/show",
		type : 'GET',
		success : function(data) {
			var content = "";

			
			for (var i in data) {
				content += "<tr><td>" + data[i].id + " </td><td> "
						+ data[i].name + "</td>	<td>" + data[i].email
						+ "</td></tr>";
			}
			
			$('#content').html(content);
		}
	});
}
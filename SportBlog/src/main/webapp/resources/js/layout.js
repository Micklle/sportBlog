$('.hide_menu').click(function() {
	$('.sidebar').hide(800);
	$('.content').animate({
		'left' : '0'
	}, 800);
	$('.show_menu').show();
	$('.hide_menu').hide();
});
$('.show_menu').click(function() {
	$('.content').animate({
		'left' : '170px'
	}, 800);
	$('.sidebar').show(800);
	$('.hide_menu').show();
	$('.show_menu').hide();
});

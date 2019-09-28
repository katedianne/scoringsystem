$(document).ready(function() {

    $(document).on('click', '.add-category', function(e) {
        var str = $('.category-name').val();
        
        if(str != "") {
            $('.rounded').append('<a class="collapse-item" href="blank.html">'+str+'</a>');
            $('.category-name').val("");
        }
    });

    $(document).on('click', '.btn-menu1', function(e) {
        var str = $('.input-menu1').val();
        
        if(str != "") {
            $('.ul-menu1').append('<li><a href="#" class="events-menu">'+str+'</a></li>');
            $('.input-menu1').val("");
        }
    });

    $(document).on('click', '.events-menu', function(e) {
        var str = $(this).html();

        $('.menu-dropdown').html(str);
    });

    $(document).on('click', '.btn-submenu1', function(e) {
        var str = $('.input-submenu1').val();
        if(str != "") {
            $('.ul-submenu1').append('<li><a href="#" class="events-submenu">'+str+'</a></li>');
            $('.input-submenu1').val("");
        }
    });

    $(document).on('click', '.events-submenu', function(e) {
        var str = $(this).html();

        $('.submenu-dropdown').html(str);
    });

});
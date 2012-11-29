$ ->
    $.get "/", (data) ->
        $.each data, (index, item) ->
            $("#employees").append $("<li>").text item.name
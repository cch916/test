
var test = function(){

    $.get(url.test, function(data){
            $("body").append("<h2>" + data.username + "</h2>" + "<h2>" + data.password + "</h2>")

    });
};



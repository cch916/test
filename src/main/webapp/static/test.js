
var test = function(){

    $.get(url.test, function(data){
            var josn=eval(data);
            $("body").append("<h2>" + josn.username + "</h2>" + "<h2>" + josn.password + "</h2>")

    });
};



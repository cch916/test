
var test = function(){
    $.get(url.test,function(data){
        if(data.status == "1"){
            $("body").append("<h2>"+data.test+"</h2>")
        }
    });
};



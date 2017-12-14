$(function(){
        $.get(url.test, function (data) {
            if(data.status=="1"){
                var obj=data.list;
                for (var i=0;i<obj.length;i++)
                {
                    $("body").append("<h2>"+obj[i].username+"</h2>"+"<h2>"+obj[i].password+"</h2>");
                }
            }

        });
});



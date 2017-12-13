(function(){
	//获取应用上下文
		var contextPath = function(){
			var contextPath = document.location.pathname;
			var index =contextPath.substr(1).indexOf("/"); 
			contextPath = contextPath.substr(0,index+1);
			delete index;
			return contextPath; 
		};
		var getAbsolutePath = function(path){
				var absolutePath = [];
				absolutePath.push(window.location.protocol);
				absolutePath.push("//");
				absolutePath.push(window.location.host);
				absolutePath.push(contextPath());
				absolutePath.push(path);
				return absolutePath.join('');
		};
		
		/**
		 * 
		 * 为jquery扩展一个方法来通过jquery获取url参数，
		 * 如： $.getUrlParam('key')
		 * */
		 (function ($) {
                $.getUrlParam = function (name) {
                    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
                    var r = window.location.search.substr(1).match(reg);
                    if (r != null) return unescape(r[2]); return null;
                }
            })(jQuery);
		
		window.url = {
				test : getAbsolutePath('/test/test')
				}

})();

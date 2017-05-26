'use strict'

app.controller('SiteController', function($scope,$http){
	
	$scope.dadosSite = {};
	
	$scope.cadastraSite = function(){
		
		var params = {
				'nmeSite': $scope.dadosSite.nmeSite,
				'urlSite': $scope.dadosSite.urlSite
		}
		
		$http.post('site', params)
			  .then(function(response){
				  
			  }, function(error){
				  
			  })
		
	};
	
});
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div ng-controller="SiteController">

<div class="container" style="padding-top: 40px;" ng-init="">

	<div class="panel panel-default">
	  <div class="panel-heading"><h3 class="panel-title text-center">Cadastro Site</h3></div>
		  <div class="panel-body">
		  	
		  	<form ng-submit="cadastraSite()">	  
			  <div class="row" style="padding-top: 10px;">
	        	<div class="col-sm-12">
	        	
	        		<div class="col-sm-3">
		        		 <div class="control-group">
					      <label class="control-label"  for="username">Nome Site *</label>
					        <input type="text" ng-model="dadosSite.nmeSite" placeholder="" class="form-control">				 
					    </div>
	        		</div>
	        		
	        		<div class="col-sm-3">
		        		 <div class="control-group">
					      <label class="control-label"  for="username">URL Site *</label>
					        <input type="text" ng-model="dadosSite.urlSite" placeholder="" class="form-control">				 
					    </div>
	        		</div>        		
	          	</div>	
		  	</div>
		  	
		  	<div class="row" style="padding-top: 20px;">
		  	
		  		<div class="col-sm-12">
	        	
	        		<div class="col-sm-3">
	        		
	        			<button type="submit" class="btn btn-primary">
							Salvar
						</button>
	        		
	        		</div>
	        	</div>	
		  	
		  	</div>
		  </form>
		  
	  </div>		

	</div>   
</div>

</div>	 
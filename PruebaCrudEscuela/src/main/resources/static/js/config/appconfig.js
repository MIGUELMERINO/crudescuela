var app = angular.module('alumno', ['ngRoute']);


app.config(function($routeProvider){
	$routeProvider.when('/', {
		templateUrl : '/view/alumno',
		controller: 'student'
	}).when('/salon', {
		templateUrl: '/view/salon',
		controller: 'room'
	});
});
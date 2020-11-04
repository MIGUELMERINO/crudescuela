app.controller('student', ['crudStudent', '$scope',  function(crudStudent, $scope) {
	
	$scope.student = {};
	$scope.listStudent = [];
	$scope.listRoom = [];
	$scope.salon = {};
	
	
	$scope.addRoom = function(room) {
		$scope.student.salon = room;
	}
	
	$scope.register = function() {
		crudStudent.createStudent($scope.student).then(function success(data){
			$scope.student = {};
			crudStudent.listStudent().then(function success(data) {
				$scope.listStudent = data;
			});
		});
	}
	
	$scope.addEdit = function (data) {
		$scope.student.idalumno = data.idalumno;
		$scope.student.name = data.name;
		$scope.student.lastname = data.lastname;
		$scope.student.ege = data.ege;
		$scope.student.sex = data.sex;
		$scope.salon.salon = data.salon;
	}
	
	$scope.upStudent = function() {
	
		crudStudent.putStudent($scope.student.idalumno, $scope.student).then(function success(data){
			alert('Datos actualizados');
			crudStudent.listStudent().then(function success(data) {
				$scope.listStudent = data;
			});
		});
	}
	
	$scope.delete = function (idstudent) {
		crudStudent.DeleteStudent(idstudent).then(function succes(data){
			alert('Dato eliminado');
			crudStudent.listStudent().then(function success(data) {
				$scope.listStudent = data;
			});
		});
	
	}
	
	crudStudent.listRoom().then(function success(data) {
		$scope.listRoom = data;
	});
	
	crudStudent.listStudent().then(function success(data) {
		$scope.listStudent = data;
	});

}]);




app.controller('room', ['crudRoom', '$scope',  function(crudRoom, $scope) {
	$scope.room = {};
	$scope.listRoom = [];

	crudRoom.listRoom().then(function success(data) {
		$scope.listRoom = data;
	});
	
	$scope.register = function(){
		crudRoom.createRoom($scope.room).then(function success(){
			$scope.room = {};
			crudRoom.listRoom().then(function success(data) {
				$scope.listRoom = data;
			});
		})
	}
	
	$scope.addEdit = function(data) {
		$scope.room.idsalon = data.idsalon;
		$scope.room.roomnumber = data.roomnumber;
	}
	
	$scope.delete = function (idsalon) {
		crudRoom.deleteRoom(idsalon).then(function success(){
			alert('Dato eliminado');
		});
	}
	
	$scope.upRoom = function() {
		crudRoom.putRoom($scope.room.idsalon, $scope.room).then(function success(){
		 alert('Datos actualizados');
		 crudRoom.listRoom().then(function success(data) {
				$scope.listRoom = data;
			});
		});
	
	}
	
	
}]);




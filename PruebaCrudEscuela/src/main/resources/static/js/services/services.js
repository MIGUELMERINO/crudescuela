var enpointStudent = '/alumno/';
var enpointRoom = '/salon/';

app.service('crudStudent', ['crudApp', function(crudApp) {
	return {
		listStudent: function(){
			return crudApp.get('/alumno/students');
		},
		createStudent: function(data){
			return crudApp.post('/alumno/student', data);
		},
		putStudent: function(idstudent, data){
			return crudApp.put('/alumno/student/'+idstudent, data);
		},
		DeleteStudent: function(idstudent){
			return crudApp.delete('/alumno/student/'+idstudent);
		},
		listRoom: function() {
			return crudApp.get('/salon/rooms');
		}
	}
}]);


app.service('crudRoom', ['crudApp', function(crudApp) {
	return {
		listRoom: function() {
			return crudApp.get('/salon/rooms');
		},
		createRoom: function(room) {
			return crudApp.post('/salon/room', room);
		},
		putRoom: function(idroom, room) {
			return crudApp.put('/salon/room/'+idroom, room);
		},
		deleteRoom: function(idroom) {
			return crudApp.delete('/salon/room/'+idroom);
		}
	}
}]);

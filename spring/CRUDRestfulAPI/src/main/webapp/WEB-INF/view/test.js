$(document).ready(function() {
   $.ajax({
      url: "http://localhost:8081/CRUDRestfulAPI_war_exploded/capitals"
   }).then(function(data) {
      $('#id').append(data);
   });
});

var gender= document.getElementsByName("gender");       // to get the list of all radio buttons of type gender
var vehicle= document.getElementsByName("vehicle");     // to get the list of all radio buttons of type vehicle
var res = document.getElementById("display");
function printRes(){
  res.innerHTML="";
  for( var i =0;i<gender.length;i++){
    if(gender[i].checked){
      res.innerHTML += "gender is:- "+gender[i].value;
    }
  }
  for( var i =0;i<vehicle.length;i++){
    if(vehicle[i].checked){
      res.innerHTML +=" and vehicle is:- "+ vehicle[i].value;
    }
 }
}

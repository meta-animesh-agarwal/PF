var addbtn = document.getElementById('add');
var task = document.getElementById('content');
var pri = document.getElementById('priority');
var date = document.getElementById('date');
var maindiv = document.getElementById('showtask');
var currentTask= document.getElementById('current');
var completelist = document.getElementById('showcompletedtask');
var completelistpara = document.getElementById('text');
addbtn.onclick = function(){
  if (typeof(Storage) !== "undefined") {
    // Store
    var obj = {
      "pri" : pri.value,
      "date" : date.value,
      "status" : 0,
      "completeDate" : null
    };
    localStorage.setItem(task.value, JSON.stringify(obj));
    addtolist(task.value, pri.value , date.value);
  } else {
      document.getElementById("result").innerHTML = "Sorry, your browser does not support Web Storage...";
  }
}
function addtolist(taskvalue , privalue , datevalue) {
  var div = document.createElement("Div");
  var btn = document.createElement("BUTTON");
  btn.style.height = "16px";
  btn.style.width = "16px";
  btn.style.background = "white";
  btn.style.backgroundImage = "url('https://cdn0.iconfinder.com/data/icons/pixon-1/24/Close_delete_outline_remove-16.png')";
  btn.style.border = "none";
  btn.onclick = function(e){
    deletetask(e.target, taskvalue);
  }
  div.appendChild(btn);
  var btntask = document.createElement("button");
  btntask.style.background = "white";
  btntask.style.border = "none";
  btntask.style.height = "16px";
  btntask.style.width = "auto";
  btntask.innerHTML = taskvalue;
  btntask.setAttribute("data-toggle","tooltip");
  btntask.setAttribute("data-placement","bottom");
  btntask.setAttribute("title","Click to move to completed task");
  btntask.style.padding = "none";
  btntask.style.cursor = "pointer";
  btntask.onclick = function(e){
    handlechangefromMain(e.target , btntask.innerHTML);
  }
  btntask.style.boder = "none";
  btntask.style.display = "inline";
  div.appendChild(btntask);
  var p = document.createElement("p")
  p.innerHTML = "[ " + privalue + " ] ";
  p.style.display = "inline";
  div.appendChild(p);
  var pdate = document.createElement("p")
  pdate.innerHTML = " { " + datevalue + " }";
  pdate.style.display = "inline";
  div.appendChild(pdate);
  insertAfter(div,currentTask);
}

function addtocompletelist(taskvalue , privalue, completeDate) {
  var div = document.createElement("Div");
  var btntask = document.createElement("button");
  btntask.style.background = "white";
  btntask.style.border = "none";
  btntask.style.height = "20px";
  btntask.style.width = "auto";
  btntask.style.cursor = "pointer";
  var striketag = document.createElement("strike");
  striketag.innerHTML = taskvalue;
  btntask.appendChild(striketag);
  btntask.onclick = function(e){
    handlechangefromMain(e.target , striketag.innerHTML);
  }
  btntask.style.boder = "none";
  btntask.setAttribute("data-toggle","tooltip");
  btntask.setAttribute("data-placement","bottom");
  btntask.setAttribute("title","Click to move to current task");
  btntask.style.display = "inline";
  div.appendChild(btntask);
  var p = document.createElement("p")
  p.innerHTML = "[ " + privalue + " ] ";
  p.style.display = "inline";
  div.appendChild(p);
  var pdate = document.createElement("p")
  pdate.innerHTML =" { " + completeDate + " }";
  pdate.style.display = "inline";
  div.appendChild(pdate);
  insertAfter(div , completelistpara);
}
function insertAfter(newNode, referenceNode) {
    referenceNode.parentNode.insertBefore(newNode, referenceNode.nextSibling);
}
function handlechangefromMain(btn, name){
  var obj;
  for(i = 0 ; i < localStorage.length ; i++){
    var key = localStorage.key(i);
    obj = JSON.parse(localStorage.getItem(key));
    if(obj.status == 0){
      if(key == name){
        obj.status = 1;
        obj.completeDate = fetchDate();
        addtocompletelist(key, obj.pri, obj.completeDate);
        removeItemFromCurrent(key);
        localStorage.setItem(key , JSON.stringify(obj));
        break;
      }
    }
    else{
      if(key == name){
        obj.status = 0;
        addtolist(key , obj.pri, obj.date);
        removeItemFromCompleted(key);
        localStorage.setItem(key , JSON.stringify(obj));
        break;
      }
    }
  }
}

function onload(){
  clearall();
  var key;
  document.getElementById("date").value = fetchDate();
  for(var i = 0 ; i < localStorage.length ; i++){
    key = localStorage.key(i);
    var obj = JSON.parse(localStorage.getItem(key));
    if(obj.status == 0) {
      addtolist(key,obj.pri,obj.date);
    }
    else {
      addtocompletelist(key,obj.pri,obj.date);
    }
  }
}
function sortAscending(){
  clearall();
  var key;
  document.getElementById("date").value = fetchDate();
  for(var i = localStorage.length - 1; i >= 0 ;i--){
    key = localStorage.key(i);
    var obj = JSON.parse(localStorage.getItem(key));
    if(obj.status == 0) {
      addtolist(key,obj.pri,obj.date);
    }
    else {
      addtocompletelist(key,obj.pri,obj.date);
    }
  }
}
function clearall() {
  var innerDivs = maindiv.getElementsByTagName("DIV");
  var innerDivs1 = completelist.getElementsByTagName("DIV");
  var mainlength = innerDivs.length;
  var completedlength = innerDivs1.length;
  for(var i = 0 ; i < mainlength ; i++)
  {
       innerDivs[0].remove();
  }
  for(var i = 0 ; i < completedlength ; i++)
  {
       innerDivs1[0].remove();
  }
}
function fetchDate() {
  var today = new Date();
  var dd = today.getDate();
  var mm = today.getMonth()+1;
  var yyyy = today.getFullYear();
  if(dd<10) {
      dd = '0'+dd
  }
  if(mm<10) {
      mm = '0'+mm
  }
  today = yyyy+"-"+mm+"-"+dd;
  return today;
}
function removeItemFromCurrent(taskName) {
  var innerDivs = maindiv.getElementsByTagName("DIV");
  for(var i = 0 ; i < innerDivs.length ; i++)
  {
     var key = innerDivs[i].getElementsByTagName("button");
     if(key[1].innerHTML == taskName){
       innerDivs[i].remove();
     }
  }
}
function removeItemFromCompleted(taskName) {
  var innerDivs = completelist.getElementsByTagName("DIV");
  for(var i = 0 ; i < innerDivs.length ; i++)
  {
     var key = innerDivs[i].getElementsByTagName("button");
     var striketag = key[0].getElementsByTagName("strike");
     if(striketag[0].innerHTML == taskName){
       innerDivs[i].remove();
     }
  }
}
function deletetask(btn,taskvalue){
  if(confirm("want's to delete task : "+taskvalue)){
    var innerDivs = maindiv.getElementsByTagName("DIV");
    for(var i = 0 ; i < innerDivs.length ; i++)
    {
       var key = innerDivs[i].getElementsByTagName("button");
       var tempbtn = innerDivs[i].getElementsByTagName("button");
       if(btn == tempbtn[0]){
         innerDivs[i].remove();
         localStorage.removeItem(key[1].innerHTML);
       }
    }
  }
}

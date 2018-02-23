var inputDiv = document.getElementById("input");
var addButton = document.getElementById("add");
var outputDiv = document.getElementById("output");
var okButton = document.getElementById("ok");
var backButton = document.getElementById("back");
var inputTable = document.getElementById("input-table");
var outputTable = document.getElementById("output-table");

function addTableHeader(){
  var div = document.createElement("DIV");
  var name = document.createElement("input");
  var min = document.createElement("input");
  var max = document.createElement("input");
  name.value = "NAME";
  name.style.border = "none";
  name.style.textAlign = "center";
  div.appendChild(name);
  min.value = "MINIMUM";
  min.style.border = "none";
  min.style.textAlign = "center";
  div.appendChild(min);
  max.value = "MAXIMUM";
  max.style.border = "none";
  max.style.textAlign = "center";
  div.appendChild(max);
  inputDiv.insertBefore(div,okButton);
}
function addInputElement(){
  var div = document.createElement("DIV");
  var name = document.createElement("input");
  var min = document.createElement("input");
  var max = document.createElement("input");
  div.appendChild(name);
  div.appendChild(min);
  div.appendChild(max);
  inputDiv.insertBefore(div,okButton);
}

addButton.onclick = function(e) {
  addInputElement();
}

okButton.onclick = function(e){
  inputDiv.style.display = "none";
  outputDiv.style.display = "inline";
}

backButton.onclick = function(e){
  inputDiv.style.display = "inline";
  outputDiv.style.display = "none";
}

var first=null;
var last = null;

function new_node() {
  var data = document.getElementById('data').value;
  if(data != "") {
    var node = new Object();
    node.data = data;
    node.next =  null;
    if(first == null) {
      first = node;
    }
    else {
    last.next = node;
    }
    last = node;
    alert("Data entered successfully");
  }
  else {
    alert("data cant be empty");
  }
}
function printq() {
  var temp = first;
  while(temp!=null){
    console.log(temp.data);
    temp = temp.next;
  }
}

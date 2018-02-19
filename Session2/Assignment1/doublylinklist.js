var first=null;
var last = null;

function new_node() {
  var data = document.getElementById('data').value;
  if(data != "") {
    var node = new Object();
    node.data = data;
    document.getElementById('data').value = "";
    node.next =  null;
    node.previous = last;
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
function printforward() {
  var temp = first;
  while(temp!=null){
    console.log(temp.data);
    temp = temp.next;
  }
}
  function printbackward() {
    var temp = last;
    while(temp!=null){
      console.log(temp.data);
      temp = temp.previous;
    }
}

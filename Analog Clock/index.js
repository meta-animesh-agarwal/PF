function getTime() {
  var today = new Date();
  var h = today.getHours();
  var m = today.getMinutes();
  return [h,m];
}

function clockUpdate() {
  var time = getTime();
  var hDegree = ((time[0] * 30) + (time[1] / 2)) + 85;
  var mDegree = (time[1] * 6) + 90;

  var minHand = document.querySelector(".minHand");
  var hourHand = document.querySelector(".hourHand");
  minHand.style.transform = "rotate("+mDegree+"deg) translate(-50% ,-50%)";
  hourHand.style.transform = "rotate("+hDegree+"deg) translate(-50% ,-50%)";
}

function onLoad() {
  setInterval(clockUpdate, 1000);
}

function getTime()
{
	var data = new Date();
	var god = data.getHours();
	var min = data.getMinutes();
	var sek = data.getSeconds();

	return ""+god+
		((min<10)?":0":":")+min+
		((sek<10)?":0":":")+sek;
}

document.getElementById('czas').innerHTML = getTime();

setInterval(function() {

	document.getElementById('czas').innerHTML = getTime();

}, 1000);
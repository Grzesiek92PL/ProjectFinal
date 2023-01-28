const timer = document.getElementById('timer');

function time() {
    let date = new Date(),
        hour = date.getHours(),
        min = date.getMinutes(),
        sec = date.getSeconds();

    timer.innerHTML = `${hour} : ${zero(min)} : ${zero(sec)}`;
    setTimeout(time, 1000);
}

function zero(n){
    return (n<10?' 0' :'')  + n;
}

time();


/*
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
*/


/*
function odliczanie()
	{
		var dzisiaj = new Date();


		var godzina = dzisiaj.getHours();
		if (godzina<10) godzina = "0"+godzina;

		var minuta = dzisiaj.getMinutes();
		if (minuta<10) minuta = "0"+minuta;

		var sekunda = dzisiaj.getSeconds();
		if (sekunda<10) sekunda = "0"+sekunda;

		document.getElementById("zegar").innerHTML = godzina+":"+minuta+":"+sekunda;

		 setTimeout("odliczanie()",1000);
	}*/

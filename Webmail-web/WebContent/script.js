/**
 * Created by badre on 24/11/2016.
 */
var xhr = new XMLHttpRequest();

var callback = function() {

    if(xhr.readyState == 4) {
        console.log('reponse : '+xhr.responseText);

        var mel = JSON.parse(xhr.responseText);

        console.log(mel.lastName);
        document.getElementById("lastname").innerHTML = mel.lastName;
        document.getElementById("firstname").innerHTML = mel.firstName;
        document.getElementById("power").innerHTML = mel.power;
        document.getElementById("alias").innerHTML = mel.alias;

    }

}

var getAvenger = function() {
    var id = document.getElementById('idMel').value;
    var url = 'http://localhost:8080/mels/app/rest/mels/'+id;
    xhr.open('get', url, true);
    xhr.send();
    xhr.onreadystatechange = callback;
}

var callbackSave = function() {
    if(xhr.readyState == 4) {
        alert('mel sauvegardé');
    }
}
var saveMel = function() {
    var mel ={
                    alias:document.getElementById("aliasInput").value,
                    power:document.getElementById("powerInput").value,
                    firstName:document.getElementById("firstNameInput").value,
                    lastName:document.getElementById("lastNameInput").value

                };

    var str = JSON.stringify(mel);

    var url = 'http://localhost:8080/mels/app/rest/mels/';
    xhr.open('post', url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.send(str);
    xhr.onreadystatechange = callbackSave;

}

window.onload = function() {
    document.getElementById('loadMel').onclick = getMel;
    document.getElementById('saveMel').onclick = saveMel;
}

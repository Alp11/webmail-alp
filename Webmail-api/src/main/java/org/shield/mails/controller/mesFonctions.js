/**
 * Created by badre on 25/11/2016.
 */

var init = function(Monscope, Monhttp) {
    console.log('init()');

    var url = 'http://localhost:8080/Webmail-api/app/rest/mails/';
    Monhttp.get(url).then(function(resp) {
        Monscope.melRec = resp.data;
        Monscope.melEnv = resp.data;
        Monscope.size = resp.data.length;
    });
}

var deleteMel = function(id, Monhttp, Monscope) {
    var url = 'http://localhost:8080/Webmail-api/app/rest/mails/'+id;
    Monhttp.delete(url).then(function() {
        init(Monscope, Monhttp);
    });
}

var getMel = function(id, Monscope, Monhttp) {
    console.log('init()');
    var url = 'http://localhost:8080/Webmail-api/app/rest/mails/'+id;
    console.log(url);
    Monhttp.get(url).then(function(resp) {
        console.log(resp.data);
        Monscope.av = resp.data;
    });
}


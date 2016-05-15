var url='http://localhost:8080';
var ws=null;
$(document).ready(function() {    
    ws=new SockJS(url+'/stomp');
    var stompClient = Stomp.over(ws);
    stompClient.connect({}, function () {
        stompClient.subscribe("/topic/clock", function (data) {            
            var messageList = document.getElementById("heureServer");
            messageList.innerHTML = data.body;
        });
    });
});
function init(){
    var messageList = document.getElementById("heureServer");
    messageList.innerHTML = getDefaultServerDate();
}
function connect(){    
     ws=new SockJS('/stomp');
     var stompClient = Stomp.over(ws);
     stompClient.connect({}, function () {
        stompClient.subscribe("/topic/clock", function (data) {
            console.log(data);
            var messageList = document.getElementById("heureServer");
            messageList.innerHTML = data.body;
        });
    });
}
function getDefaultServerDate(){
    var date=null;
    $.ajax({
        url: url+'/clock',
        type:'GET',
        contentType: 'application/json',
        async:false

    }).success(function (data) {
        date=data;
    });
    return date;
}
function getServerDate(){
    var date=null;
    $.ajax({
        url: url+'/clock/hhMMssda',
        type:'GET',
        contentType: 'application/json',
        async:false

    }).success(function (data) {
        date=data;
    });
    return date;
}
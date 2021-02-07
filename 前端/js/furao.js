
function addPlayer(id,playername,order){
	var addplayer = {
	  "url": "http://localhost:8086/player/addPlayer",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	  "data": JSON.stringify({"player_id":id,"name":playername,"order":order}),
	};
	
	$.ajax(addplayer).done(function (response) {
	  console.log(playername);
	});
}
function insertReferee(crown_num,heap_first,heap_last){
	var settings = {
	  "url": "http://localhost:8086/referee/insertReferee",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	  "data": JSON.stringify({"crown_num":crown_num,"heap_first":heap_first,"heap_last":heap_last}),
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}


function initCard(){
	var init = {
	  "url": "http://localhost:8086/external/initialize",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(init).done(function (response) {
	  console.log(response);
	});
}

function getHeapfirst(){
	let heapfirst;
	var getfirst = {
		async:false,
	  "url": "http://localhost:8086/referee/getHeapfirst?id=1",
	  "method": "GET",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(getfirst).done(function (response) {
		 heapfirst=response;
			console.log(heapfirst);
			
	});
	return heapfirst;
	//console.log(heapfirst);
	
}

function selectFirstcard(order){
	let cardorder;
	var selectfirst = {
		async:false,
	  "url": "http://localhost:8086/external/selectFirstcard?order="+order,
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	$.ajax(selectfirst).done(function (response) {
	  cardorder=response;
	 console.log(cardorder);
	});
	return cardorder;
}

function cardTohand(playerid,order,cardid){
	var settings = {
	  "url": "http://localhost:8086/external/heapTohand",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	  "data": JSON.stringify({"player_id":playerid,"order":order,"card_id":cardid}),
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

function cardTolast(cardid){
	var settings = {
	  "url": "http://localhost:8086/external/heapTolast?card_id="+cardid,
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

function deleteAll(){
	var settings = {
	  "url": "http://localhost:8086/delete/deleteAll",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

function refresh(playerid){
	var settings = {
	  "url": "http://localhost:8086/player/getPlayer?id="+playerid,
	  "method": "GET",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	  $("#hand"+playerid).html(response.card_num);
	  $("#money"+playerid).html(response.money);
	  $("#point"+playerid).html(response.point);
	  $("#role"+playerid).html(response.role_id);
	  $("#noble"+playerid).html(response.noble);
	  $("#religious"+playerid).html(response.religious);
	  $("#trade"+playerid).html(response.trade);
	  $("#miltary"+playerid).html(response.miltary);
	  $("#unique"+playerid).html(response.unique);
	});
}

function initRolestate(max,choice){
	var settings = {
	  "url": "http://localhost:8086/external/initRolestate?max="+max+"&choice="+choice,
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

function getRolestate(){
	let rolestate;
	var settings = {
		async:false,
	  "url": "http://localhost:8086/external/getRolestate",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	  rolestate=response;
	});
	return rolestate;
}

function updateRoleleft(id,n){
	var settings = {
	  "url": "http://localhost:8086/role/updateRoleleft?id="+id+"&n="+n,
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

function getState(){
	let state=0;
	var settings = {
		async:false,
	  "url": "http://localhost:8086/referee/getState?id=1",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	  state=response;
	});
	return state;
}

function getStateorder(){
	let stateorder=0;
	var settings = {
		async:false,
	  "url": "http://localhost:8086/referee/getStateorder?id=1",
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	  stateorder=response;
	});
	return stateorder;
}
//这里没有id属性列表，referee的默认id=“1”，多盘游戏需要插入id属性
function setNextstate(state,order){
	var settings = {
	  "url": "http://localhost:8086/external/setNextstate?state="+state+"&order="+order,
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

function updateMoney(id,num){
	var settings = {
	  "url": "http://localhost:8086/player/updateMoney?id="+id+"&num="+num,
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

function addMoney(id,num){
	var settings = {
	  "url": "http://localhost:8086/external/addMoney?id="+id+"&num="+num,
	  "method": "POST",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(settings).done(function (response) {
	  console.log(response);
	});
}

//测试专用
function f(){
	
	let heapfirst;
	var getfirst = {
		async:false,
	  "url": "http://localhost:8086/referee/getHeapfirst?id=1",
	  "method": "GET",
	  "timeout": 0,
	  "headers": {
	    "Content-Type": "application/json"
	  },
	};
	
	$.ajax(getfirst).done(function (response) {
		 heapfirst=response;
			console.log(heapfirst);
			
	});
	return heapfirst;
}

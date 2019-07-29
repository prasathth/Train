/*
var print = function(message)
{
	console.log(message);
}
print("Hello");

var loop = 5;

function add(x,y){
	console.log("Add "+(x+y));
}

for(var i=1;i<=loop;i++){
	console.log(i);
}

console.log(i);

add(10,10);

var a = [
	{
		id:1,
		name:'Ramesh'
	},
	{
		id:11,
		name:'Ganesh'
	}

];

console.log(a);
console.log(a[0]);
console.log(a[0].id);
console.log(a[0].name);

for(var i=0;i<a.length;i++)
{
	console.log(a[i].id);
	console.log(a[i]['name']);	
}


let show = function(a){

	console.log("args");
	console.log(arguments);
	for(var i=0;i<a.length;i++)
	{
		console.log(a[i].id);
		console.log(a[i]['name']);	
	}
}

show(a);

let c = function(m,n){
	return m+n;
}

let mul = function(m,n){
	return m*n;
}

let div = function(m,n){
	return m/n;
}

let calculate = function(m,n,fun){
	return fun(m,n);
}


console.log(calculate("A","C",c));

var func_fun = function(a,b){
	var func = function(s){
		console.log("welcome "+s+a+" "+b);
	}
	return func;
}

var str = func_fun("manish","pandey");
str("to team ");

var xyz = {
	id:10,
	name:'note',
	price:30,
	getPrice: function(){
		return this.price;
	},
	getName: function(){
		return this.name;
	}
}

console.log(xyz.getPrice());
array = [];
array[0]="xyz";
array[1]="aus";

var tes = function(array){

	//console.log(this.first+" "+str);
	console.log(array);
}

var ob ={
	first:"ravi",
	second:"ramu"
};

//tes.call(ob);

tes.call(ob,"ab company");
tes.call(ob,array);
var rebind = tes.bind(ob,array);
rebind();


let a1 = function(c,d){
	var cc = c;
	var dd = d;
	var a2 = function(e,){
		console.log(cc+" "+dd+" "+e);
		console.log("good");
	}
	return a2;
}

let aa = a1("abc","cba");
aa("bbb");
aa("a","aa","a");



//----------------------closures-----------------

var fun = function(){
	var id=0;
	var name='ram';
	var func = {
		getName:function(){
			return name;
		},
		setName:function(nam){
			name=nam;
		},
		getId:function(){
			return id;
		},
		setId:function(idd){
			id=idd;
		}
	}
	return func;
};

var ret = fun();
var r = fun();
r.setId(4);
console.log(r.getId());
ret.setName('kumar');
console.log(ret.getName()); 
ret.setId(200);
console.log(ret.getId());
console.log(ret);

let funn = function(){
	console.log('q is ${q}');
	console.log('w ${w}');
	var w = 0 ;
	for(let h=0;h<5;h++){

	}
	console.log(h);
}()


console.log(w);
console.log(q);



*/
//-------arrow functions

let sum = (x,y)=>x+y;
let sub = (x,y)=>x-y;
let mul = (x,y)=>x*y;

let calculate = (x,y,fun)=>fun(x,y);

console.log(calculate("hi ","welcome ", sum));

let users = 
	[
  {
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "address": {
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874",
      "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"
      }
    },
    "phone": "1-770-736-8031 x56442",
    "website": "hildegard.org",
    "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
    }
  },
  {
    "id": 2,
    "name": "Ervin Howell",
    "username": "Antonette",
    "email": "Shanna@melissa.tv",
    "address": {
      "street": "Victor Plains",
      "suite": "Suite 879",
      "city": "Wisokyburgh",
      "zipcode": "90566-7771",
      "geo": {
        "lat": "-43.9509",
        "lng": "-34.4618"
      }
    },
    "phone": "010-692-6593 x09125",
    "website": "anastasia.net",
    "company": {
      "name": "Deckow-Crist",
      "catchPhrase": "Proactive didactic contingency",
      "bs": "synergize scalable supply-chains"
    }
  },
  {
    "id": 3,
    "name": "Clementine Bauch",
    "username": "Samantha",
    "email": "Nathan@yesenia.net",
    "address": {
      "street": "Douglas Extension",
      "suite": "Suite 847",
      "city": "McKenziehaven",
      "zipcode": "59590-4157",
      "geo": {
        "lat": "-68.6102",
        "lng": "-47.0653"
      }
    },
    "phone": "1-463-123-4447",
    "website": "ramiro.info",
    "company": {
      "name": "Romaguera-Jacobson",
      "catchPhrase": "Face to face bifurcated interface",
      "bs": "e-enable strategic applications"
    }
  },
  {
    "id": 4,
    "name": "Patricia Lebsack",
    "username": "Karianne",
    "email": "Julianne.OConner@kory.org",
    "address": {
      "street": "Hoeger Mall",
      "suite": "Apt. 692",
      "city": "South Elvis",
      "zipcode": "53919-4257",
      "geo": {
        "lat": "29.4572",
        "lng": "-164.2990"
      }
    },
    "phone": "493-170-9623 x156",
    "website": "kale.biz",
    "company": {
      "name": "Robel-Corkery",
      "catchPhrase": "Multi-tiered zero tolerance productivity",
      "bs": "transition cutting-edge web services"
    }
  },
  {
    "id": 5,
    "name": "Chelsey Dietrich",
    "username": "Kamren",
    "email": "Lucio_Hettinger@annie.ca",
    "address": {
      "street": "Skiles Walks",
      "suite": "Suite 351",
      "city": "Roscoeview",
      "zipcode": "33263",
      "geo": {
        "lat": "-31.8129",
        "lng": "62.5342"
      }
    },
    "phone": "(254)954-1289",
    "website": "demarco.info",
    "company": {
      "name": "Keebler LLC",
      "catchPhrase": "User-centric fault-tolerant solution",
      "bs": "revolutionize end-to-end systems"
    }
  },
  {
    "id": 6,
    "name": "Mrs. Dennis Schulist",
    "username": "Leopoldo_Corkery",
    "email": "Karley_Dach@jasper.info",
    "address": {
      "street": "Norberto Crossing",
      "suite": "Apt. 950",
      "city": "South Christy",
      "zipcode": "23505-1337",
      "geo": {
        "lat": "-71.4197",
        "lng": "71.7478"
      }
    },
    "phone": "1-477-935-8478 x6430",
    "website": "ola.org",
    "company": {
      "name": "Considine-Lockman",
      "catchPhrase": "Synchronised bottom-line interface",
      "bs": "e-enable innovative applications"
    }
  },
  {
    "id": 7,
    "name": "Kurtis Weissnat",
    "username": "Elwyn.Skiles",
    "email": "Telly.Hoeger@billy.biz",
    "address": {
      "street": "Rex Trail",
      "suite": "Suite 280",
      "city": "Howemouth",
      "zipcode": "58804-1099",
      "geo": {
        "lat": "24.8918",
        "lng": "21.8984"
      }
    },
    "phone": "210.067.6132",
    "website": "elvis.io",
    "company": {
      "name": "Johns Group",
      "catchPhrase": "Configurable multimedia task-force",
      "bs": "generate enterprise e-tailers"
    }
  },
  {
    "id": 8,
    "name": "Nicholas Runolfsdottir V",
    "username": "Maxime_Nienow",
    "email": "Sherwood@rosamond.me",
    "address": {
      "street": "Ellsworth Summit",
      "suite": "Suite 729",
      "city": "Aliyaview",
      "zipcode": "45169",
      "geo": {
        "lat": "-14.3990",
        "lng": "-120.7677"
      }
    },
    "phone": "586.493.6943 x140",
    "website": "jacynthe.com",
    "company": {
      "name": "Abernathy Group",
      "catchPhrase": "Implemented secondary concept",
      "bs": "e-enable extensible e-tailers"
    }
  },
  {
    "id": 9,
    "name": "Glenna Reichert",
    "username": "Delphine",
    "email": "Chaim_McDermott@dana.io",
    "address": {
      "street": "Dayna Park",
      "suite": "Suite 449",
      "city": "Bartholomebury",
      "zipcode": "76495-3109",
      "geo": {
        "lat": "24.6463",
        "lng": "-168.8889"
      }
    },
    "phone": "(775)976-6794 x41206",
    "website": "conrad.com",
    "company": {
      "name": "Yost and Sons",
      "catchPhrase": "Switchable contextually-based project",
      "bs": "aggregate real-time technologies"
    }
  },
  {
    "id": 10,
    "name": "Clementina DuBuque",
    "username": "Moriah.Stanton",
    "email": "Rey.Padberg@karina.biz",
    "address": {
      "street": "Kattie Turnpike",
      "suite": "Suite 198",
      "city": "Lebsackbury",
      "zipcode": "31428-2261",
      "geo": {
        "lat": "-38.2386",
        "lng": "57.2232"
      }
    },
    "phone": "024-648-3804",
    "website": "ambrose.net",
    "company": {
      "name": "Hoeger LLC",
      "catchPhrase": "Centralized empowering task-force",
      "bs": "target end-to-end models"
    }
  }
]

users.filter(user=>user.id>5).map(user=>({name:user.username,website:user.website})).forEach(user=>console.log(user));
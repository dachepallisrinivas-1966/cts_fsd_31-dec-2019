interface Person {
    name : string;
    age : number;
    toString : () => string;
}

interface Student extends Person {
    course : string;
}

function print(v : Person) : void {
    console.log(v.toString());
}

let p1 : Person = {
    name : "Dachepalli Srinivas",
    age : 53,
    toString : function() {
        return this.name + " : " + this.age;
    }
};

print(p1);

let s1 : Student = {
    name : "Sowmya",
    age : 20,
    course : "Angular",
    toString : function() {
        return this.name + " - " + this.age + " - " + this.course;
    }
}

print(s1);
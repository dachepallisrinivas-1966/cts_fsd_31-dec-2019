interface Employee {
    name : string;
    id : number;
}

let e1 : Employee = {
    name : "Dachepalli Srinivas",
    id : 101
}

interface Cosmetic {
    name : string;
    id : number;
    price : number;
}

let c1 : Cosmetic = {
    name : "Aloe Vera Gel",
    id : 201,
    price : 500
}

interface Visitor {
    name : string;
    id : number;
    cameFrom : string;
}

let v1 : Visitor = {
    name : "Deepesh",
    id : 301,
    cameFrom : "New Jercy"
}

function show (employee : Employee) {
    console.log(employee.id + "=>"+employee.name);
}

show(e1);

/* actually print function takes employee, but we are passing cosmetic object
as well as Visitor object.
still it work.
because even cosmetic class  and Visitor class are also contain all properties 
of employee.
this is what is known as ducktyping.
 */
show(c1);          
show(v1);
interface Employee {
    name : string;
    id : number;
}

let e1 : Employee = {
    name : "Dachepalli Srinivas",
    id : 101
}

function print (employee : Employee) {
    console.log(employee.id + "=>"+employee.name);
}

print(e1);

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

/* actually print function takes employee, but we are passing cosmetic object.
still it work.
because even cosmetic class is also contain all properties of employee.
this is what is known as ducktyping.
 */
print(c1);          

// interface Student {
//     name : string;
//     id : number;
//     fee : number;
// }

// let student : Student = {
//     name : "Meghana",
//     id : 201,
//     fee : 50000
// }

// print(student);





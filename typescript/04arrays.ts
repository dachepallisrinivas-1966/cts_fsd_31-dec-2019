var marks : number[];
marks = [60,70,66];

var subjects : string[] = ["Java", "TypeScript","Angular","Mongo DB","Node JS","Express JS","React JS"];

for(var sub of subjects) {
    console.log(sub);
}

subjects.push("jQuery");
subjects.push("ES6");

console.log("-------------------------------");
for(var sub of subjects) {
    console.log(sub);
}

console.log("-------------------------------");
console.log("Top Element = " + subjects.pop());

console.log("-------------------------------");

// retrieve elements at index 1,2,3,4
console.log(subjects.slice(1,5));       
console.log("-------------------------------");

// splice method changes the content of an array.
console.log(subjects.splice(2,0,"Angular 8"));
for(var sub of subjects) {
    console.log(sub);
}
console.log("-------------------------------");

// join method insert the given string between each elements in array
var str = subjects.join(" + ");
console.log(str);







// create tuple
// tuple is a heterogeneous collection of values
var tup = ["C++",45,3500];
console.log("Course Name : " + tup[0]);
console.log("Duration : " + tup[1]);
console.log("Fee : " + tup[2]);
console.log("--------------------------------------------------");

// Destructuring (un-packing)
var [courseTitle, duration, fee] = tup;
console.log("Course Name : " + courseTitle);
console.log("Duration : " + duration);
console.log("Fee : " + fee);
console.log("--------------------------------------------------");

// for of loop
for(var v of tup) {
    console.log(v);
}

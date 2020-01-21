arr1 = [];
arr2 = new Array();

arr3 = ["Rahul","Vamsy","Uma","Latha","Srinu"];

console.log(arr3);
console.log(arr3.length);

arr3.sort();
console.log(arr3);

arr1.push("Ant");
arr1.push("Elephant");
arr1.push("Tiger");
arr1.push("Zebra");
console.log(arr1);

arr1.pop();
console.log(arr1);

arr3.splice(2,3);           // splice(index, howmany)
console.log(arr3);

/*

arr3.slice  //creates a new copy of the existing array
arr3.concat //concats two or more arrays into a new array
arr3.filter 
arr3.map  

arr3.find
arr3.findIndex
*/
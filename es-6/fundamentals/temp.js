arr = [10,20,30,40,50,5,6,7,8];

for(i=0; i<arr.length; i++) {
    console.log(arr[i]);
}
console.log("--------------------------------");
for(let ele of arr) {
    console.log(ele);
}
console.log("--------------------------------");
for(let ele in arr) {
    console.log(arr[ele]);
}


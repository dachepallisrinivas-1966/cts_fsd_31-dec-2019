var nums : number[] = [11,22,33];

// classic for loop
for(var i=0; i<nums.length; i++) {
    console.log(nums[i]);
}

// for..of loop     element is taken
for(var n of nums) {
    console.log(n);
}

// for..in loop     index is taken
for(let n in nums) {
    console.log(n);
}
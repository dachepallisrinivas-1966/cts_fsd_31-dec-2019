greet = function(userName="Srinu"){
    console.log("Hello " + userName);
}

setTimeout(greet,2000);
setTimeout(()=>{greet("Vamsy");},1000);
console.log("Program Terminated");
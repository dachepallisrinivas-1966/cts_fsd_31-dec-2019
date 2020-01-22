// rest parameters (varargs)
function print(message : string, ...names:string[]) {
    for(let n of names) {
        console.log(message + " " + n);
    }
}

print("Hello ", "John", "Deo");
print("Hai ", "Anders Hejlsberg", "Rod Jhonson", "Bjarne Stroustrup", "Dennis Ritchie");


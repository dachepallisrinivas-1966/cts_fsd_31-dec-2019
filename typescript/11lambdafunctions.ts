// Normal Function
function getNextEven(n : number) : number {
    let result : number;
    result = n % 2 == 0 ? n+2 : n+1;
    return result;
}

console.log(getNextEven(5));

// Lambda Block
let nextEven = (n: number) => {             // => is called FAT ARROW
    return n =  n % 2 == 0 ? n+2 : n+1;
}

console.log(nextEven(10));

// Lambda Expression
let nextEvenNumber = (n : number) =>  n % 2 == 0 ? n+2 : n+1;

console.log(nextEvenNumber(15));


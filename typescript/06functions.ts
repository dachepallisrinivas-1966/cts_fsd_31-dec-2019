/*
    the following program produce an error
*/

function add(n1 : number, n2:number) : number {
    let result : number;
    result = n1+n2;
    return result;
}
console.log(add(10,20));

function add(n1 : number, n2:number, n3:number) : number {
    let result : number;
    result = n1+n2+n3;
    return result;
}
console.log(add(10,20,30));

function diff(n1 : number, n2 : number) : number {
    let result : number;
    result = n1-n2;
    return result;
}
console.log(diff(10,20));


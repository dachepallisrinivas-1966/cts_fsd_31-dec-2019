function f1(x:number) : void;
function f1(s:string) : void;
function f1(x:number, s:string) : void;

function f1(n:any, s?:any) {
    console.log(`Value of ${n}, Type of ${n} = ${typeof(n)}`);
    if (s) {
        console.log(`Second Parameter : ${s}`);
    }
}

f1("Type Script");
f1(10);
f1(10, "PQR");


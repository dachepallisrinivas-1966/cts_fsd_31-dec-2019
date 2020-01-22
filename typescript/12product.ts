export class Product {
    protected name : string;
    protected price : number;

    constructor(name : string, price : number) {
        this.name = name;
        this.price = price;
    }

    print() : void {
        console.log(this.name);
        console.log(this.price);
    }
}

console.log("Product");
console.log("---------------------------------------------------");
let p1 = new Product("Samsung Galaxy s9", 57900);
p1.print();

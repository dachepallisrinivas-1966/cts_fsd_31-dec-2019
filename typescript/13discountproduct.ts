import {Product} from "./12product";

class DiscountProduct extends Product {
    private discountRate: number;
    constructor(name: string, price: number, discountRate: number) {
        super(name, price);
        this.discountRate = discountRate;

    }
    print(): void {
        super.print();
        console.log(this.discountRate + "%");
    }
    getNetPrice(): number {
        return this.price - this.price * this.discountRate / 100;
    }
}

console.log("Product and Discounted Product");
console.log("---------------------------------------------------");
let p = new Product("Redmi 5 Gold", 10999);
p.print();
let dp = new DiscountProduct("Dell Laptop i7 8th Generation",76490,5);
dp.print();
console.log("Net Price : " + dp.getNetPrice());

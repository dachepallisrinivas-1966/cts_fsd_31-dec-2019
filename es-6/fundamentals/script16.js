/* closure example */

function f1() {
    x = 0;
    return function () {
        x++;
        return x;
    }
}

inc = f1();
for (i = 1; i < 10; i++) {
    console.log(inc());
}
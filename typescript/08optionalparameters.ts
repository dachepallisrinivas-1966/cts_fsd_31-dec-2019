// Optional Parameters
function print(msg?: string) {
    if (!msg) {
        msg = "Hello";
    }
    console.log(msg);
}

print();
print("TypeScript - JavaScript that Scales.");


function* countPrimesInRange(lb, ub) {
    count = 0;
    for (i = lb; i <= ub; i++) {
        curNum = i;
        factCount = 2;
        for (j = 2; j <= curNum / 2; j++) {
            if (curNum % j == 0) {
                factCount++;
            }
        }
        if (factCount == 2) {
            count++;
            yield curNum;
        }
    }
    return count;
}

function main() {
    console.log("Job Initiated!");
    stages = countPrimesInRange(10, 20);

    shallContinue = true;

    while (shallContinue) {
        currStage = stages.next();
        shallContinue = !currStage.done;
        if (shallContinue) {
            //Am here means a PRIME NUMBER is yeilded
            console.log("Detected " + currStage.value + " as prime");
        } else {
            //Am here means THE COUNT is returned
            console.log("total Number of Primes " + currStage.value);
        }
    }

    console.log("Job Terminated!");
}

main();


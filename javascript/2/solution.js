function main(N) {
    // const N = parseInt(readLine().trim(), 10);
    
    if ((N % 2 === 1) || (N % 2 === 0 && (N >= 6 && N <= 20)) ) console.log("Weird")
    else console.log("Not Weird")
    // else console.log("wEIRDO")
}

main(90)
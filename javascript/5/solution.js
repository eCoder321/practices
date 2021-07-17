function processData(input) {
    // console.log(input)
    const inputArr = input.split(" ")
    // console.log(inputArr) 
    for (i in inputArr) {
        const word = inputArr[i]
        groupWords(word)
    }
} 

function groupWords(input) {
    let i = 0
    const evenArr = []
    const oddArr = []
    while (i < input.length) {
        i % 2 === 0 ? evenArr.push(input[i]) : oddArr.push(input[i])
        i++
    }
    console.log(evenArr.join(""), oddArr.join(""))
}

processData("Bkoiwefukjwbf niuvkhrfiosr")
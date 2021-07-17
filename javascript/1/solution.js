/*
 * Complete the 'solve' function below.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */

function solve(meal_cost, tip_percent, tax_percent) {
    // Write your code here
    const additions = (tax_percent + tip_percent) / 100
    // console.log(additions)
    const finalAmount = meal_cost + (meal_cost * additions)
    console.log(Math.round(finalAmount))
}

solve(50, 20, 0)
let input = require('fs').readFileSync('stdin', 'utf8');
let valoresStdin = input.split('\n');

let raio = valoresStdin.shift();
const PI = 3.14159;

function calculaArea(){
    return (PI * Math.pow(raio, 2));
}

console.log('A='+calculaArea().toFixed(4));
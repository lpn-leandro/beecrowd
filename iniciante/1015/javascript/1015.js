let input = require('fs').readFileSync('stdin','utf8');
let lines = input.split('\n');

console.log(lines)

let x = new Array(2);
let y = new Array(2);
let valor;

for(let i = 0; i < 2; i++){ 
    valor = lines.shift();
    x[i] = parseFloat(valor.split(' '));
    console.log(x[i])
    y[i] = parseFloat(valor.split());
    console.log(y[i])
}

function distancia(){
    return Math.sqrt(Math.pow((x[1] - x[0]), 2) + Math.pow((y[1] - y[0]), 2));
}

console.log(distancia().toFixed(4));
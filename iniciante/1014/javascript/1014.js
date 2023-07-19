let input = require('fs').readFileSync('stdin', 'utf8');
let lines = input.split('\n');

let distanciaPercorrida = parseInt(lines.shift());
let totalCombustivelGasto = parseFloat(lines.shift());

function consumoMedio(){
    return distanciaPercorrida / totalCombustivelGasto;
}

console.log(consumoMedio().toFixed(3) + ' km/l');
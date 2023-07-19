let input = require('fs').readFileSync('stdin', 'utf8');
let entradaStdin = input.split('\n');

let a = parseFloat(entradaStdin.shift());
let b = parseFloat(entradaStdin.shift());
let c = parseFloat(entradaStdin.shift());

function media(){
    return ((a * 2) + (b * 3) + (c * 5)) / 10;
}

console.log('MEDIA = ' + media().toFixed(1));
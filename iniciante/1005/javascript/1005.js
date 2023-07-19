let input = require('fs').readFileSync('stdin', 'utf8');
let valoresStdin = input.split('\n');

let a = parseFloat(valoresStdin.shift());
let b = parseFloat(valoresStdin.shift());

function media(){
    return ((a * 3.5) + (b * 7.5)) / 11;
}

console.log('MEDIA = ' +  media().toFixed(5));
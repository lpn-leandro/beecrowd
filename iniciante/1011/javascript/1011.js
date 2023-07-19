var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

let raio = parseInt(lines.shift());
const PI = 3.14159;

function calculaVolume(){
    return (4.0/3) * PI * Math.pow(raio, 3);
}

console.log('VOLUME = ' + calculaVolume().toFixed(3));
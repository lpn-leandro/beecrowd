var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');

let a = parseInt(lines.shift());
let b = parseInt(lines.shift());
let c = parseInt(lines.shift());

function maiorAB(){
    return ((a+b)+Math.abs(a-b))/2;
}

function maiorABC(){
    return ((maiorAB()+c)+Math.abs(maiorAB()-c)) / 2;
}

console.log(maiorABC() + ' eh o maior');
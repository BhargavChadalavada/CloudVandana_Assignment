const str = "This is a sunny day";
console.log(str.split(' ').map((ele) => ele.split('').reverse().join('')).join(' '));
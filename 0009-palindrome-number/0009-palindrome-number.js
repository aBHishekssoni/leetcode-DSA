/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0) return false;
    else{
        x = String(x);
        if(x == x.split("").reverse().join("")) return true
    }
    return false
};
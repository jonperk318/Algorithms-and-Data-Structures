/*
LINEAR SEARCH: begins at one end of array and checks each element until the target element is found
Time Complexity:
    best case: O(1) (first element checked matches)
    average case: O(N)
Space complexity: O(N)
*/

function linearSearch(arr, key) {

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === key) return i
    }

    return -1 // key not found
}

module.exports = linearSearch;
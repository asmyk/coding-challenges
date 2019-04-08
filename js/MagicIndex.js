// [4,6,7,87,10]
// [1,1,1,4,6,7,8,9]
// [2,3,4,5,6,6,6,6,6]

// proglem from cracking codding interview
// magic index is when A[i] === i

function findMagicIndex(arr) {
  let startIndex = 0,
    endIndex = arr.length - 1;

  while (startIndex < endIndex) {
    let mid = Math.floor((endIndex + startIndex) / 2);

    if (mid === arr[mid]) {
      return mid;
    }

    if (mid < arr[mid]) {
      startIndex = mid + 1;
    } else if (mid > arr[mid]) {
      endIndex = mid - 1;
    }
  }

  return false;
}

console.log(findMagicIndex([1, 2, 3, 4, 4, 4]) === 4);
console.log(findMagicIndex([4, 6, 7, 8, 10]) === false);
console.log(findMagicIndex([1, 1, 1, 4, 6, 6, 6, 9]) === 6);
console.log(findMagicIndex([2, 3, 4, 5, 6, 6, 6, 6, 6]) === 6);

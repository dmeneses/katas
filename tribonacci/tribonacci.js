function tribonacci(initialSequence, newSequenceCount) {
  const sequenceLength = initialSequence.length;
  const newSequence = [].concat(initialSequence);

  for (let index = sequenceLength; index < newSequenceCount; index++) {
    const nextNumber = newSequence
      .slice(index - sequenceLength, index)
      .reduce((accumulator, valueToSum) => accumulator + valueToSum, 0);
    newSequence.push(nextNumber);
  }

  return newSequence;
}

console.log(tribonacci([0,1,1], 5));
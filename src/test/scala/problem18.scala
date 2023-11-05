object problem18 {
  start = 24
  end = 100
  step = 2  # The common difference between the numbers
    count = (end - start) // step + 1  # Calculate the number of terms
  total = 0

  for number in range(start, end + 1, step):
    total += number

  average = total / count
  print("The average of the series is:", average)
}

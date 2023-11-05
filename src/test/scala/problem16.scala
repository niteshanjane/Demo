object problem16 {
  start = 382
  end = 582
  total = 0

  for number in range(start, end + 1):
  if number % 2 == 0:  # Check if the number is even
    total += number

  print("The sum of even numbers between", start, "and", end, "is:", total)

}

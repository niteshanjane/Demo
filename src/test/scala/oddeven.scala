object oddeven {


  #Store a number in a variable
    num = int(input("Enter a number: "))

  #Check
  if the number is in the range 100 - 1000
  if num < 100 or num > 1000:
    print
  ("Wrong number")
  else:
  #Check if the number is even or odd
  if num % 2 == 0:
  #If even, divide the number by 3 and print the remainder
  print("Remainder when divided by 3: ", num % 3)
  else:
  #If odd, divide the number by 2 and print the remainder
  print("Remainder when divided by 2: ", num % 2);


}

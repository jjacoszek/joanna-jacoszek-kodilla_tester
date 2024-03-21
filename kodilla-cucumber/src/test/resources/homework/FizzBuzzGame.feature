Feature: FizzBuzz Game

  Scenario Outline: Check divisibility of a number by 3, 5, or both
    Given The number is <number>
    When The FizzBuzz game is played with this number
    Then Return <result>

    Examples:
      | number | result    |
      | 9      | "Fizz"    |
      | 10     | "Buzz"    |
      | 15     | "FizzBuzz"|
      | 7      | "None"    |
Feature:  Is it Summer? Everybody likes Summer

  Scenario Outline: Today is or is not Summer

    Given today is <day>
    When  I ask whether it's Summer
    Then  I should be told <answer>

 Examples:

    | day | answer |
    |last day of December| "Nope"|
    |first day of August | "Yes! Summer!"|



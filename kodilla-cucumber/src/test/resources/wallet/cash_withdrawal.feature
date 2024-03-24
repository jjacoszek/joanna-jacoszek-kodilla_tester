Feature: Cash Withdrawal

  Scenario Outline: Withdrawing from the wallet
    Given I have deposited $<initial_balance> in my wallet
    When I request $<withdrawal_amount>
    Then $<dispensed_amount> should be dispensed

    Examples:
      | initial_balance | withdrawal_amount | dispensed_amount |
      | 200             | 30                | 30               |
      | 500             | 100               | 100              |
      | 100             | 200               | 0                |
      | 0               | 50                | 0                |
      | 300             | 300               | 300              |
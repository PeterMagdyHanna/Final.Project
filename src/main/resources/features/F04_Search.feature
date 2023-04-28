@smoke
Feature:F04_Search | Users can conduct product searches

  Scenario Outline: user could search using product name
    When I go to the homepage and click on search bar and enter product name in the search par as"<products>"
    Then go from the homepage to the product page
    And search contains"<products>"
    Examples:
      | products |
      | book     |
      | laptop   |
      | nike     |

  Scenario Outline: user could search using product sku
    When  I get to the homepage, I use the search bar and type "<products>" as the search parameter
    Then The product page has the sku
    And search contains sku "<products>"
    Examples:
      | products  |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |


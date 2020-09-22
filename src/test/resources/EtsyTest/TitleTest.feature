@regressiontest @TEC-1003
Feature: Validating Title for each page

  @TEC-2004 @ui
  Scenario Outline: Validating titles
    Given User navigates to Etsy application
    When User click on "<department>" part
    Then User validates "<title>" title
    Examples:
      | department            | title                         |
      | Jewelry & Accessories | Jewelry & Accessories \| Etsy |
      | Clothing & Shoes      | Clothing & Shoes \| Etsy      |
      | Home & Living         | Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone        |
      | Wedding & Party       | Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone       |
      | Toys & Entertainment  | Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone |
      | Art & Collectibles    | Art & Collectibles \| Etsy    |
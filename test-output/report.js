$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Parul Gulati/eclipse-workspace/Swym/src/main/java/features/productPage.feature");
formatter.feature({
  "line": 1,
  "name": "Sywm",
  "description": "",
  "id": "sywm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Demo Swym Products page",
  "description": "",
  "id": "sywm;demo-swym-products-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on products page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "product page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify size option is clickable",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify color dropdown is clickable",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify add to wishlist button is enabled and add the product to the wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should be navigated to the wishlist page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user should be able to see the product in the wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on the email button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on connect button and enter email address",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be see email sent response message",
  "keyword": "Then "
});
formatter.match({
  "location": "productPage.user_is_already_on_products_page()"
});
formatter.result({
  "duration": 9112453480,
  "status": "passed"
});
formatter.match({
  "location": "productPage.product_page_is_displayed()"
});
formatter.result({
  "duration": 1098553126,
  "status": "passed"
});
formatter.match({
  "location": "productPage.verify_size_option_is_clickable()"
});
formatter.result({
  "duration": 52442776,
  "status": "passed"
});
formatter.match({
  "location": "productPage.verify_color_dropdown_is_clickable()"
});
formatter.result({
  "duration": 41696662,
  "status": "passed"
});
formatter.match({
  "location": "productPage.verify_add_to_cart_button_is_enabled()"
});
formatter.result({
  "duration": 153249419,
  "status": "passed"
});
formatter.match({
  "location": "productPage.user_should_be_navigated_to_the_cart_page()"
});
formatter.result({
  "duration": 287994683,
  "status": "passed"
});
formatter.match({
  "location": "productPage.user_should_be_able_to_see_the_product_in_the_wishlist()"
});
formatter.result({
  "duration": 481551315,
  "status": "passed"
});
formatter.match({
  "location": "productPage.click_on_the_email_button()"
});
formatter.result({
  "duration": 4784348051,
  "status": "passed"
});
formatter.match({
  "location": "productPage.click_on_connect_button_and_enter_email_address()"
});
formatter.result({
  "duration": 532993179,
  "status": "passed"
});
formatter.match({
  "location": "productPage.user_should_be_see_email_sent_response_message()"
});
formatter.result({
  "duration": 1494543615,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat definition.productPage.user_should_be_see_email_sent_response_message(productPage.java:110)\r\n\tat ✽.Then user should be see email sent response message(C:/Users/Parul Gulati/eclipse-workspace/Swym/src/main/java/features/productPage.feature:14)\r\n",
  "status": "pending"
});
});
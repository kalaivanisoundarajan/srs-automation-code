$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Add_To_Cart.feature");
formatter.feature({
  "name": "Add to Cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REGRESSION"
    },
    {
      "name": "@SMOKE"
    }
  ]
});
formatter.scenario({
  "name": "Add a Product to Cart in https://www.bigbasket.com/",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REGRESSION"
    },
    {
      "name": "@SMOKE"
    },
    {
      "name": "@Add_to_Cart"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"https://www.bigbasket.com/\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user navigates to Green Tea section",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user search for Tea Brand",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user selects first and last brands",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user get count of products listed in the View",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user get the price first product from the View",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user change quanity for adding item to cart",
  "rows": [
    {
      "cells": [
        "Quantity"
      ]
    },
    {
      "cells": [
        "2"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify success banner message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on My Basket link",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify product is added successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify product price is updated successfully on Summary items",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
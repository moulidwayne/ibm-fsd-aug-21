"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customer_1 = require("./Customer");
var myCustomer = new Customer_1.Customer('John', 'Doe', 'john@email.com');
console.log(myCustomer.firstName + " " + myCustomer.lastName + " " + myCustomer.email);

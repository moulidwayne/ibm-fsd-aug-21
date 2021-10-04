"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Customer = void 0;
var Customer = /** @class */ (function () {
    function Customer(_firstName, _lastName, _email) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._email = _email;
    }
    Object.defineProperty(Customer.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "email", {
        get: function () {
            return this._email;
        },
        set: function (value) {
            this._email = value;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
exports.Customer = Customer;
/*let myCustomer=new Customer('A','B',"C");
let myCustomer1=new Customer('Marry','Public','marry@email.com');
console.log(myCustomer1.firstName+" "+myCustomer1.lastName+" "+myCustomer1.email);

console.log(myCustomer.firstName+" "+myCustomer.lastName+" "+myCustomer.email);

myCustomer.firstName='John';
myCustomer.lastName='Doe';
myCustomer.email='john@email.com'
console.log(myCustomer.firstName+" "+myCustomer.lastName+" "+myCustomer.email);*/ 

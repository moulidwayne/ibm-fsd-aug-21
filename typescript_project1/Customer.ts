export class Customer
{
    
    constructor(private _firstName:string,private _lastName:string,private _email:string){}

    public get firstName(): string {
        return this._firstName;
    }
    public set firstName(value: string) {
        this._firstName = value;
    }
    public get lastName(): string {
        return this._lastName;
    }
    public set lastName(value: string) {
        this._lastName = value;
    }
    public get email(): string {
        return this._email;
    }
    public set email(value: string) {
        this._email = value;
    }

   /* constructor(theFirstName:string,theLastName:string,theEmail:string)
    {
        this.firstName=theFirstName;
        this.lastName=theLastName;
        this.email=theEmail;
    }*/

    /*constructor(private firstName:string,private lastName:string,private email:string){}*/

  

}

/*let myCustomer=new Customer('A','B',"C");
let myCustomer1=new Customer('Marry','Public','marry@email.com');
console.log(myCustomer1.firstName+" "+myCustomer1.lastName+" "+myCustomer1.email);

console.log(myCustomer.firstName+" "+myCustomer.lastName+" "+myCustomer.email);

myCustomer.firstName='John';
myCustomer.lastName='Doe';
myCustomer.email='john@email.com'
console.log(myCustomer.firstName+" "+myCustomer.lastName+" "+myCustomer.email);*/
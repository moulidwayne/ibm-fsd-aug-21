const express=require('express');
const app=express();
app.use(express.json());
const adminRoute=require('./routes/admin');
const customerRoute=require('./routes/customerAdmin');
app.use(adminRoute);
app.use(customerRoute);
const port = process.env.PORT || 3000;

app.listen(port, () => 
    console.log(`Listening on port ${port}...`));
  
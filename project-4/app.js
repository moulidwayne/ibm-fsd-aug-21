const express=require('express');
const app=express();
const adminRoute=require('./routes/admin');
app.use(adminRoute);
const port = process.env.PORT || 3000;

app.listen(port, () => 
    console.log(`Listening on port ${port}...`));
  
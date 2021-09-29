const express=require('express');
const app=express();
app.use(express.json());
const customers=require('../model/customers');
const router = express.Router();

router.get('/api/customers', (req, res, next) => {
  res.send(customers);
});
module.exports=router;
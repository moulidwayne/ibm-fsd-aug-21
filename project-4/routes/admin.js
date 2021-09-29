const express=require('express');
const app=express();
app.use(express.json());
const genres=require('./model/genres');
const router = express.Router();

router.get('/api/genres', (req, res, next) => {
  res.send(genres);
});
module.exports=router;
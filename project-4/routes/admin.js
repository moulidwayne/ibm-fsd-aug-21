const express=require('express');
const app=express();
app.use(express.json());
const genres=require('../model/genres');
const router = express.Router();
module.exports=genres;
router.get('/api/genres', (req, res, next) => {
  res.send(genres);
});
router.post('/api/genres',(req,res)=>{
    const genre = {
        id: genres.length + 1,
        name: req.body.name
      };
    console.log(genre);
    genres.push(genre);
    res.send(genres);

});
module.exports=router;
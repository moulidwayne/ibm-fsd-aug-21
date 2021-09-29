const Joi = require('joi');
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
    const { error } = validateGenre(req.body); 
  if (error)
  {
    return res.status(400).send(error.details[0].message);
  } 

  const genre = {
        id: genres.length + 1,
        name: req.body.name
      };
    console.log(genre);
    genres.push(genre);
    res.send(genres);

});

function validateGenre(genre) {
    const schema = {
      name: Joi.string().min(3).required()
    };
  
    return Joi.validate(genre, schema);
  }
  
module.exports=router;
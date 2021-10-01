const {Genre, validate} = require('../model/genre');
const mongoose = require('mongoose');
const express = require('express');
const router = express.Router();

router.get('/', async (req, res) => {
  const genres = await Genre.find().sort('name');
  res.send(genres);
});

router.post('/', async (req, res) => {
  const { error } = validate(req.body); 
  if (error) return res.status(400).send(error.details[0].message);

  let genre = new Genre({ name: req.body.name });
  genre = await genre.save();
  
  res.send(genre);
});

router.put('/:id', async (req, res) => {
  const { error } = validate(req.body); 
  if (error) return res.status(400).send(error.details[0].message);
var genre=null;
   
try {
  genre = await Genre.findByIdAndUpdate(req.params.id, { name: req.body.name });
} catch (error) {
  return res.status(404).send('The genre with the given ID was not found.');
}
 
  
  res.send(genre);
});

router.delete('/:id', async (req, res) => {
  var genre = null;
  
try {
  genre = await Genre.findByIdAndRemove(req.params.id);
} catch (error) {
  return res.status(404).send('The genre with the given ID was not found.');
}
  

  res.send(genre);
});

router.get('/:id', async (req, res) => {
  var genre =null;
  try {
    genre=await Genre.findById(req.params.id);
  } catch (error) {
    return res.status(404).send('The genre with the given ID was not found.');
  }

 

  res.send(genre);
});

module.exports = router;
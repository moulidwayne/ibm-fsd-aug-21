const express = require('express');

const router = express.Router();

router.get('/', (req, res, next) => {
  res.send('<h1>Hello from Express!</h1><br/><a href="/admin/add-product">Add A New Product</a>');
});

module.exports = router;

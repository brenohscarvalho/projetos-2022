const express = require('express');
const carRouter = express.Router();
const buscarCarroIdeal = require('../controllers/Buscar_carro_ideal')
const autenticarUsuario = require('../middlewares/Autenticar_usuario')
const favoritarCarro = require('../controllers/Favoritar_carro')
const listarCarrosFavoritos = require('../controllers/Listar_carros_favoritos')
const buscarCarrosPopulares = require('../controllers/Carros_populares')
const buscarTodosOsCarros = require('../controllers/Buscar_Tudo')

carRouter.post('/carro_ideal',autenticarUsuario, buscarCarroIdeal)
carRouter.post('/carro/favoritar',autenticarUsuario,favoritarCarro.favoritar)
carRouter.post('/carro/desfavoritar',autenticarUsuario,favoritarCarro.desfavoritar)
carRouter.get('/carro/favoritos',autenticarUsuario,listarCarrosFavoritos)
carRouter.post('/carro/populares', buscarCarrosPopulares)
carRouter.get('/carro/todos',buscarTodosOsCarros )


module.exports = carRouter;
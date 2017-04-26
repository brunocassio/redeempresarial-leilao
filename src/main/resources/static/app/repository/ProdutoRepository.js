'use strict';

zombieApp.factory('ProdutoRepository', ['Restangular', 'AbstractRepository',
    function (restangular, AbstractRepository) {
        
        function ProdutoRepository() {
            AbstractRepository.call(this, restangular, '/globo');

            this.listarProdutos = function () {
                return restangular.one(this.route + '/executar').get();
            };

            this.fetchesAllSurvivors = function () {
                return restangular.one(this.route + '/people').get();
            };

            this.fecthSingleSurvivor = function (idSurvivor) {
                return restangular.one(this.route + '/people/' + idSurvivor).get();
            };

            this.registerNewSurvivor = function (survivor) {
                return restangular.all(this.route + '/people').post(survivor);
            };

            this.updateLastLocation = function (idSurvivor, lastLocation) {
                return restangular.one(this.route + '/people/' + idSurvivor).patch({lonlat: lastLocation});
            };

            this.registerInfectedPerson = function (suspectId, yourId) {
                return restangular
                    .all(this.route + '/people/' + yourId + '/report_infection')
                    .customPOST(undefined , undefined, {infected: suspectId}, {});
            }
        }

        AbstractRepository.extend(ProdutoRepository);

        return new ProdutoRepository();
    }]);


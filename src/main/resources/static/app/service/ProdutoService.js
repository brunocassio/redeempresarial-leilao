'user strict';

zombieApp.service('ProdutoService', ['ProdutoRepository',
    function (ProdutoRepository) {

        return {
            listarProdutos: function () {
                return ProdutoRepository.listarProdutos();
            },
            fetchesAllSurvivors: function () {
                return PeopleRepository.fetchesAllSurvivors();
            },
            fecthSingleSurvivor: function (idSurvivor) {
                return PeopleRepository.fecthSingleSurvivor(idSurvivor);
            },
            registerNewSurvivor: function (survivor) {
                return PeopleRepository.registerNewSurvivor(survivor);
            },
            updateLastLocation: function (idSurvivor, lastLocation) {
                return PeopleRepository.updateLastLocation(idSurvivor, lastLocation);
            },
            registerInfectedPerson: function (suspectId, yourId) {
                return PeopleRepository.registerInfectedPerson(suspectId, yourId);
            }
        }
    }]);
'use strict';

zombieApp.config(['RestangularProvider',
    function (RestangularProvider) {

        //###################### INICIO DA CONFIGURAÇÃO DO RESTANGULAR PARA URL BASE E SUFIX ######################
        // RestangularProvider.setBaseUrl('http://zssn-backend-example.herokuapp.com');
        RestangularProvider.setBaseUrl('http://localhost:8080');
        RestangularProvider.setRequestSuffix('.json');
        //###################### FINAL DA CONFIGURAÇÃO DO RESTANGULAR PARA URL BASE E SUFIX #######################

    }]);

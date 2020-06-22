(function () {
    'use strict';

    angular
        .module('app')
        .controller('dataController', dataController);

    dataController.$inject = ['$http'];

    function dataController($http) {
        var vm = this;

        vm.data = [];
        vm.getAll = getAll;

        init();

        function init(){
            getAll();
        }

        function getAll(){
            var url = "/getData";
            var dataPromise = $http.get(url);
            dataPromise.then(function(response){
                vm.data = response.data;
            });
        }

    }
})();

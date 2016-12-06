/**
 * Created by badre on 05/12/2016.
 */
myApp.filter('trusted', function($sce){
    return function(html){
        return $sce.trustAsHtml(html)
    }
});

myApp.directive("richtext", function() {
    return {
        restrict: 'A',
        scope: {
            'model': '='
        },
        compile: function (elem, attrs) {
            return function (scope, elem, attrs) {
                $("#" + attrs.id).jqte({
                    change: function () {
                        scope.$apply(function () {
                            scope.model = $(".jqte_editor").jqteVal();
                        });

                    }
                });
            }


        }
    }

});

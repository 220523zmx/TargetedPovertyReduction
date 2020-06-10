$(function(){
    console.log("hello")
    getrenshubi()
})
$(".submit").on("click",function (){
    postcondiction()

})
function postcondiction() {
    var education = $(".se_education").val()
    var health = $(".se_health").val()
    var labor = $(".se_labor").val()
    var rural = $(".se_rural").val()
    console.log(education,health,labor,rural)

}
function getrenshubi(){
    $.ajax({
        url : "./a",
        type : 'GET',
        success : function(data) {
            console.log("成功");
        },
        error : function(data) {
            console.log("失败",data);
        }
    });

}
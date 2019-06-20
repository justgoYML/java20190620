var delId;
function bmi_delete(bmiid){
    alert("delete"+bmiid);
    delId = bmiid;
    var url = "http://localhost:8080/bmi?action=delete&id="+bmiid;
    myAjax("GET",url,true,null,sucess,myError2);
}

function sucess(msg){
    if(msg =="success"){
        alert("删除成功！");
    //    局部更新列表
        var tb =  document.getElementById("table_history");
        var delTr = document.getElementById(delId);
        tb.removeChild(delTr);//删除页面的行
    }

}
function myError2(){
    alert("failture");
}
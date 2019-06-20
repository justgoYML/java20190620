

function Cal(){
    alert("cal");
//    获取表单输入的数据
    var h  = document.getElementById("height").value;
    var w = document.getElementById("weight").value;
    var genders = document.getElementsByName("sex");
    var gender ;
    for(var i = 0;i<genders.length;i++){
       if( genders[i].checked){
           gender = genders[i].id;
       }
    }
   var idea_w = (h- 80)*0.7;
    h = h/100;
    alert(h);
    var bmi = w / (h * h);//计算bmi
    bmi = Math.round(bmi*100)/100;//浮点值转整形
    var bmi_result_photo =  document.getElementById("bmi_result_photo");
   var  bmi_result_value=  document.getElementById("bmi_result_value");
    bmi_result_idealweight =   document.getElementById("bmi_result_idealweight");
    bmi_result_idealweight.innerText = idea_w;

    if(gender == "female"){
        if(bmi<20.5){
            bmi_result_photo.src = "img/3_01_01.jpg";
        }else if(bmi>=20.5 && bmi < 27 ){
            bmi_result_photo.src = "img/3_01_03.jpg";
        }else if(bmi>=27 && bmi < 32 ){
            bmi_result_photo.src = "img/3_01_04.jpg";
        }else if(bmi>=32 ){
            bmi_result_photo.src = "img/3_01_05.jpg";
        }
   }else{
       if(bmi<18.5){
            bmi_result_photo.src = "img/3_01.jpg";
           bmi_result_value.innerText =bmi +" 偏瘦";
           bmi_result_value.style.background ="rgb( 135, 206, 250)";
           bmi_result_idealweight.style.background ="rgb( 135, 206, 250)";
       }else if(bmi>=18.5 && bmi < 25 ){
           bmi_result_photo.src = "img/3_02.jpg";
           bmi_result_value.innerText =bmi +" 正常";
           bmi_result_value.style.background ="rgb(180, 238, 180)";
           bmi_result_idealweight.style.background ="rgb(180, 238, 180)";
       }else if(bmi>=25 && bmi < 30 ){
           bmi_result_photo.src = "img/3_03.jpg";
           bmi_result_value.innerText =bmi +" 过重";
           bmi_result_value.style.background ="gold";
           bmi_result_idealweight.style.background ="gold";
       }else if(bmi>=30 ){
           bmi_result_photo.src = "img/3_04.jpg";
           bmi_result_value.innerText =bmi +" 肥胖";
           bmi_result_value.style.background ="rgb(238, 99, 99)";
           bmi_result_idealweight.style.background ="rgb(238, 99, 99)";
       }
   }

   // h\w\bmi
   var d = new Date();
  var sign = d .getTime();
  var mydate = d.getFullYear()+"-"+(d.getMonth()+1);
  //var username = "j1902";
    var url = "http://localhost:8080/bmi?action=add&h="+h+"&w="+w+"&bmi="+bmi+"&mydate="+mydate+"&sign="+sign;
   alert(url);
    myAjax("GET",url,true,null,modifyList,myError2);

}

function modifyList(){
    alert("在列表中添加一行记录")
}

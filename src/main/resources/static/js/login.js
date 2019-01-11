function submitForm(){
    $('#ff').form('submit',{
        url:'/dologin',
        onSubmit:function(){
            return $(this).form('enableValidation').form('validate');
        },
        success:function (msg) {
            var data=$.parseJSON(msg);
            if(data.success){
                window.location.href=data.message;
            }else{
                alert(data.message);
            }
        }
    });
}
function clearForm(){
    $('#ff').form('clear');
}
$(function () {

    $('.layout-panel-west a').attr('href','javascript:void(0);');

    $(".panel-header.accordion-header.accordion-header-selected")
        .removeClass("accordion-header-selected");
    $(".panel-body .accordion-body").css({"padding":0,"width":"auto"});

    $(".layout-split-west li").click(function () {
        $(".layout-split-west li").css("background-color","");
        $(this).css("background-color","#CCE6FF");
        // 添加一个新的标签页面板（tab panel）
        if(!$('#tt').tabs('exists',$(this).text())){
            if($(this).text()=="部门人员信息"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/user',
                    closable:true
                });
            }else if($(this).text()=="文库管理"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/library',
                    closable:true
                });
            } else{
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    content:$(this).text(),
                    closable:true
                });
            }
        }else{
            $('#tt').tabs('select',$(this).text());
        }
    });
})
function removePanel() {
    if($('.tabs-selected').text()!='主页')
        var tab = $('#tt').tabs('close',$('.tabs-selected').text());
}
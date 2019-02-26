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
                    href:'/employees',
                    closable:true
                });
            } else if($(this).text()=="部门组织结构"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/structure',
                    closable:true
                });
            } else if($(this).text()=="部门管理制度"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/systems',
                    closable:true
                });
            } else if($(this).text()=="待处理检测申请"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/sampleTestReq',
                    closable:true
                });
            }  else if($(this).text()=="已处理检测申请"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/processedReq',
                    closable:true
                });
            } else if($(this).text()=="文库管理"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/library',
                    closable:true
                });
            } else if($(this).text()=="设备详情"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/equipment',
                    closable:true
                });
            }else if($(this).text()=="部门考核"){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/assess',
                    closable:true
                });
            } else if($(this).text()=='技术文档'){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/technicalDoc',
                    closable:true
                });
            } else if($(this).text()=='质量文件'){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/qualityDoc',
                    closable:true
                });
            } else if($(this).text()=='检验标准'){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/inspectionStandardsDoc',
                    closable:true
                });
            }else if($(this).text()=='报废记录'){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/scrap',
                    closable:true
                });
            } else if($(this).text()=='维修记录'){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/maintain',
                    closable:true
                });
            }else if($(this).text()=='保养记录'){
                $('#tt').tabs('add',{
                    title:$(this).text(),
                    cache:true,
                    href:'/maintenance',
                    closable:true
                });
            }else{
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

function RefreshCloudHomePageTab(title) {
    if ($("#tt").tabs('exists', title)) {
        window.top.Refresh_CloudHomePage_Content.call();
    }
}
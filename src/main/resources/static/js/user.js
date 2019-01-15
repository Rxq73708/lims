$(function(){
    var sex=[{'value':'男','text':'男'},{'value':'女','text':'女'}];
    //edatagrid加载配置
    $('#dg').edatagrid({
        url:'user/list',
        saveUrl:'user/add',
        updateUrl:'user/modify',
        destroyUrl:'user/delete',
        fit:false,
        title:'用户信息',
        toolbar:'#toolbar',
        pagination:true,
        idField:'id',
        rownumbers:true,
        fitColumns:true,
        singleSelect:true,
        remoteSort:false,
        sortName:'id',
        sortOrder:'asc',
        //各行换色
        /*rowStyler: function(index,row){
            if ((index % 2)==0){
                return 'background-color:rgb(233,241,254)';
            }
        },*/
        //删除时消息提示
        destroyMsg:{
            norecord:{	// when no record is selected
                title:'警告',
                msg:'没有选中要删除的用户'
            },
            confirm:{	// when select a row
                title:'删除',
                msg:'你真的要删除该用户吗？'
            }
        }
    });

    //设置分页控件
    var p=$('#dg').edatagrid('getPager');
    $(p).pagination({
        pageSize:10,
        pageList:[5,10,15],
        beforePageText:'第',
        afterPageText:'页    共{pages}页',
        displayMsg:'当前显示 {from} - {to} 条记录  共 {total} 条记录'
    });
});
//查询方法
// function doSearch(){
//     $('#dg').datagrid('load',{
//         searchName: $('#searchName').val()
//     });
// }


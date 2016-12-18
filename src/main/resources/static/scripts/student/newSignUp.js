/**
 * Created by crazyacking on 2016-12-18.
 */
$(function(){
    $('#form_signUp').validator({
        rules: {
            mobile : [/^1\d{10}$/, '手机格式不正确'],
            stuName : [/[\u4E00-\u9FA5\uF900-\uFA2D]{2,10}/,'请填写你的中文名字'],
            qq : [/^[1-9][0-9]{4,15}$/,'QQ格式不正确'],
            weiChart : [/^[a-zA-Zd0-9_]{5,}$/,'微信格式不正确'],
            address : [/[\u4E00-\u9FA5\uF900-\uFA2D]{2,}/,'请填写你家地址']
        },
        fields: {
            'stuName': 'required; stuName;',
            'contactor': 'required; stuName;',
            'phone': 'required; mobile;',
            'qq': 'qq;',
            'weiChart': 'weiChart;',
            'address': 'address;'
        },
        valid: function(form){
            var paramData = {
                'stuName' : $('#stuName').val(),
                'signUpKey' : $('#signUpKey').val(),
                'contactor' : $('#contactor').val(),
                'phone' : $('#phone').val(),
                'qq' : $('#qq').val(),
                'weiChart' : $('#weiChart').val(),
                'address' : $('#address').val()
            }
            $.ajax({
                url : '/signUp/addNewSignUp.json',
                type : 'POST',
                data : JSON.stringify(paramData),
                contentType: 'application/json',
                dataType : 'json',
                success : function(data){
                    if(data.success){
                        window.location.href = '/page/signUpList/1,10,0.html';
                    } else {
                        console.log("添加失败")
                    }
                }
            });
        }
    })
})

/**
 * @author : crazyacking
 * @date : 2016-12-18
 */
$(function(){
    /**
     * @author : wuyue
     * @date : 2016-12-18
     *
     * 点击查询事件
     *
     */
    $('.but_search').click(function(){
        window.location.href = returnUrl();
    });

});

/**
 * @author : wuyue
 * @date : 2016-12-18
 *
 * 返回URL
 *
 * @returns {string}
 */
function returnUrl(){
    var stuName = $('input[name="stuName"]').val();
    if(AnAnUtil.isEmpty(stuName)) stuName = "0";
    stuName = encodeURI(stuName);

    var url = '/page/signUpList/1,10,' + stuName + '.html';
    return url;
}

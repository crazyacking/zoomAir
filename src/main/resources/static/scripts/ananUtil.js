/**
 * Created by crazyacking on 2016-12-18.
 */
var AnAnUtil = {
    /**
     * @author : crazyacking
     * @date : 2016-12-18
     *
     * 判断字符串是否为空
     *
     * @param str
     * @returns {boolean}
     */
    isEmpty : function(str){
        if(str == '' || str == null || str == undefined || str == 'undefined'){
            return true;
        }
        return false;
    }

};
(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yundongbaogaojilu/add-or-update"],{1125:function(n,e,r){"use strict";r.r(e);var t=r("ddb1"),a=r("15d7");for(var i in a)"default"!==i&&function(n){r.d(e,n,(function(){return a[n]}))}(i);r("d826");var u,o=r("f0c5"),c=Object(o["a"])(a["default"],t["b"],t["c"],!1,null,"8aaef9f8",null,!1,t["a"],u);e["default"]=c.exports},"15d7":function(n,e,r){"use strict";r.r(e);var t=r("824f"),a=r.n(t);for(var i in t)"default"!==i&&function(n){r.d(e,n,(function(){return t[n]}))}(i);e["default"]=a.a},"424b":function(n,e,r){},"4d3b":function(n,e,r){"use strict";(function(n){r("53bd");t(r("66fd"));var e=t(r("1125"));function t(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,r("543d")["createPage"])},"824f":function(n,e,r){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var t=a(r("a34a"));function a(n){return n&&n.__esModule?n:{default:n}}function i(n,e,r,t,a,i,u){try{var o=n[i](u),c=o.value}catch(s){return void r(s)}o.done?e(c):Promise.resolve(c).then(t,a)}function u(n){return function(){var e=this,r=arguments;return new Promise((function(t,a){var u=n.apply(e,r);function o(n){i(u,t,a,o,c,"next",n)}function c(n){i(u,t,a,o,c,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("f6bd"))}.bind(null,r)).catch(r.oe)},c={data:function(){return{cross:"",ruleForm:{baogaomingcheng:"",yundongdidian:"",yundongshizhang:"",yundongtupian:"",yundongneirong:"",baogaoneirong:"",jiluriqi:"",beizhu:"",xuehao:"",xingming:"",banji:"",jiaoshixingming:"",userid:""},user:{},ro:{baogaomingcheng:!1,yundongdidian:!1,yundongshizhang:!1,yundongtupian:!1,yundongneirong:!1,baogaoneirong:!1,jiluriqi:!1,beizhu:!1,xuehao:!1,xingming:!1,banji:!1,jiaoshixingming:!1,userid:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(e){var r=this;return u(t.default.mark((function a(){var i,u,o,c;return t.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return i=n.getStorageSync("nowTable"),a.next=3,r.$api.session(i);case 3:if(u=a.sent,r.user=u.data,r.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(r.ruleForm.refid=e.refid,r.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){a.next=13;break}return r.ruleForm.id=e.id,a.next=11,r.$api.info("yundongbaogaojilu",r.ruleForm.id);case 11:u=a.sent,r.ruleForm=u.data;case 13:if(r.cross=e.cross,!e.cross){a.next=73;break}o=n.getStorageSync("crossObj"),a.t0=t.default.keys(o);case 17:if((a.t1=a.t0()).done){a.next=73;break}if(c=a.t1.value,"baogaomingcheng"!=c){a.next=23;break}return r.ruleForm.baogaomingcheng=o[c],r.ro.baogaomingcheng=!0,a.abrupt("continue",17);case 23:if("yundongdidian"!=c){a.next=27;break}return r.ruleForm.yundongdidian=o[c],r.ro.yundongdidian=!0,a.abrupt("continue",17);case 27:if("yundongshizhang"!=c){a.next=31;break}return r.ruleForm.yundongshizhang=o[c],r.ro.yundongshizhang=!0,a.abrupt("continue",17);case 31:if("yundongtupian"!=c){a.next=35;break}return r.ruleForm.yundongtupian=o[c],r.ro.yundongtupian=!0,a.abrupt("continue",17);case 35:if("yundongneirong"!=c){a.next=39;break}return r.ruleForm.yundongneirong=o[c],r.ro.yundongneirong=!0,a.abrupt("continue",17);case 39:if("baogaoneirong"!=c){a.next=43;break}return r.ruleForm.baogaoneirong=o[c],r.ro.baogaoneirong=!0,a.abrupt("continue",17);case 43:if("jiluriqi"!=c){a.next=47;break}return r.ruleForm.jiluriqi=o[c],r.ro.jiluriqi=!0,a.abrupt("continue",17);case 47:if("beizhu"!=c){a.next=51;break}return r.ruleForm.beizhu=o[c],r.ro.beizhu=!0,a.abrupt("continue",17);case 51:if("xuehao"!=c){a.next=55;break}return r.ruleForm.xuehao=o[c],r.ro.xuehao=!0,a.abrupt("continue",17);case 55:if("xingming"!=c){a.next=59;break}return r.ruleForm.xingming=o[c],r.ro.xingming=!0,a.abrupt("continue",17);case 59:if("banji"!=c){a.next=63;break}return r.ruleForm.banji=o[c],r.ro.banji=!0,a.abrupt("continue",17);case 63:if("jiaoshixingming"!=c){a.next=67;break}return r.ruleForm.jiaoshixingming=o[c],r.ro.jiaoshixingming=!0,a.abrupt("continue",17);case 67:if("userid"!=c){a.next=71;break}return r.ruleForm.userid=o[c],r.ro.userid=!0,a.abrupt("continue",17);case 71:a.next=17;break;case 73:r.styleChange();case 74:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},jiluriqiChange:function(n){this.ruleForm.jiluriqi=n.target.value,this.$forceUpdate()},yundongtupianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.yundongtupian="upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return u(t.default.mark((function r(){var a,i,u,o,c,s,g,d,l,f;return t.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(e.ruleForm.baogaomingcheng){r.next=3;break}return e.$utils.msg("报告名称不能为空"),r.abrupt("return");case 3:if(!e.cross){r.next=19;break}if(o=n.getStorageSync("statusColumnName"),c=n.getStorageSync("statusColumnValue"),""==o){r.next=19;break}if(s=n.getStorageSync("crossObj"),o.startsWith("[")){r.next=15;break}for(g in s)g==o&&(s[g]=c);return d=n.getStorageSync("crossTable"),r.next=13,e.$api.update("".concat(d),s);case 13:r.next=19;break;case 15:a=Number(n.getStorageSync("userid")),i=s["id"],u=n.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 19:if(!i||!a){r.next=41;break}return e.ruleForm.crossuserid=a,e.ruleForm.crossrefid=i,l={page:1,limit:10,crossuserid:a,crossrefid:i},r.next=25,e.$api.list("yundongbaogaojilu",l);case 25:if(f=r.sent,!(f.data.total>=u)){r.next=31;break}return e.$utils.msg(n.getStorageSync("tips")),r.abrupt("return",!1);case 31:if(!e.ruleForm.id){r.next=36;break}return r.next=34,e.$api.update("yundongbaogaojilu",e.ruleForm);case 34:r.next=38;break;case 36:return r.next=38,e.$api.add("yundongbaogaojilu",e.ruleForm);case 38:e.$utils.msgBack("提交成功");case 39:r.next=49;break;case 41:if(!e.ruleForm.id){r.next=46;break}return r.next=44,e.$api.update("yundongbaogaojilu",e.ruleForm);case 44:r.next=48;break;case 46:return r.next=48,e.$api.add("yundongbaogaojilu",e.ruleForm);case 48:e.$utils.msgBack("提交成功");case 49:case"end":return r.stop()}}),r)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,r=e.getFullYear(),t=e.getMonth()+1,a=e.getDate();return"start"===n?r-=60:"end"===n&&(r+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(r,"-").concat(t,"-").concat(a)},toggleTab:function(n){this.$refs[n].show()}}};e.default=c}).call(this,r("543d")["default"])},d826:function(n,e,r){"use strict";var t=r("424b"),a=r.n(t);a.a},ddb1:function(n,e,r){"use strict";var t;r.d(e,"b",(function(){return a})),r.d(e,"c",(function(){return i})),r.d(e,"a",(function(){return t}));var a=function(){var n=this,e=n.$createElement;n._self._c},i=[]}},[["4d3b","common/runtime","common/vendor"]]]);
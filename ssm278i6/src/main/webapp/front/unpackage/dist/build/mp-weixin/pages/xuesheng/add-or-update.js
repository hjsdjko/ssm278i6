(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/xuesheng/add-or-update"],{"0c20":function(e,n,r){"use strict";(function(e){r("53bd");t(r("66fd"));var n=t(r("99645"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,r("543d")["createPage"])},"0cdf":function(e,n,r){},2179:function(e,n,r){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=i(r("a34a"));function i(e){return e&&e.__esModule?e:{default:e}}function a(e,n,r,t,i,a,u){try{var o=e[a](u),s=o.value}catch(c){return void r(c)}o.done?n(s):Promise.resolve(s).then(t,i)}function u(e){return function(){var n=this,r=arguments;return new Promise((function(t,i){var u=e.apply(n,r);function o(e){a(u,t,i,o,s,"next",e)}function s(e){a(u,t,i,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("f6bd"))}.bind(null,r)).catch(r.oe)},s={data:function(){return{cross:"",ruleForm:{xuehao:"",xingming:"",mima:"",xingbie:"",shenfenzheng:"",shouji:"",youxiang:"",xueyuan:"",zhuanye:"",banji:"",zhaopian:"",jiaoshixingming:""},xingbieOptions:[],xingbieIndex:0,jiaoshixingmingOptions:[],jiaoshixingmingIndex:0,user:{},ro:{xuehao:!1,xingming:!1,mima:!1,xingbie:!1,shenfenzheng:!1,shouji:!1,youxiang:!1,xueyuan:!1,zhuanye:!1,banji:!1,zhaopian:!1,jiaoshixingming:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var r=this;return u(t.default.mark((function i(){var a,u,o,s;return t.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return a=e.getStorageSync("nowTable"),i.next=3,r.$api.session(a);case 3:return u=i.sent,r.user=u.data,r.xingbieOptions="男,女".split(","),i.next=8,r.$api.option("jiaoshi","jiaoshixingming",{});case 8:if(u=i.sent,r.jiaoshixingmingOptions=u.data,r.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(r.ruleForm.refid=n.refid,r.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){i.next=18;break}return r.ruleForm.id=n.id,i.next=16,r.$api.info("xuesheng",r.ruleForm.id);case 16:u=i.sent,r.ruleForm=u.data;case 18:if(r.cross=n.cross,!n.cross){i.next=74;break}o=e.getStorageSync("crossObj"),i.t0=t.default.keys(o);case 22:if((i.t1=i.t0()).done){i.next=74;break}if(s=i.t1.value,"xuehao"!=s){i.next=28;break}return r.ruleForm.xuehao=o[s],r.ro.xuehao=!0,i.abrupt("continue",22);case 28:if("xingming"!=s){i.next=32;break}return r.ruleForm.xingming=o[s],r.ro.xingming=!0,i.abrupt("continue",22);case 32:if("mima"!=s){i.next=36;break}return r.ruleForm.mima=o[s],r.ro.mima=!0,i.abrupt("continue",22);case 36:if("xingbie"!=s){i.next=40;break}return r.ruleForm.xingbie=o[s],r.ro.xingbie=!0,i.abrupt("continue",22);case 40:if("shenfenzheng"!=s){i.next=44;break}return r.ruleForm.shenfenzheng=o[s],r.ro.shenfenzheng=!0,i.abrupt("continue",22);case 44:if("shouji"!=s){i.next=48;break}return r.ruleForm.shouji=o[s],r.ro.shouji=!0,i.abrupt("continue",22);case 48:if("youxiang"!=s){i.next=52;break}return r.ruleForm.youxiang=o[s],r.ro.youxiang=!0,i.abrupt("continue",22);case 52:if("xueyuan"!=s){i.next=56;break}return r.ruleForm.xueyuan=o[s],r.ro.xueyuan=!0,i.abrupt("continue",22);case 56:if("zhuanye"!=s){i.next=60;break}return r.ruleForm.zhuanye=o[s],r.ro.zhuanye=!0,i.abrupt("continue",22);case 60:if("banji"!=s){i.next=64;break}return r.ruleForm.banji=o[s],r.ro.banji=!0,i.abrupt("continue",22);case 64:if("zhaopian"!=s){i.next=68;break}return r.ruleForm.zhaopian=o[s],r.ro.zhaopian=!0,i.abrupt("continue",22);case 68:if("jiaoshixingming"!=s){i.next=72;break}return r.ruleForm.jiaoshixingming=o[s],r.ro.jiaoshixingming=!0,i.abrupt("continue",22);case 72:i.next=22;break;case 74:r.styleChange();case 75:case"end":return i.stop()}}),i)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},jiaoshixingmingChange:function(e){this.jiaoshixingmingIndex=e.target.value,this.ruleForm.jiaoshixingming=this.jiaoshixingmingOptions[this.jiaoshixingmingIndex]},zhaopianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.zhaopian="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(t.default.mark((function r(){var i,a,u,o,s,c,g,l,f,x;return t.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(n.ruleForm.xuehao){r.next=3;break}return n.$utils.msg("学号不能为空"),r.abrupt("return");case 3:if(n.ruleForm.xingming){r.next=6;break}return n.$utils.msg("姓名不能为空"),r.abrupt("return");case 6:if(n.ruleForm.mima){r.next=9;break}return n.$utils.msg("密码不能为空"),r.abrupt("return");case 9:if(!n.ruleForm.shenfenzheng||n.$validate.checkIdCard(n.ruleForm.shenfenzheng)){r.next=12;break}return n.$utils.msg("身份证应输入身份证格式"),r.abrupt("return");case 12:if(!n.ruleForm.shouji||n.$validate.isMobile(n.ruleForm.shouji)){r.next=15;break}return n.$utils.msg("手机应输入手机格式"),r.abrupt("return");case 15:if(!n.ruleForm.youxiang||n.$validate.isEmail(n.ruleForm.youxiang)){r.next=18;break}return n.$utils.msg("邮箱应输入邮件格式"),r.abrupt("return");case 18:if(!n.cross){r.next=34;break}if(o=e.getStorageSync("statusColumnName"),s=e.getStorageSync("statusColumnValue"),""==o){r.next=34;break}if(c=e.getStorageSync("crossObj"),o.startsWith("[")){r.next=30;break}for(g in c)g==o&&(c[g]=s);return l=e.getStorageSync("crossTable"),r.next=28,n.$api.update("".concat(l),c);case 28:r.next=34;break;case 30:i=Number(e.getStorageSync("userid")),a=c["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 34:if(!a||!i){r.next=56;break}return n.ruleForm.crossuserid=i,n.ruleForm.crossrefid=a,f={page:1,limit:10,crossuserid:i,crossrefid:a},r.next=40,n.$api.list("xuesheng",f);case 40:if(x=r.sent,!(x.data.total>=u)){r.next=46;break}return n.$utils.msg(e.getStorageSync("tips")),r.abrupt("return",!1);case 46:if(!n.ruleForm.id){r.next=51;break}return r.next=49,n.$api.update("xuesheng",n.ruleForm);case 49:r.next=53;break;case 51:return r.next=53,n.$api.add("xuesheng",n.ruleForm);case 53:n.$utils.msgBack("提交成功");case 54:r.next=64;break;case 56:if(!n.ruleForm.id){r.next=61;break}return r.next=59,n.$api.update("xuesheng",n.ruleForm);case 59:r.next=63;break;case 61:return r.next=63,n.$api.add("xuesheng",n.ruleForm);case 63:n.$utils.msgBack("提交成功");case 64:case"end":return r.stop()}}),r)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,r=n.getFullYear(),t=n.getMonth()+1,i=n.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),t=t>9?t:"0"+t,i=i>9?i:"0"+i,"".concat(r,"-").concat(t,"-").concat(i)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,r("543d")["default"])},"2b4c":function(e,n,r){"use strict";var t;r.d(n,"b",(function(){return i})),r.d(n,"c",(function(){return a})),r.d(n,"a",(function(){return t}));var i=function(){var e=this,n=e.$createElement;e._self._c},a=[]},3938:function(e,n,r){"use strict";var t=r("0cdf"),i=r.n(t);i.a},99645:function(e,n,r){"use strict";r.r(n);var t=r("2b4c"),i=r("faa0");for(var a in i)"default"!==a&&function(e){r.d(n,e,(function(){return i[e]}))}(a);r("3938");var u,o=r("f0c5"),s=Object(o["a"])(i["default"],t["b"],t["c"],!1,null,"b3856d60",null,!1,t["a"],u);n["default"]=s.exports},faa0:function(e,n,r){"use strict";r.r(n);var t=r("2179"),i=r.n(t);for(var a in t)"default"!==a&&function(e){r.d(n,e,(function(){return t[e]}))}(a);n["default"]=i.a}},[["0c20","common/runtime","common/vendor"]]]);
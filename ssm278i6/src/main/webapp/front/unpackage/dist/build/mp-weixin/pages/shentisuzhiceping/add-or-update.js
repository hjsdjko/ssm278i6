(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/shentisuzhiceping/add-or-update"],{"4ba7":function(e,r,n){"use strict";(function(e){n("53bd");t(n("66fd"));var r=t(n("c9a0"));function t(e){return e&&e.__esModule?e:{default:e}}e(r.default)}).call(this,n("543d")["createPage"])},"5e77":function(e,r,n){"use strict";(function(e){Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0;var t=i(n("a34a"));function i(e){return e&&e.__esModule?e:{default:e}}function a(e,r,n,t,i,a,u){try{var o=e[a](u),s=o.value}catch(c){return void n(c)}o.done?r(s):Promise.resolve(s).then(t,i)}function u(e){return function(){var r=this,n=arguments;return new Promise((function(t,i){var u=e.apply(r,n);function o(e){a(u,t,i,o,s,"next",e)}function s(e){a(u,t,i,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([n.e("common/vendor"),n.e("components/w-picker/w-picker")]).then(function(){return resolve(n("f6bd"))}.bind(null,n)).catch(n.oe)},s={data:function(){return{cross:"",ruleForm:{xuehao:"",xingming:"",zhaopian:"",xingbie:"",jiaoshixingming:"",shengao:"",tizhong:"",xuetang:"",xinlv:"",xiongwei:"",xuezhi:"",feihuoliang:"",woli:"",beizhu:"",dengjishijian:"",userid:""},user:{},ro:{xuehao:!1,xingming:!1,zhaopian:!1,xingbie:!1,jiaoshixingming:!1,shengao:!1,tizhong:!1,xuetang:!1,xinlv:!1,xiongwei:!1,xuezhi:!1,feihuoliang:!1,woli:!1,beizhu:!1,dengjishijian:!1,userid:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(r){var n=this;return u(t.default.mark((function i(){var a,u,o,s;return t.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return n.ruleForm.dengjishijian=n.$utils.getCurDate(),a=e.getStorageSync("nowTable"),i.next=4,n.$api.session(a);case 4:if(u=i.sent,n.user=u.data,n.ruleForm.xuehao=n.user.xuehao,n.ro.xuehao=!0,n.ruleForm.xingming=n.user.xingming,n.ro.xingming=!0,n.ruleForm.zhaopian=n.user.zhaopian,n.ro.zhaopian=!0,n.ruleForm.xingbie=n.user.xingbie,n.ro.xingbie=!0,n.ruleForm.jiaoshixingming=n.user.jiaoshixingming,n.ro.jiaoshixingming=!0,n.ruleForm.userid=e.getStorageSync("userid"),r.refid&&(n.ruleForm.refid=r.refid,n.ruleForm.nickname=e.getStorageSync("nickname")),!r.id){i.next=24;break}return n.ruleForm.id=r.id,i.next=22,n.$api.info("shentisuzhiceping",n.ruleForm.id);case 22:u=i.sent,n.ruleForm=u.data;case 24:if(n.cross=r.cross,!r.cross){i.next=96;break}o=e.getStorageSync("crossObj"),i.t0=t.default.keys(o);case 28:if((i.t1=i.t0()).done){i.next=96;break}if(s=i.t1.value,"xuehao"!=s){i.next=34;break}return n.ruleForm.xuehao=o[s],n.ro.xuehao=!0,i.abrupt("continue",28);case 34:if("xingming"!=s){i.next=38;break}return n.ruleForm.xingming=o[s],n.ro.xingming=!0,i.abrupt("continue",28);case 38:if("zhaopian"!=s){i.next=42;break}return n.ruleForm.zhaopian=o[s],n.ro.zhaopian=!0,i.abrupt("continue",28);case 42:if("xingbie"!=s){i.next=46;break}return n.ruleForm.xingbie=o[s],n.ro.xingbie=!0,i.abrupt("continue",28);case 46:if("jiaoshixingming"!=s){i.next=50;break}return n.ruleForm.jiaoshixingming=o[s],n.ro.jiaoshixingming=!0,i.abrupt("continue",28);case 50:if("shengao"!=s){i.next=54;break}return n.ruleForm.shengao=o[s],n.ro.shengao=!0,i.abrupt("continue",28);case 54:if("tizhong"!=s){i.next=58;break}return n.ruleForm.tizhong=o[s],n.ro.tizhong=!0,i.abrupt("continue",28);case 58:if("xuetang"!=s){i.next=62;break}return n.ruleForm.xuetang=o[s],n.ro.xuetang=!0,i.abrupt("continue",28);case 62:if("xinlv"!=s){i.next=66;break}return n.ruleForm.xinlv=o[s],n.ro.xinlv=!0,i.abrupt("continue",28);case 66:if("xiongwei"!=s){i.next=70;break}return n.ruleForm.xiongwei=o[s],n.ro.xiongwei=!0,i.abrupt("continue",28);case 70:if("xuezhi"!=s){i.next=74;break}return n.ruleForm.xuezhi=o[s],n.ro.xuezhi=!0,i.abrupt("continue",28);case 74:if("feihuoliang"!=s){i.next=78;break}return n.ruleForm.feihuoliang=o[s],n.ro.feihuoliang=!0,i.abrupt("continue",28);case 78:if("woli"!=s){i.next=82;break}return n.ruleForm.woli=o[s],n.ro.woli=!0,i.abrupt("continue",28);case 82:if("beizhu"!=s){i.next=86;break}return n.ruleForm.beizhu=o[s],n.ro.beizhu=!0,i.abrupt("continue",28);case 86:if("dengjishijian"!=s){i.next=90;break}return n.ruleForm.dengjishijian=o[s],n.ro.dengjishijian=!0,i.abrupt("continue",28);case 90:if("userid"!=s){i.next=94;break}return n.ruleForm.userid=o[s],n.ro.userid=!0,i.abrupt("continue",28);case 94:i.next=28;break;case 96:n.styleChange();case 97:case"end":return i.stop()}}),i)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},dengjishijianChange:function(e){this.ruleForm.dengjishijian=e.target.value,this.$forceUpdate()},zhaopianTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.zhaopian="upload/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=this;return u(t.default.mark((function n(){var i,a,u,o,s,c,l,g,f,h;return t.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(!r.ruleForm.shengao||r.$validate.isNumber(r.ruleForm.shengao)){n.next=3;break}return r.$utils.msg("身高应输入数字"),n.abrupt("return");case 3:if(!r.ruleForm.tizhong||r.$validate.isNumber(r.ruleForm.tizhong)){n.next=6;break}return r.$utils.msg("体重应输入数字"),n.abrupt("return");case 6:if(!r.ruleForm.xuetang||r.$validate.isNumber(r.ruleForm.xuetang)){n.next=9;break}return r.$utils.msg("血糖应输入数字"),n.abrupt("return");case 9:if(!r.ruleForm.xinlv||r.$validate.isNumber(r.ruleForm.xinlv)){n.next=12;break}return r.$utils.msg("心率应输入数字"),n.abrupt("return");case 12:if(!r.ruleForm.xiongwei||r.$validate.isNumber(r.ruleForm.xiongwei)){n.next=15;break}return r.$utils.msg("胸围应输入数字"),n.abrupt("return");case 15:if(!r.ruleForm.xuezhi||r.$validate.isNumber(r.ruleForm.xuezhi)){n.next=18;break}return r.$utils.msg("血脂应输入数字"),n.abrupt("return");case 18:if(!r.ruleForm.feihuoliang||r.$validate.isNumber(r.ruleForm.feihuoliang)){n.next=21;break}return r.$utils.msg("肺活量应输入数字"),n.abrupt("return");case 21:if(!r.cross){n.next=37;break}if(o=e.getStorageSync("statusColumnName"),s=e.getStorageSync("statusColumnValue"),""==o){n.next=37;break}if(c=e.getStorageSync("crossObj"),o.startsWith("[")){n.next=33;break}for(l in c)l==o&&(c[l]=s);return g=e.getStorageSync("crossTable"),n.next=31,r.$api.update("".concat(g),c);case 31:n.next=37;break;case 33:i=Number(e.getStorageSync("userid")),a=c["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 37:if(!a||!i){n.next=59;break}return r.ruleForm.crossuserid=i,r.ruleForm.crossrefid=a,f={page:1,limit:10,crossuserid:i,crossrefid:a},n.next=43,r.$api.list("shentisuzhiceping",f);case 43:if(h=n.sent,!(h.data.total>=u)){n.next=49;break}return r.$utils.msg(e.getStorageSync("tips")),n.abrupt("return",!1);case 49:if(!r.ruleForm.id){n.next=54;break}return n.next=52,r.$api.update("shentisuzhiceping",r.ruleForm);case 52:n.next=56;break;case 54:return n.next=56,r.$api.add("shentisuzhiceping",r.ruleForm);case 56:r.$utils.msgBack("提交成功");case 57:n.next=67;break;case 59:if(!r.ruleForm.id){n.next=64;break}return n.next=62,r.$api.update("shentisuzhiceping",r.ruleForm);case 62:n.next=66;break;case 64:return n.next=66,r.$api.add("shentisuzhiceping",r.ruleForm);case 66:r.$utils.msgBack("提交成功");case 67:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,n=r.getFullYear(),t=r.getMonth()+1,i=r.getDate();return"start"===e?n-=60:"end"===e&&(n+=2),t=t>9?t:"0"+t,i=i>9?i:"0"+i,"".concat(n,"-").concat(t,"-").concat(i)},toggleTab:function(e){this.$refs[e].show()}}};r.default=s}).call(this,n("543d")["default"])},a655:function(e,r,n){"use strict";n.r(r);var t=n("5e77"),i=n.n(t);for(var a in t)"default"!==a&&function(e){n.d(r,e,(function(){return t[e]}))}(a);r["default"]=i.a},c9a0:function(e,r,n){"use strict";n.r(r);var t=n("ef00"),i=n("a655");for(var a in i)"default"!==a&&function(e){n.d(r,e,(function(){return i[e]}))}(a);n("e65d");var u,o=n("f0c5"),s=Object(o["a"])(i["default"],t["b"],t["c"],!1,null,"76d0c1b4",null,!1,t["a"],u);r["default"]=s.exports},e65d:function(e,r,n){"use strict";var t=n("f61a"),i=n.n(t);i.a},ef00:function(e,r,n){"use strict";var t;n.d(r,"b",(function(){return i})),n.d(r,"c",(function(){return a})),n.d(r,"a",(function(){return t}));var i=function(){var e=this,r=e.$createElement;e._self._c},a=[]},f61a:function(e,r,n){}},[["4ba7","common/runtime","common/vendor"]]]);
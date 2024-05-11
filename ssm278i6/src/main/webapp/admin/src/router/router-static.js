import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import leixing from '@/views/modules/leixing/list'
    import news from '@/views/modules/news/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import yundongbaogaojilu from '@/views/modules/yundongbaogaojilu/list'
    import shentisuzhiceping from '@/views/modules/shentisuzhiceping/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import discusstiyujiaoan from '@/views/modules/discusstiyujiaoan/list'
    import storeup from '@/views/modules/storeup/list'
    import users from '@/views/modules/users/list'
    import xueshengxinlv from '@/views/modules/xueshengxinlv/list'
    import ketangxiaojie from '@/views/modules/ketangxiaojie/list'
    import dianmingce from '@/views/modules/dianmingce/list'
    import tiyujiaoan from '@/views/modules/tiyujiaoan/list'
    import config from '@/views/modules/config/list'
    import jiaoxuepingfen from '@/views/modules/jiaoxuepingfen/list'
    import jiaoxuebisaichengji from '@/views/modules/jiaoxuebisaichengji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/leixing',
        name: '类型',
        component: leixing
      }
      ,{
	path: '/news',
        name: '校园风采',
        component: news
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/yundongbaogaojilu',
        name: '运动报告记录',
        component: yundongbaogaojilu
      }
      ,{
	path: '/shentisuzhiceping',
        name: '身体素质测评',
        component: shentisuzhiceping
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/discusstiyujiaoan',
        name: '体育教案评论',
        component: discusstiyujiaoan
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/xueshengxinlv',
        name: '学生心率',
        component: xueshengxinlv
      }
      ,{
	path: '/ketangxiaojie',
        name: '课堂小结',
        component: ketangxiaojie
      }
      ,{
	path: '/dianmingce',
        name: '点名册',
        component: dianmingce
      }
      ,{
	path: '/tiyujiaoan',
        name: '体育教案',
        component: tiyujiaoan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiaoxuepingfen',
        name: '教学评分',
        component: jiaoxuepingfen
      }
      ,{
	path: '/jiaoxuebisaichengji',
        name: '教学比赛成绩',
        component: jiaoxuebisaichengji
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

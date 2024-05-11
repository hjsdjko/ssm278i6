<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">学号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xuehao" v-model="ruleForm.xuehao" placeholder="学号"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="zhaopianTap" :class='left == "left"?"":"active"'>
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">照片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-if="ruleForm.zhaopian" :src="baseUrl+ruleForm.zhaopian" mode="aspectFill"></image>
					<image :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">性别</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xingbie" v-model="ruleForm.xingbie" placeholder="性别"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">教师姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">身高</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.shengao" v-model="ruleForm.shengao" placeholder="身高"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">体重</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.tizhong" v-model="ruleForm.tizhong" placeholder="体重"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">血糖</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xuetang" v-model="ruleForm.xuetang" placeholder="血糖"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">心率</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xinlv" v-model="ruleForm.xinlv" placeholder="心率"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">胸围</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xiongwei" v-model="ruleForm.xiongwei" placeholder="胸围"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">血脂</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xuezhi" v-model="ruleForm.xuezhi" placeholder="血脂"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">肺活量</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.feihuoliang" v-model="ruleForm.feihuoliang" placeholder="肺活量"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">握力</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.woli" v-model="ruleForm.woli" placeholder="握力"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">备注</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.beizhu" v-model="ruleForm.beizhu" placeholder="备注"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">登记时间</view>
				<picker mode="date" :value="ruleForm.dengjishijian" @change="dengjishijianChange">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.dengjishijian?ruleForm.dengjishijian:"请选择登记时间"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			
			
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","padding":"0","backgroundColor":"rgba(51, 153, 153, 1)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				xuehao: '',
				xingming: '',
				zhaopian: '',
				xingbie: '',
				jiaoshixingming: '',
				shengao: '',
				tizhong: '',
				xuetang: '',
				xinlv: '',
				xiongwei: '',
				xuezhi: '',
				feihuoliang: '',
				woli: '',
				beizhu: '',
				dengjishijian: '',
				userid: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   xuehao : false,
                                   xingming : false,
                                   zhaopian : false,
                                   xingbie : false,
                                   jiaoshixingming : false,
                                   shengao : false,
                                   tizhong : false,
                                   xuetang : false,
                                   xinlv : false,
                                   xiongwei : false,
                                   xuezhi : false,
                                   feihuoliang : false,
                                   woli : false,
                                   beizhu : false,
                                   dengjishijian : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		},
		async onLoad(options) {
    		        this.ruleForm.dengjishijian = this.$utils.getCurDate();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.xuehao = this.user.xuehao
			this.ro.xuehao = true;
			this.ruleForm.xingming = this.user.xingming
			this.ro.xingming = true;
			this.ruleForm.zhaopian = this.user.zhaopian
			this.ro.zhaopian = true;
			this.ruleForm.xingbie = this.user.xingbie
			this.ro.xingbie = true;
			this.ruleForm.jiaoshixingming = this.user.jiaoshixingming
			this.ro.jiaoshixingming = true;



			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`shentisuzhiceping`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='xuehao'){
					this.ruleForm.xuehao = obj[o];
					this.ro.xuehao = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='zhaopian'){
					this.ruleForm.zhaopian = obj[o];
					this.ro.zhaopian = true;
					continue;
					}
					if(o=='xingbie'){
					this.ruleForm.xingbie = obj[o];
					this.ro.xingbie = true;
					continue;
					}
					if(o=='jiaoshixingming'){
					this.ruleForm.jiaoshixingming = obj[o];
					this.ro.jiaoshixingming = true;
					continue;
					}
					if(o=='shengao'){
					this.ruleForm.shengao = obj[o];
					this.ro.shengao = true;
					continue;
					}
					if(o=='tizhong'){
					this.ruleForm.tizhong = obj[o];
					this.ro.tizhong = true;
					continue;
					}
					if(o=='xuetang'){
					this.ruleForm.xuetang = obj[o];
					this.ro.xuetang = true;
					continue;
					}
					if(o=='xinlv'){
					this.ruleForm.xinlv = obj[o];
					this.ro.xinlv = true;
					continue;
					}
					if(o=='xiongwei'){
					this.ruleForm.xiongwei = obj[o];
					this.ro.xiongwei = true;
					continue;
					}
					if(o=='xuezhi'){
					this.ruleForm.xuezhi = obj[o];
					this.ro.xuezhi = true;
					continue;
					}
					if(o=='feihuoliang'){
					this.ruleForm.feihuoliang = obj[o];
					this.ro.feihuoliang = true;
					continue;
					}
					if(o=='woli'){
					this.ruleForm.woli = obj[o];
					this.ro.woli = true;
					continue;
					}
					if(o=='beizhu'){
					this.ruleForm.beizhu = obj[o];
					this.ro.beizhu = true;
					continue;
					}
					if(o=='dengjishijian'){
					this.ruleForm.dengjishijian = obj[o];
					this.ro.dengjishijian = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数

			dengjishijianChange(e) {
				this.ruleForm.dengjishijian = e.target.value;
				this.$forceUpdate();
			},



			zhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
































//跨表计算判断
				if(this.ruleForm.shengao&&(!this.$validate.isNumber(this.ruleForm.shengao))){
					this.$utils.msg(`身高应输入数字`);
					return
				}
				if(this.ruleForm.tizhong&&(!this.$validate.isNumber(this.ruleForm.tizhong))){
					this.$utils.msg(`体重应输入数字`);
					return
				}
				if(this.ruleForm.xuetang&&(!this.$validate.isNumber(this.ruleForm.xuetang))){
					this.$utils.msg(`血糖应输入数字`);
					return
				}
				if(this.ruleForm.xinlv&&(!this.$validate.isNumber(this.ruleForm.xinlv))){
					this.$utils.msg(`心率应输入数字`);
					return
				}
				if(this.ruleForm.xiongwei&&(!this.$validate.isNumber(this.ruleForm.xiongwei))){
					this.$utils.msg(`胸围应输入数字`);
					return
				}
				if(this.ruleForm.xuezhi&&(!this.$validate.isNumber(this.ruleForm.xuezhi))){
					this.$utils.msg(`血脂应输入数字`);
					return
				}
				if(this.ruleForm.feihuoliang&&(!this.$validate.isNumber(this.ruleForm.feihuoliang))){
					this.$utils.msg(`肺活量应输入数字`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						var obj = uni.getStorageSync('crossObj');
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`shentisuzhiceping`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`shentisuzhiceping`, this.ruleForm);
						}else{
							await this.$api.add(`shentisuzhiceping`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`shentisuzhiceping`, this.ruleForm);
					}else{
						await this.$api.add(`shentisuzhiceping`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>

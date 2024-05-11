<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">报告名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.baogaomingcheng" v-model="ruleForm.baogaomingcheng" placeholder="报告名称"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">运动地点</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yundongdidian" v-model="ruleForm.yundongdidian" placeholder="运动地点"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">运动时长</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yundongshizhang" v-model="ruleForm.yundongshizhang" placeholder="运动时长"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="yundongtupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">运动图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-if="ruleForm.yundongtupian" :src="baseUrl+ruleForm.yundongtupian" mode="aspectFill"></image>
					<image :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">记录日期</view>
				<picker mode="date" :value="ruleForm.jiluriqi" @change="jiluriqiChange">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.jiluriqi?ruleForm.jiluriqi:"请选择记录日期"}}</view>
				</picker>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">备注</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.beizhu" v-model="ruleForm.beizhu" placeholder="备注"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">学号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xuehao" v-model="ruleForm.xuehao" placeholder="学号"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">班级</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.banji" v-model="ruleForm.banji" placeholder="班级"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">教师姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">运动内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"20rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.yundongneirong" placeholder="运动内容"></textarea>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">报告内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"20rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.baogaoneirong" placeholder="报告内容"></textarea>
			</view>
			
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
				baogaomingcheng: '',
				yundongdidian: '',
				yundongshizhang: '',
				yundongtupian: '',
				yundongneirong: '',
				baogaoneirong: '',
				jiluriqi: '',
				beizhu: '',
				xuehao: '',
				xingming: '',
				banji: '',
				jiaoshixingming: '',
				userid: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   baogaomingcheng : false,
                                   yundongdidian : false,
                                   yundongshizhang : false,
                                   yundongtupian : false,
                                   yundongneirong : false,
                                   baogaoneirong : false,
                                   jiluriqi : false,
                                   beizhu : false,
                                   xuehao : false,
                                   xingming : false,
                                   banji : false,
                                   jiaoshixingming : false,
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
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取



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
				res = await this.$api.info(`yundongbaogaojilu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='baogaomingcheng'){
					this.ruleForm.baogaomingcheng = obj[o];
					this.ro.baogaomingcheng = true;
					continue;
					}
					if(o=='yundongdidian'){
					this.ruleForm.yundongdidian = obj[o];
					this.ro.yundongdidian = true;
					continue;
					}
					if(o=='yundongshizhang'){
					this.ruleForm.yundongshizhang = obj[o];
					this.ro.yundongshizhang = true;
					continue;
					}
					if(o=='yundongtupian'){
					this.ruleForm.yundongtupian = obj[o];
					this.ro.yundongtupian = true;
					continue;
					}
					if(o=='yundongneirong'){
					this.ruleForm.yundongneirong = obj[o];
					this.ro.yundongneirong = true;
					continue;
					}
					if(o=='baogaoneirong'){
					this.ruleForm.baogaoneirong = obj[o];
					this.ro.baogaoneirong = true;
					continue;
					}
					if(o=='jiluriqi'){
					this.ruleForm.jiluriqi = obj[o];
					this.ro.jiluriqi = true;
					continue;
					}
					if(o=='beizhu'){
					this.ruleForm.beizhu = obj[o];
					this.ro.beizhu = true;
					continue;
					}
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
					if(o=='banji'){
					this.ruleForm.banji = obj[o];
					this.ro.banji = true;
					continue;
					}
					if(o=='jiaoshixingming'){
					this.ruleForm.jiaoshixingming = obj[o];
					this.ro.jiaoshixingming = true;
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

			jiluriqiChange(e) {
				this.ruleForm.jiluriqi = e.target.value;
				this.$forceUpdate();
			},



			yundongtupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.yundongtupian = 'upload/' + res.file;
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
				if((!this.ruleForm.baogaomingcheng)){
					this.$utils.msg(`报告名称不能为空`);
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
					let res = await this.$api.list(`yundongbaogaojilu`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`yundongbaogaojilu`, this.ruleForm);
						}else{
							await this.$api.add(`yundongbaogaojilu`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`yundongbaogaojilu`, this.ruleForm);
					}else{
						await this.$api.add(`yundongbaogaojilu`, this.ruleForm);
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

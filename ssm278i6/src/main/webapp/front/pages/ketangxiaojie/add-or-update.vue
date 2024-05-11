<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">课堂名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.ketangmingcheng" v-model="ruleForm.ketangmingcheng" placeholder="课堂名称"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">意见</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yijian" v-model="ruleForm.yijian" placeholder="意见"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">课堂时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.ketangshijian" placeholder="课堂时间" @tap="toggleTab('ketangshijian')"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">班级</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.banji" v-model="ruleForm.banji" placeholder="班级"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">教师姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">登记时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dengjishijian" placeholder="登记时间" @tap="toggleTab('dengjishijian')"></input>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">课堂内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"20rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.ketangneirong" placeholder="课堂内容"></textarea>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","fontSize":"28rpx","lineHeight":"80rpx","borderStyle":"solid"}' class="title">小结内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"20rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.xiaojieneirong" placeholder="小结内容"></textarea>
			</view>
			
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","padding":"0","backgroundColor":"rgba(51, 153, 153, 1)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="ketangshijianConfirm" ref="ketangshijian" themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="dengjishijianConfirm" ref="dengjishijian" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				ketangmingcheng: '',
				ketangneirong: '',
				xiaojieneirong: '',
				yijian: '',
				ketangshijian: '',
				banji: '',
				jiaoshixingming: '',
				dengjishijian: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   ketangmingcheng : false,
                                   ketangneirong : false,
                                   xiaojieneirong : false,
                                   yijian : false,
                                   ketangshijian : false,
                                   banji : false,
                                   jiaoshixingming : false,
                                   dengjishijian : false,
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
        		this.ruleForm.dengjishijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.banji = this.user.banji
			this.ro.banji = true;
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
				res = await this.$api.info(`ketangxiaojie`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='ketangmingcheng'){
					this.ruleForm.ketangmingcheng = obj[o];
					this.ro.ketangmingcheng = true;
					continue;
					}
					if(o=='ketangneirong'){
					this.ruleForm.ketangneirong = obj[o];
					this.ro.ketangneirong = true;
					continue;
					}
					if(o=='xiaojieneirong'){
					this.ruleForm.xiaojieneirong = obj[o];
					this.ro.xiaojieneirong = true;
					continue;
					}
					if(o=='yijian'){
					this.ruleForm.yijian = obj[o];
					this.ro.yijian = true;
					continue;
					}
					if(o=='ketangshijian'){
					this.ruleForm.ketangshijian = obj[o];
					this.ro.ketangshijian = true;
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
					if(o=='dengjishijian'){
					this.ruleForm.dengjishijian = obj[o];
					this.ro.dengjishijian = true;
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


			// 日长控件选择日期时间
			ketangshijianConfirm(val) {
				console.log(val)
				this.ruleForm.ketangshijian = val.result;
				this.$forceUpdate();
			},
			// 日长控件选择日期时间
			dengjishijianConfirm(val) {
				console.log(val)
				this.ruleForm.dengjishijian = val.result;
				this.$forceUpdate();
			},



			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
















//跨表计算判断
				if((!this.ruleForm.ketangmingcheng)){
					this.$utils.msg(`课堂名称不能为空`);
					return
				}
				if((!this.ruleForm.ketangneirong)){
					this.$utils.msg(`课堂内容不能为空`);
					return
				}
				if((!this.ruleForm.xiaojieneirong)){
					this.$utils.msg(`小结内容不能为空`);
					return
				}
				if((!this.ruleForm.yijian)){
					this.$utils.msg(`意见不能为空`);
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
					let res = await this.$api.list(`ketangxiaojie`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`ketangxiaojie`, this.ruleForm);
						}else{
							await this.$api.add(`ketangxiaojie`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`ketangxiaojie`, this.ruleForm);
					}else{
						await this.$api.add(`ketangxiaojie`, this.ruleForm);
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
